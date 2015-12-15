package org.collectionsexp.collectionsexp;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionsTest {
    /**
     * Если не переопределять метод equals() в класе User, то тест не выполнится, так как
     * метод contains() использует equals() для сравнения элементов. Будут сравниваться ссылки на объекты,
     * а не сами объекты.
     * После переопределения equals() с учетом полей объекта тест будет работать корректно.
     * Метод hashCode() не влияет на выполнение данного теста.
     */
    @Test
    public void arrayListTest() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "Дима", 22, true));
        list.add(new User(2, "Маша", 27, false));
        assertTrue(list.contains(new User(2, "Маша", 27, false)));
    }
    /**
     * В HashMap ключи сперва сравниваются по хеш-кодам, а затем по equals().
     * Рассмотрим 2 случая:
     * 1) Только метод equals() не переопределен. Хотя хеш коды равны, замена значений элементов производиться не будет.
     * Элементы будут определяться как различные из-за false проверки equals() ключей.
     * 2) Только метод hashCode() не переопределен. После этого размер HashMap не изменится, по сравнению с первым вариантом.
     * Ключи считаются неравными, т.к. хеш-коды неравны.
     * Для корректной работы необходимо переопределить оба метода.
     */
    @Test
    public void hashMapSet() {
        Map<User, User> map = new HashMap<User, User>();
        map.put(new User(1, "Дима", 22, true), new User(1, "Дима", 22, true));
        map.put(new User(2, "Маша", 27, false), new User(2, "Маша", 27, false));
        map.put(new User(1, "Дима", 22, true), new User(1, "Дима", 22, true));
        assertEquals(2, map.size());
    }
    /**
     * Работы HashSet похожа на работу HashMap. Отличие в том, что ключом в HashSet является сам объект.
     * При положительных проверках на равенство элементов по хеш кодам и equals(), новый элемент не добавляется.
     * В HashSet все элементы уникальны.
     */
    @Test
    public void hashSetTest() {
        Set<User> set = new HashSet<User>();
        set.add(new User(1, "Дима", 22, true));
        set.add(new User(2, "Маша", 27, false));
        set.add(new User(1, "Дима", 22, true));
        assertEquals(2, set.size());
    }
}
