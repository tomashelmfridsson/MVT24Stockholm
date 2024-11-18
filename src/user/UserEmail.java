package user;

import java.util.Arrays;

public class UserEmail {

    private String[] emailArray = new String[4];
    private int numberOfEmails = 0;

    public int getNumberOfEmails() {
        return numberOfEmails;
    }

    public void addEmail(String email) {
        if (email.contains("@") && (alreadyExists(email) == -1)) {

            if (numberOfEmails >= 4) {
                emailArray[0] = emailArray[1];
                emailArray[1] = emailArray[2];
                emailArray[2] = emailArray[3];
                emailArray[3] = email;

//            for (int i =0; i<emailArray.length-1;i++){
//                emailArray[i] = emailArray[i+1];
//            }
//            emailArray[emailArray.length-1] = email;

            } else {
                for (int i = 0; i < emailArray.length; i++) {
                    if (emailArray[i] == null) {
                        emailArray[i] = email;
                        numberOfEmails++;
                        break;
                    }
                }
            }
        }
    }

    public String getEmailAtPosition(int i) {
        return emailArray[i];
    }

    private int alreadyExists(String email) {
        for (int i = 0; i < numberOfEmails; i++) {
            if (emailArray[i].equals(email)) return i;
        }
        return -1;
    }

    public void removeEmail(String email) {
        // Först leta reda på index i Arrayen
        // Ta bort emapostadrees vid indexet
        // Flytta alla senare ett steg i arrayen
        System.out.println(Arrays.toString(emailArray));
        int index = alreadyExists(email);
        for (int i = index; i < emailArray.length - 1; i++) {
            emailArray[i] = emailArray[i + 1];
        }
        emailArray[3] = null;
        numberOfEmails--;
        System.out.println(Arrays.toString(emailArray));
    }
}
