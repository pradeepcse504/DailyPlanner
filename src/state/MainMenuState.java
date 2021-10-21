package state;
import java.util.Scanner;

import singleton.Storage;
public class MainMenuState implements State {
	@Override
	public void posStatus(Context context, Storage storage) {
		Scanner input = new Scanner(System.in);
		System.out.print("--------Daily Planner OPTIONS--------\n" +
		"1) View All Activities \n" +
		"2) Add Events\n"+
		"3) Add Tasks\n" +
		"4) Add Appointments\n"+
		"5) Add Errands\n" +
		"6) View all Categories\n"+
		"7) Log out\n");
		System.out.print("\n");
		int choice = input.nextInt();

		if(choice ==1) {
			ViewAllActivitiesState viewActivites = new ViewAllActivitiesState();
			viewActivites.posStatus(context, storage);

		}
		else if(choice == 2) {
			CreateEvent createEvent = new CreateEvent();
			createEvent.posStatus(context,storage);
		}
		else if(choice == 3) {
			CreateTask createTask = new CreateTask();
			createTask.posStatus(context,storage);
		}
		else if(choice == 4) {
			CreateAppointmentState createAppointment = new CreateAppointmentState();
			createAppointment.posStatus(context,storage);
		}
		else if(choice == 5) {
			CreateErrand createErrand = new CreateErrand();
			createErrand.posStatus(context,storage);
		}
		else if(choice == 6) {
			MenuFactory menuFactory = new MenuFactory();
			menuFactory.posStatus(context,storage);
		}
		else if(choice == 6) {
			System.out.println("Log out");
			System.exit(0);
		}

	}

}
