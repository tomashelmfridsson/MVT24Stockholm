package user;

import java.util.Arrays;

public class UserEmail {

    private String[] emailArray = new String[4];
    private int numberOfEmails = 0;

    public void addEmail(String email) {
        if (numberOfEmails >= 4) {
            emailArray[0] = emailArray[1];
            emailArray[1] = emailArray[2];
            emailArray[2] = emailArray[3];
            emailArray[3] = email;
        } else{
            for (int i = 0; i < emailArray.length; i++) {
                if (emailArray[i] == null) {
                    emailArray[i] = email;
                    numberOfEmails++;
                    break;
                }
            }
        }
    }

    public String getEmailAtPosition(int i) {
        System.out.println(Arrays.toString(emailArray));
        return emailArray[i];
    }
}
