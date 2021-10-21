package state;
import java.util.*;

import factory.*;
import singleton.Storage;
public class ViewAllActivitiesState implements State {
	@Override
	public void posStatus(Context context, Storage storage) {
		Scanner usrInpt = new Scanner(System.in);

		PrintAllActivities allActivities = new PrintAllActivities(storage);
		allActivities.printEventMenu();
		System.out.println("\n\n");
		allActivities.printTaskMenu();
		System.out.println("\n\n");
		allActivities.printAppointmentMenu();
		System.out.println("\n\n");
		allActivities.printErrandMenu();

		Scanner input = new Scanner(System.in);

		System.out.println("\n What would you like to do next?\n"
				+ "1) Main menu\n"
				+ "2) Exit");


		int choice = input.nextInt();

		if( choice == 1) {
			MainMenuState back = new MainMenuState();
			back.posStatus(context, storage);
		}
		else if ( choice == 2 ) {
			System.exit(0);
		}



	}

}
