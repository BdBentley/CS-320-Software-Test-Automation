package appointmentservice;
/*
 * This class will contain the Appointment class
 * - Brian Bentley 2023
 */

import java.util.Date;

public class Appointment{
	// Create the data types and variables.
	
	private String appointmentID;
	private Date appointmentDate;
	private String appointmentDescription;
	
	public Appointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
		
		// Create the set and get methods for the Appointment class.
		if(appointmentID != null && appointmentID.length() <= 10) {
			this.appointmentID = appointmentID;
		}	
		this.setAppointmentDate(appointmentDate);
		this.setAppointmentDescription(appointmentDescription);
	}
	
	// Appointment date cannot be null
	public void setAppointmentDate(Date appointmentDate) {
		if(appointmentDate != null && appointmentDate.after(new Date(1))) {
		this.appointmentDate = appointmentDate;
		}
	}
	// Appointment description cannot be null or over 50 characters.
	public void setAppointmentDescription(String appointmentDescription) {
		if(appointmentDescription.length() <= 50 && appointmentDescription!= null) {
			this.appointmentDescription = appointmentDescription;
		}
	}
	
	// get the Appointment id
	public String getAppointmentID() {
		return appointmentID;
	}
	
	// get the appointment Date
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	// get the appointment description
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
}