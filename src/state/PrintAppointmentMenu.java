package state;

import factory.*;
import iterator.*;

public class PrintAppointmentMenu {

	AppointmentMenu appointmentMenu;
	public PrintAppointmentMenu(AppointmentMenu appointmentMenu) {
		this.appointmentMenu = appointmentMenu;
	}
	public void printMenu() {
		Iterator appointmentIterator = appointmentMenu.createIterator();
		printMenu(appointmentIterator);
	}
	public void printMenu(Iterator iterator) {
		System.out.println("\n==============Appointments===============\n");
		while(iterator.hasNext()) {
			Appointment appointment = (Appointment) iterator.next();
			System.out.print(appointment.getName() + "\t");
			System.out.print(appointment.getDescription() + "\t");
			System.out.print(appointment.getStartDate() + "\t");
			System.out.print(appointment.getEndDate() + "\t");
			System.out.println(appointment.getStatusCompletion() );

		}
	}
}
