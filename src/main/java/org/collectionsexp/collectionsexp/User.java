package org.collectionsexp.collectionsexp;

public class User {

    final int id;
    final String name;
    final int age;
    final boolean sex;

    public User(final int id, final String name, final int age, final boolean sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return " ID: " + id +
                " Имя: " + name +
                " Возраст: " + age +
                " Пол: " + (sex ? "Мужской" : "Женский");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User u = (User) obj;

        if (id != u.id) {
            return false;
        }
        if (name != null ? !(name.equals(u.name)) : (u.name != null)) {
            return false;
        }
        if (age != u.age) {
            return false;
        }
        if (sex != u.sex) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 55;
        result = 31*result + id;
        result = 31*result + name.hashCode();
        result = 31*result + age;
        result = 31*result + (sex ? 1 : 0);
        return result;
    }
}
