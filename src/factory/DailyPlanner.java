package factory;

import state.*;
import java.util.*;

import singleton.Storage;

public class DailyPlanner {

	public static void main(String[] args) {
		Context context = new Context();
		Storage storage = Storage.getInstance();
		//create some menus
		//create events
		Event event = new Event();
		event.setName("Event");
		event.setDescription("Event description");
		event.setStartDate(new Date());
		event.setEndDate(new Date());
		event.setStatusCompletion("Not completed");
		//create tasks
		Task task = new Task();
		task.setName("task");
		task.setDescription("Task description");
		task.setStartDate(new Date());
		task.setEndDate(new Date());
		task.setStatusCompletion("Not completed");

		//create demo appointments
		Appointment appointment = new Appointment();
		appointment.setName("Appointment");
		appointment.setDescription("Appointment");
		appointment.setStartDate(new Date());
		appointment.setEndDate(new Date());
		appointment.setStatusCompletion("Not completed");

		//create demo errands
		Errand errand = new Errand();
		errand.setName("Errand");
		errand.setDescription("Errand description");
		errand.setStartDate(new Date());
		errand.setEndDate(new Date());
		errand.setStatusCompletion("Not completed");


		storage.addEvent(event);
		storage.addTask(task);
		storage.addAppointment(appointment);
		storage.addErrand(errand);
		MainMenuState startUp = new MainMenuState();
		startUp.posStatus(context, storage);

	}

}
