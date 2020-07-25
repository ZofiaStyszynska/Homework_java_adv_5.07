package Exceptions;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.Objects;
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

    public static User createUser(String login, String password, String firstName, String email) throws NullPointerException{
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
    public static void printOut(User user){
        StringBuilder builder = new StringBuilder();
        builder.append("Dane użytkownika ")
                .append("\nLogin:")
                .append(user.getLogin())
                .append("\nHasło: ")
                .append(user.getPassword())
                .append("\nImię: ")
                .append(user.getFirstName());

        System.out.println(builder.toString());

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
