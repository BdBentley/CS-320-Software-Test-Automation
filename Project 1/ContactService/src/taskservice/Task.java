package taskservice;

/*
* This java file will contain the Task class
* - Brian Bentley 2023
*/

public class Task{
	// Set the taskID, taskName, and taskDescription data types and set as private
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	
	public Task(String taskID, String taskName, String taskDescription) {
		if(taskID.length() <= 10 && taskID != null) {
			this.taskID = taskID;
		}
		this.setTaskName(taskName);
		this.setTaskDescription(taskDescription);
		
	}
	
	// If the task name is less than 20 characters and not null this is the first name.
	public void setTaskName(String taskName){
		if(taskName.length() <= 20 && taskName != null) {
			this.taskName = taskName;
		}
	}
	
	// If the task description is less than 50 characters and not null this is the first name.
	public void setTaskDescription(String taskDescription){
		if(taskDescription.length() <= 50 && taskDescription != null) {
			this.taskDescription = taskDescription;
		}
	}
	
	// get the task id
	public String getTaskID() {
		return taskID;
	}
	
	// get task name
	public String getTaskName() {
		return taskName;
	}
	
	// get task description
	public String getTaskDescription() {
		return taskDescription;
	}
	
}