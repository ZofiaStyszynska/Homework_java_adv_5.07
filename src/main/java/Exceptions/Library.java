package Exceptions;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
@Getter
public class Library {
    private User user;
    private Set<User> users = new HashSet<>();

    public Set<User> addUser(User user) throws UserAleradyExists{
        if (!users.add(user)) throw new UserAleradyExists("Użytkownik o podanym loginie już istnieje.");
        return users;
    }

    @Override
    public String toString() {
        return "Library{" +
                "user=" + user +
                ", users=" + users +
                '}';
    }
}
