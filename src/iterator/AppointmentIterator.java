package iterator;

import java.util.*;

import factory.*;
public class AppointmentIterator implements Iterator {
	List<Appointment> appointments;
	int position = 0;
	public AppointmentIterator(List<Appointment> appointments) {
		this.appointments = appointments;
	}


	@Override
	public Activity next() {
		Activity event = appointments.get(position);
		position = position + 1;
		return event;
	}

	@Override
	public boolean hasNext() {
		if(position >= appointments.size()) {
			return false;
		}
		else {
			return true;
		}
	}

}
