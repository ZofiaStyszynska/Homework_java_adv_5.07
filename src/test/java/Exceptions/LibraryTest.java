package Exceptions;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void addUser() throws UserAleradyExists {
        User user1 = User.createUser("Biedronka", "biedronka","Lulu", "lulu@wp.pl");
        User user2 = User.createUser("ZabaBaba", "biedronka","abelard", "lulu@wp.pl");
        User user3 = User.createUser("MieszkoI", "eloiza","Lulu", "lulu@wp.pl");

        Library library = new Library();
        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);

        assertEquals(3,library.getUsers().size());

    }
}