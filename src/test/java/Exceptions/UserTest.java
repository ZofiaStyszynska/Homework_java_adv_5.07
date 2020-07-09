package Exceptions;

import junit.framework.TestCase;
import org.assertj.core.api.AbstractAssert;

public class UserTest extends TestCase {

    public void testCreateUser() {
        User user = User.createUser("KuluLulu","biedronka","Lucja","lulu@wp.pl");
        UserAssert.assertThat(user)
    }

    public void testSetLogin() {
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