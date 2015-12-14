package org.collectionsexp.collectionsexp;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void reflexive() {
        User user = (new User(1, "Дима", 22, true));
        assertEquals(user, user);
    }

    @Test
    public void symmetric() {
        User user1 = (new User(1, "Дима", 22, true));
        User user2 = (new User(1, "Дима", 22, true));
        assertEquals(user1, user2);
        assertEquals(user2, user1);
    }

    @Test
    public void transitive() {
        User user1 = (new User(1, "Дима", 22, true));
        User user2 = (new User(1, "Дима", 22, true));
        User user3 = (new User(1, "Дима", 22, true));
        assertEquals(user1, user2);
        assertEquals(user2, user3);
        assertEquals(user1, user3);
    }

    @Test
    public void consistant() {
        User user1 = (new User(1, "Дима", 22, true));
        User user2 = (new User(1, "Дима", 22, true));
        for (int i = 0; i < 10; ++i)
            assertEquals(user1, user2);
    }

}