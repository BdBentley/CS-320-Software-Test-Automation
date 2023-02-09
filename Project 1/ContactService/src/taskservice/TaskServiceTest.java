package taskservice;

import org.junit.Test;
import static org.junit.Assert.*;
/*
 * This file will contain the TaskServiceTest tests
 * - Brian Bentley 2023
 */

public class TaskServiceTest{
	
	@Test public void testAddTask(){
		TaskService ts = new TaskService();
		Task task1 = new Task("001","Action","Perform Action");
		Task task2 = new Task("002","Jump","Perform Jump");
		Task task3 = new Task("003","Sit","Perform Sit");
		
		assertEquals(true, ts.addTask(task1));
		assertEquals(true, ts.addTask(task2));
		assertEquals(true, ts.addTask(task3));
	}
	
	@Test public void testDeleteTask() {
		TaskService ts = new TaskService();
		Task task1 = new Task("001","Action","Perform Action");
		Task task2 = new Task("002","Jump","Perform Jump");
		Task task3 = new Task("003","Sit","Perform Sit");
		assertEquals(true, ts.addTask(task1));
		assertEquals(true, ts.addTask(task2));
		assertEquals(true, ts.addTask(task3));
		
		assertEquals(true, ts.deleteTask("001"));
		assertEquals(true, ts.deleteTask("002"));
	}
	
	@Test public void testUpdateTaskName() {
		TaskService ts = new TaskService();
		Task task1 = new Task("001","Action","Perform Action");
		Task task2 = new Task("002","Jump","Perform Jump");
		Task task3 = new Task("003","Sit","Perform Sit");
		assertEquals(true, ts.addTask(task1));
		assertEquals(true, ts.addTask(task2));
		assertEquals(true, ts.addTask(task3));
		
		assertEquals(true, ts.updateTaskName("001","Inaction"));
		assertEquals(true, ts.updateTaskName("002","Prone"));
	}
	
	@Test public void testUpdateTaskDescription() {
		TaskService ts = new TaskService();
		Task task1 = new Task("001","Action","Perform Action");
		Task task2 = new Task("002","Jump","Perform Jump");
		Task task3 = new Task("003","Sit","Perform Sit");
		assertEquals(true, ts.addTask(task1));
		assertEquals(true, ts.addTask(task2));
		assertEquals(true, ts.addTask(task3));
		
		assertEquals(true, ts.updateTaskDescription("001","Inaction"));
		assertEquals(true, ts.updateTaskDescription("002","Prone"));
	}
	
	
}