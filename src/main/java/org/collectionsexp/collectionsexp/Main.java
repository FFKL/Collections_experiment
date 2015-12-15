package org.collectionsexp.collectionsexp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User first = new User(1, "Вася", 22, true);
        User second = new User(2, "Маша", 27, false);
        User third = new User(3, "Маша", 28, false);
        User first0 = new User(1, "Вася", 22, true);
        List<User> userList = new ArrayList<User>();
        userList.add(first);
        userList.add(second);
        userList.add(third);
        userList.add(first);
        System.out.println(userList);

        System.out.println(first.equals(first0));
        System.out.println(first.equals(second));

        Map<User, Pet> userMap = new HashMap<User, Pet>();
        Pet cat = new Pet("Vaska", 2);
        Pet dog = new Pet ("Polka", 3);
        Pet cat0 = new Pet("Vaska", 2);
        userMap.put(first, cat);
        userMap.put(second, dog);
        userMap.put(third, cat0);
        userMap.put(first0, dog);
        System.out.println("Get: " + userMap.get(first0));
        System.out.println(dog.equals(dog));
        System.out.println("Size: " + userMap.size());
        System.out.println("ContainsValue " + userMap.containsValue(cat0));
        System.out.println("ContainsKey " + userMap.containsKey(first0));
        System.out.println(userMap);

        Set<User> userSet = new HashSet<User>();
        userSet.add(first);
        userSet.add(second);
        userSet.add(third);
        userSet.add(first0);
        System.out.println(userSet);
        System.out.println(userSet.contains(first0));
    }
}
