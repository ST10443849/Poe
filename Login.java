package pOEPART1;
import java.util.Scanner;

public class Login {
    
    
    
    static void promptLoginDeets() {
        System.out.println("Login: \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        if (validateCredentials(username, password)) {
        	System.out.println("Welcone - its great to see you");
            return;
        } else {
            System.out.println("Username or  password is incorrect - Try Again");
            promptLoginDeets();
        }
    }
    
    public static boolean validateCredentials(String username, String password) {
		return false;
      
}
}


