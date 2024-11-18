package user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserEmailTest {

    @Test
    public void addOneEmail(){
        UserEmail userEmail = new UserEmail();
        String email= "test@abc.se";
        userEmail.addEmail(email);
        assertEquals(email,userEmail.getEmailAtPosition(0));
        assertEquals(1, userEmail.getNumberOfEmails());
    }

    @Test
    public void addTwoEmail(){
        UserEmail userEmail = new UserEmail();
        String email0= "test0@abc.se";
        String email1= "test1@abc.se";
        userEmail.addEmail(email0);
        userEmail.addEmail(email1);
        assertEquals(email0,userEmail.getEmailAtPosition(0));
        assertEquals(email1,userEmail.getEmailAtPosition(1));
        assertEquals(2, userEmail.getNumberOfEmails());
    }

    @Test
    public void addFiveEmail(){
        UserEmail userEmail = new UserEmail();
        String email0= "test0@abc.se";
        String email1= "test1@abc.se";
        String email2= "test2@abc.se";
        String email3= "test3@abc.se";
        String email4= "test4@abc.se";
        userEmail.addEmail(email0);
        userEmail.addEmail(email1);
        userEmail.addEmail(email2);
        userEmail.addEmail(email3);
        userEmail.addEmail(email4);
        assertEquals(email1,userEmail.getEmailAtPosition(0));
        assertEquals(email2,userEmail.getEmailAtPosition(1));
        assertEquals(email3,userEmail.getEmailAtPosition(2));
        assertEquals(email4,userEmail.getEmailAtPosition(3));
        assertEquals(4, userEmail.getNumberOfEmails());
    }

    @Test
    public void addEmailWithoutAt(){
        UserEmail userEmail = new UserEmail();
        String email= "testabc.se";
        userEmail.addEmail(email);
        assertEquals(null,userEmail.getEmailAtPosition(0));
        assertEquals(0, userEmail.getNumberOfEmails());
    }

    @Test
    public void addTwoSimiliarEmails(){
        UserEmail userEmail = new UserEmail();
        String email= "test@abc.se";
        userEmail.addEmail(email);
        userEmail.addEmail(email);
        assertEquals(email,userEmail.getEmailAtPosition(0));
        assertEquals(null,userEmail.getEmailAtPosition(1));
        assertEquals(null,userEmail.getEmailAtPosition(2));
        assertEquals(null,userEmail.getEmailAtPosition(3));
        assertEquals(1, userEmail.getNumberOfEmails());
    }

    @Test
    public void removeEmail(){
        UserEmail userEmail = new UserEmail();
        String email0= "test0@abc.se";
        String email1= "test1@abc.se";
        String email2= "test2@abc.se";
        String email3= "test3@abc.se";
        userEmail.addEmail(email0);
        userEmail.addEmail(email1);
        userEmail.addEmail(email2);
        userEmail.addEmail(email3);
        userEmail.removeEmail(email1);
        assertEquals(email0,userEmail.getEmailAtPosition(0));
        assertEquals(email2,userEmail.getEmailAtPosition(1));
        assertEquals(email3,userEmail.getEmailAtPosition(2));
        assertEquals(null,userEmail.getEmailAtPosition(3));
        assertEquals(3, userEmail.getNumberOfEmails());
    }

}
