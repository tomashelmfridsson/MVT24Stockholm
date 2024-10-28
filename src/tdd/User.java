package tdd;

public class User {

    private String username, password; // attribut, (klass, instans) variabler.
    private String typeOfUser;

    // Konstruktor med 2 string argument (parametrar) körs em gång vid "new"
    public User(String user, String pwd) {
        this.username = user;
        this. password = pwd;
        this.typeOfUser ="normal";
    }

    public String getUsername(){
       return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String newUser) {
        if (newUser.length() >= 4) username = newUser;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String admin) {
    }
}
