package org.collectionsexp.collectionsexp;

public class Pet {
    String name;
    int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        //return "petName " + name + " age " + age;
        return "" + this.hashCode() + name;
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

        if (name != null ? !(name.equals(u.name)) : (u.name != null)) {
            return false;
        }
        if (age != u.age) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = 31*result + this.name.hashCode();
        result = 31*result + this.age;
        return result;
    }
}
