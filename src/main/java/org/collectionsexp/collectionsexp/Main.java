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

        Map<User, Integer> userMap = new HashMap<User, Integer>();
        userMap.put(first, 55);
        userMap.put(second, 66);
        userMap.put(third, 77);
        //userMap.put(first0, 88);
        System.out.println("Get: " + userMap.get(first0));
        System.out.println("Size: " + userMap.size());
        System.out.println("ContainsValue " + userMap.containsValue(88));
        System.out.println("ContainsKey " + userMap.containsKey(first0));

        Set<User> userSet = new HashSet<User>();
        userSet.add(first);
        userSet.add(second);
        userSet.add(third);
        //userSet.add(first0);
        System.out.println(userSet);
        System.out.println(userSet.contains(first0));
    }
}
