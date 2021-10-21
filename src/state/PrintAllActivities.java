package state;
import iterator.*;
import singleton.Storage;
public class PrintAllActivities {
	Storage storage;
	public PrintAllActivities(Storage storage) {
		this.storage = storage;
		EventMenu eventMenu = new EventMenu(storage);
		PrintEventMenu printEventMenu = new PrintEventMenu(eventMenu);
		TaskMenu taskMenu = new TaskMenu(storage);
		PrintTaskMenu printTaskMenu = new PrintTaskMenu(taskMenu);
		AppointmentMenu appointmentMenu = new AppointmentMenu(storage);
		PrintAppointmentMenu printAppointmentMenu = new PrintAppointmentMenu(appointmentMenu);
		ErrandMenu errandMenu = new ErrandMenu(storage);
		PrintErrandMenu printErrandMenu = new PrintErrandMenu(errandMenu);





	}
	public void printEventMenu() {
		EventMenu eventMenu = new EventMenu(storage);
		PrintEventMenu printEventMenu = new PrintEventMenu(eventMenu);
		printEventMenu.printMenu();
	}
	public void printTaskMenu() {
		TaskMenu taskMenu = new TaskMenu(storage);
		PrintTaskMenu printTaskMenu = new PrintTaskMenu(taskMenu);
		printTaskMenu.printMenu();
	}
	public void printAppointmentMenu() {
		AppointmentMenu appointmentMenu = new AppointmentMenu(storage);
		PrintAppointmentMenu printAppointmentMenu = new PrintAppointmentMenu(appointmentMenu);
		printAppointmentMenu.printMenu();
	}
	public void printErrandMenu() {
		ErrandMenu errandMenu = new ErrandMenu(storage);
		PrintErrandMenu printErrandMenu = new PrintErrandMenu(errandMenu);
		printErrandMenu.printMenu();
	}

}
