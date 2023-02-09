package appointmentservice;
/*
 * This class will contain the AppointmentServiceTest class
 * - Brian Bentley 2023
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;
import java.util.Calendar;

public class AppointmentServiceTest{
	
	@SuppressWarnings("deprecation")
	Date date1 = new Date(2023, Calendar.MARCH, 1);
	@SuppressWarnings("deprecation")
	Date date2 = new Date(2024, Calendar.APRIL, 1);
	@SuppressWarnings("deprecation")
	Date date3 = new Date(2025, Calendar.MAY, 1);
	@SuppressWarnings("deprecation")
	Date date4 = new Date(2000, Calendar.JANUARY, 1);
	
	// This method will test the add appointment method for passing data	
	@Test public void testAddPass() {
		AppointmentService as = new AppointmentService();
		Appointment appointment1 = new Appointment("001", date1,"Test.");
		Appointment appointment2 = new Appointment("002", date2,"Test..");
		Appointment appointment3 = new Appointment("003", date3,"Test...");
		assertEquals(true, as.addAppointment(appointment1));
		assertEquals(true, as.addAppointment(appointment2));
		assertEquals(true, as.addAppointment(appointment3));
	}
	
	@Test public void testAddIDFail() {
		AppointmentService as = new AppointmentService();
		Appointment appointment1 = new Appointment("001", date1,"Test.");
		Appointment appointment2 = new Appointment("001", date2,"Test..");
		assertEquals(true, as.addAppointment(appointment1));
		
		assertEquals(false, as.addAppointment(appointment2));
	}
	
	@Test public void testAddDateFail() {
		AppointmentService as = new AppointmentService();
		Appointment appointment1 = new Appointment("001", date1,"Test.");
		Appointment appointment2 = new Appointment("002", date4,"Test..");
		assertEquals(true, as.addAppointment(appointment1));
		assertEquals(true, as.addAppointment(appointment2));
		
		assertEquals(false, as.addAppointment(appointment2));
	}
	
	@Test public void testDeleteAppointmentPass() {
		AppointmentService as = new AppointmentService();
		Appointment appointment1 = new Appointment("001", date1,"Test.");
		Appointment appointment2 = new Appointment("002", date2,"Test..");
		assertEquals(true, as.addAppointment(appointment1));
		assertEquals(true, as.addAppointment(appointment2));
		assertEquals(true, as.deleteAppointment(appointment1.getAppointmentID()));
		assertEquals(true, as.deleteAppointment(appointment2.getAppointmentID()));
				
		
	}
	
}