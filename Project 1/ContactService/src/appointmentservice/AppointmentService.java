package appointmentservice;
/*
 * This class will contain the AppointmentService class
 * - Brian Bentley 2023
 */

import java.util.ArrayList;
import java.util.Date;

public class AppointmentService{
	
ArrayList<Appointment> appointments;

	
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	
	// The contact service shall be able to add contacts with a unique ID
	public boolean addAppointment(Appointment newAppointment) {
		boolean contains = false;
		for (Appointment a : appointments) {
			if (a.getAppointmentID().equalsIgnoreCase(newAppointment.getAppointmentID())) {
				contains = true;
				break;
			}
		}

		if (!contains && newAppointment.getAppointmentDate().after(new Date())) {
			appointments.add(newAppointment);
			return true;
		} else {
			return false;
		}	
		
		
	}
	
	// The contact service shall be able to delete contacts per contact ID.
	public boolean deleteAppointment(String appointmentID) {
		boolean deleted = false;
		for (Appointment a : appointments) {
			if (a.getAppointmentID().equalsIgnoreCase(appointmentID)) {
				appointments.remove(a);
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	

}