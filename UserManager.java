package pOEPART1;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void registerUser(String username, String password, String firstname, String lastname) {
        
        if (getUserByUsername(username) != null) {
            System.out.println("Username " + username + " is already taken.");
            return;
        }

        
        User user = new User(username, password, firstname, lastname);
        users.add(user);
        System.out.println("User " + username + " registered successfully.");
    }

    public boolean authenticateUser(String username, String password) {
        User user = getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Authentication successful.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    
}
