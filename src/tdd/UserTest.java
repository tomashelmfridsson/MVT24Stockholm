package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void getUsername() {
        User user = new User("tomas", "abs123");
        assertEquals("tomas", user.getUsername());
    }

    @Test
    void getPassword() {
        User user = new User("tomas", "abc123");
        assertEquals("abc123", user.getPassword());
    }

    @Test
    void setUsernameMoreThan4Char() {
        User user = new User("tomas", "abc123");
        user.setUsername("kalle");
        assertEquals("kalle", user.getUsername());
    }

    @Test
    void setUsernameLessThan4Char() {
        User user = new User("tomas", "abc123");
        user.setUsername("bo");
        assertEquals("tomas", user.getUsername());
    }

    @Test
    void typeOfUser() {
        User user = new User("tomas", "abc123");
        assertEquals("normal", user.getTypeOfUser());
    }

    @Test
    void setTypeOfUserAdmin() {
        User user = new User("tomas", "abc123");
        user.setTypeOfUser("admin");
        assertEquals("admin", user.getTypeOfUser());
    };
    // void setTypeOfUserSuper() {

    //    void setTypeOfUserXYZ() {
}
