package pOEPART1;

public class User {

    private String username;
    private String password;
    private String firstname;
    private String lastname;

    public User(String username, String password, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void printUser() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
    }

}
