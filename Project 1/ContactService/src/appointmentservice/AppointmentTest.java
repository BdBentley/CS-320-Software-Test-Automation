package appointmentservice;
/*
 * This class will contain the AppointmentTest class
 * - Brian Bentley 2023
 */

import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentTest {
	
	Date date = new Date();
	Appointment appointment = new Appointment("001", date, "Test");
	
	// Get the Appointment ID
	@Test public void testAppointmentGetID() {	
		assertEquals("001", appointment.getAppointmentID());
	}
	
	//Get the contact appointment date
	@Test public void testAppointmentGetDate() {
		assertEquals(date, appointment.getAppointmentDate());
		}
	 
	 // Get the appointment description
	@Test public void testAppointmentGetDescription() {
		assertEquals("Test", appointment.getAppointmentDescription());
		}
	
}

