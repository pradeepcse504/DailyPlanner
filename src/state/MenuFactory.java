package state;

import singleton.Storage;

import java.util.*;

import iterator.AppointmentMenu;
import iterator.ErrandMenu;
import iterator.EventMenu;
import iterator.TaskMenu;
public class MenuFactory implements State {



	@Override
	public void posStatus(Context context, Storage storage) {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n=========SELECT Category===========\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) View Events\n"+
		"2) View Tasks\n"+
		"3) View Appointments\n"+
		"4) View Errand\n"
		+ "5) Main menu\n");



		int choice = input.nextInt();


		if(choice ==1) {

				EventMenu eventMenu = new EventMenu(storage);
				PrintEventMenu printEventMenu = new PrintEventMenu(eventMenu);
				printEventMenu.printMenu();

		}

		else if(choice ==2) {
			TaskMenu taskMenu = new TaskMenu(storage);
			PrintTaskMenu printTaskMenu = new PrintTaskMenu(taskMenu);
			printTaskMenu.printMenu();
		}
		else if(choice == 3) {
			AppointmentMenu appointmentMenu = new AppointmentMenu(storage);
			PrintAppointmentMenu printAppointmentMenu = new PrintAppointmentMenu(appointmentMenu);
			printAppointmentMenu.printMenu();
		}

		else if(choice == 4) {
			ErrandMenu errandMenu = new ErrandMenu(storage);
			PrintErrandMenu printErrandMenu = new PrintErrandMenu(errandMenu);
			printErrandMenu.printMenu();
		}
		else if(choice == 5) {
			MainMenuState main = new MainMenuState();
			main.posStatus(context, storage);
		}
		MainMenuState main = new MainMenuState();

		main.posStatus(context, storage);

	}
}


