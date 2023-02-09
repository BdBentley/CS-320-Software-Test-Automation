package taskservice;

import org.junit.Test;
import static org.junit.Assert.*; 
/*
 * This file will contact the task tests.
 * - Brian Bentley 2023 
 */



public class TaskTest{
	
	Task task = new Task("001","Action","Perform Action");
	@Test public void testGetTaskID() {
		assertEquals("001", task.getTaskID());
	}
	
	@Test public void testGetTaskName() {
		assertEquals("Action", task.getTaskName());
	}
	
	@Test public void testGetTaskDescription() {
		assertEquals("Perform Action", task.getTaskDescription());
	}
	
}