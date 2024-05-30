package pOEPART1;

import javax.swing.JOptionPane;

public class Kanban {
    public static void main(String[] args) {
        // Necessary Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        
        boolean loggedIn = login(); // 

        if (loggedIn) {
            boolean quit = false;
            while (!quit) {
                //  menu options displayed
                String userInput = JOptionPane.showInputDialog("Choose an option:\n"
                        + "1) Add tasks\n"
                        + "2) Show report\n"
                        + "3) Quit");

                switch (userInput) {
                    case "1":
                        addTasks();
                        break;
                    case "2":
                        showReport();
                        break;
                    case "3":
                        quit = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, please try again.");
                }
            }
        }
    }

    // Method to handle task addition
    public static void addTasks() {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tasks:"));

        for (int i = 0; i < numTasks; i++) {
            // Gather task details
            String taskName = JOptionPane.showInputDialog("Enter task name:");
            

            
          Task task = new Task(taskName); 

            
            JOptionPane.showMessageDialog(null, task.printTaskDetails(), taskName, i);

           
           int totalHours = task.returnTotalHours();
            JOptionPane.showMessageDialog(null, "Total hours: " + totalHours);
        }
    }

    // This Method shows that task is under development (report) 
    public static void showReport() {
        JOptionPane.showMessageDialog(null, "Coming Soon");
    }

   
    public static boolean login() {
        
        return true; 
    }

	public static void kanban() {
		// TODO Auto-generated method stub
		
	}
}

