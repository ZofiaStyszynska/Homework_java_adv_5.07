package Exceptions;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.Scanner;

@Getter
public class User {
    private String login;
    private String password;
    private String firstName;
    private String email;
    private LocalDate creationDate;

    private User(String login, String password, String firstName, String email, LocalDate creationDate) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.email = email;
        this.creationDate = creationDate;
    }

    public static User createUser(String login, String password, String firstName, String email) {
        if (StringUtils.isAnyEmpty(login, password, firstName, email)) {
            throw new IllegalArgumentException("Należy wypełnić wszystkie pola");
        }
        if (login.length() < 6) {
            throw new IllegalArgumentException("Login musi posiadać co najmniej sześć znaków.");
        }
        return new User(login, password, firstName, email, LocalDate.now());
    }

    public static String setLogin() {
        Scanner inPut = new Scanner(System.in);
        System.out.println("Podaj swój login:");
        return inPut.next();
    }

    public static String setPassword() {
        Scanner inPut = new Scanner(System.in);
        System.out.println("Podaj swoje hasło:");
        return inPut.next();
    }


    public static String setFirstName() {
        Scanner inPut = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        return inPut.next();
    }

    public static String setEmail() {
        Scanner inPut = new Scanner(System.in);
        System.out.println("Podaj swój email:");
        return inPut.next();
    }
}
