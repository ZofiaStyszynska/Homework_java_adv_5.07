package Exceptions;



import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

import static Exceptions.User.printOut;

public class MainUser {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        User user1 = User.createUser(User.setLogin(),User.setPassword(),User.setFirstName(), User.setEmail());


        System.out.println(" Login: " + user1.getLogin() +
                "\n Hasło: " + user1.getPassword() +
                "\n Imię: "+ user1.getFirstName() +
                "\n email: "+ user1.getEmail()+
                "\n Data: "+ user1.getCreationDate());
        printOut(user1);




    }

    @Override
    public String toString() {
        return super.toString();
    }
}
