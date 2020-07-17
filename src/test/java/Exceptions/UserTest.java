package Exceptions;

import junit.framework.TestCase;
import org.assertj.core.api.AbstractAssert;
import org.junit.jupiter.api.BeforeEach;

import java.util.Scanner;

public class UserTest extends TestCase {
    //User user1 = new User("KuluLulu","biedronka","Lucja","lulu@wp.pl");
    User user = User.createUser("KuluLulu","biedronka","Lucja","lulu@wp.pl");
    @BeforeEach
    void setUser(){
        this.user = User.createUser("KuluLulu","biedronka","Lucja","lulu@wp.pl");

    }
    public void testCreateUser() {
//        User user = User.createUser(User.setLogin(),"biedronka","Lucja","lulu@wp.pl");
//        assertEquals();
    }

    public void testSetLogin() {

        Scanner inPut = new Scanner(System.in);
        //String login = Input.next();
        user.setLogin();

        assertNotNull (user.getLogin());

    }

    public void testSetPassword() {
    }

    public void testSetFirstName() {
    }

    public void testSetEmail() {
    }
}
class UserAssert extends AbstractAssert <UserAssert, User>{

    public UserAssert(User actual) {
        super(actual, UserAssert.class);
    }
}