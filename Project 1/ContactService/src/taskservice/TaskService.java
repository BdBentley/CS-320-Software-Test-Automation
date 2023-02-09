package taskservice;

import java.util.ArrayList;
/*
* This java file will contain the TaskService class.
* - Brian Bentley 2023
*/

public class TaskService{
	
	ArrayList<Task> tasks;
	
	
	public TaskService() {
		tasks = new ArrayList<>();
	}
	
	// Task service shall be able to add tasks with a unique ID.
	public boolean addTask(Task newTask) {
		boolean contains = false;
		for (Task t : tasks) {
			if (t.getTaskID().equalsIgnoreCase(newTask.getTaskID())) {
				contains = true;
				break;
			}
		}

		if (!contains) {
			tasks.add(newTask);
			return true;
		} else {
			return false;
		}
	}
	
	
	// The task service shall be able to delete tasks per task ID.
	public boolean deleteTask(String taskID) {
		boolean deleted = false;
		for (Task t : tasks) {
			if (t.getTaskID().equalsIgnoreCase(taskID)) {
				tasks.remove(t);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	// The task service shall be able to update task name field.
	public boolean updateTaskName(String taskID, String newName) {
		boolean updated = false;
		for (Task t : tasks) {
			if (t.getTaskID().equalsIgnoreCase(taskID)) {
				t.setTaskName(newName);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	// The task service class shall be able to update the task description field.
	public boolean updateTaskDescription(String taskID, String newTaskDescription) {
		boolean updated = false;
		for (Task t : tasks) {
			if (t.getTaskID().equalsIgnoreCase(taskID)) {
				t.setTaskDescription(newTaskDescription);
				updated = true;
				break;
			}
		}
		return updated;
	}
}