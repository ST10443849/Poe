package pOEPART1;

class Task {
 private String taskName;
 
 
 public Task(String taskName) {
     this.taskName = taskName;
    
 }

  public boolean checkTaskDescription() {
     
     return true; 
 }

 public String createTaskID() {
     
     return "AD:0:INA"; 
 }

 
 public String printTaskDetails() {
     return "Task details";
 }

 
 public int returnTotalHours() {
    
     return 0; // 
 }

public void setTaskStatus(String newStatus) {
	// TODO Auto-generated method stub
	
}

public int returnTaskDuration() {
	// TODO Auto-generated method stub
	return 0;
}
}