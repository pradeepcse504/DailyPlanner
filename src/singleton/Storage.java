package singleton;
import iterator.*;
import iterator.Iterator;

import java.util.*;

import factory.Appointment;
import factory.Errand;
import factory.Event;
import factory.Task;
public class Storage {
	List<Event> events;
	List<Task> tasks;
	List<Appointment> appointments;
	List<Errand> errands;

	private static Storage instance = new Storage();

	private Storage() {
		events = new ArrayList<Event>();
		tasks = new ArrayList<Task>();
		appointments = new ArrayList<Appointment>();
		errands = new ArrayList<Errand>();
	}
	public void addEvent(Event event) {
		this.events.add(event);
	}
	public void addTask(Task task) {
		this.tasks.add(task);
	}
	public void addAppointment(Appointment appointment) {
		this.appointments.add(appointment);
	}
	public void addErrand(Errand errand) {
		this.errands.add(errand);
	}
	public Iterator createEventsIterator() {
		return new EventIterator(events);
	}
	public Iterator createTaskIterator() {
		return new TaskIterator(tasks);
	}
	public Iterator createAppointmentIterator() {
		return new AppointmentIterator(appointments);
	}
	public Iterator createErrandIterator() {
		return new ErrandIterator(errands);
	}
	public List<Event> getEvents(){
		return events;
	}
	public List<Task> getTasks(){
		return tasks;
	}
	public List<Appointment> getAppointments(){
		return appointments;
	}
	public List<Errand> getErrands(){
		return errands;
	}

	public static Storage getInstance() {
		return instance;
	}
	public String toString() {
		return " Storage Container\n";
	}

}
