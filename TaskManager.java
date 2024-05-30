package pOEPART1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
       Task task = new Task(taskName);
        //tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void updateTaskStatus(int taskIndex, String newStatus) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).setTaskStatus(newStatus);
            System.out.println("Task status updated successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void printAllTasks() {
        for (Task task : tasks) {
            task.printTaskDetails();
            System.out.println(); // Add a blank line for separation
        }
    }

    // Other methods as needed
}
