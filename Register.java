package pOEPART1;
import java.util.Scanner;

public class Register {
    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Surname: ");
        String surname = scanner.nextLine();

        String ID;
        do {
            System.out.println("Enter ID: ");
            ID = scanner.nextLine();
        } while (!validatePersonIDFormat(ID));

        System.out.println("Create Username: ");
        String username = scanner.nextLine();

        System.out.println("Create Password: ");
        String password = scanner.nextLine();

        System.out.println("\nYou have registered Successfully\n");
    }

    private static boolean validatePersonIDFormat(String ID) {
        if (ID.length() != 13) {
            System.out.println("ID is not the correct length.");
            return false;
        }

        String digits = ID.substring(2); 

        if (!digits.matches("\\d+")) {
            System.out.println("ID must contain 13 digits");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        registerUser(); 
    }
}
