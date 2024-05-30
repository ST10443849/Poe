package pOEPART1;
import static org.junit.Assert.*;
import org.junit.Test;
import pOEPART1.Task;

public class TaskTest {
	@Test
    public void testCheckTaskDescription_Success() {
        Task task = new Task("Login Feature");
        assertTrue(task.checkTaskDescription());
    }

    @Test
    public void testCheckTaskDescription_Failure() {
        Task task = new Task("Login Feature");
        assertFalse(task.checkTaskDescription());
    }

    @Test
    public void testCreateTaskID() {
        Task task = new Task("Login Feature");
        assertEquals("AD:0:RHN", task.createTaskID());
    }

    @Test
    public void testPrintTaskDetails() {
        Task task = new Task("Login Feature");
        String expectedDetails = "To Do\nDeveloper: Robyn Harrison\nTask Number: 0\nTask Name: Login Feature\nTask Description: Create Login to authenticate users\nTask ID: AD:0:RHN\nTask Duration: 8 hours";
        assertEquals(expectedDetails, task.printTaskDetails());
    }

    @Test
    public void testReturnTotalHours() {
        Task[] tasks = {
            new Task("Login Feature"),
            new Task("Add Task Feature")
        };
        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.returnTaskDuration();
        }
        assertEquals(18, totalHours);
    } 
}
