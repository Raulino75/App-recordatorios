package co.edu.konradlorenz.model;

public class User {

    String username, password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String toFileString() {
        return username + "," + password;
    }

    public static User fromFileString(String line) {
        String[] parts = line.split(",");
        return new User(parts[0], parts[1]);
    }
}
