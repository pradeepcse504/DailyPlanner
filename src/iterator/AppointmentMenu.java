package iterator;
import java.util.*;

import factory.*;
import singleton.Storage;

public class AppointmentMenu {
	Storage storage;
	List<Appointment> appointmentMenu;
	public AppointmentMenu(Storage storage) {
		this.storage = storage;
		this.appointmentMenu = storage.getAppointments();
	}
	public Iterator createIterator() {
		return storage.createAppointmentIterator();
	}

}


