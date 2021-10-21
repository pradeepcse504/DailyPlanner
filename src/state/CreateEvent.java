package state;

import java.util.*;
import builder.*;
import factory.*;
import singleton.Storage;
public class CreateEvent implements State {


	@Override
	public void posStatus(Context context, Storage storage) {
		ActivityBuilder eventBuilder = new EventBuilder();

		System.out.println("Create an Event\n");
		System.out.println("Enter name");
		eventBuilder.addName();
		System.out.println("Enter description");
		eventBuilder.addDescription();
		System.out.println("Enter Start Date");
		eventBuilder.addStartDate();
		System.out.println("Enter End Date");
		eventBuilder.addEndDate();
		System.out.println("Enter some notes");
		eventBuilder.addNotes();

		Activity event = eventBuilder.build();

		storage.addEvent((Event)event);
		System.out.println("Added Event");
		System.out.println("What do you want to do next?");

		Scanner input = new Scanner(System.in);

		System.out.print("--------Options--------\n" +
		"1) Main Menu \n" +

		"2) Log out\n");

		int choice = (int)(input.nextInt());
		switch(choice) {
			case 1:
				MainMenuState main = new MainMenuState();
				main.posStatus(context, storage);
				break;
			case 2:
				System.out.println("Shutdown");
				System.exit(0);
		}

	}

}