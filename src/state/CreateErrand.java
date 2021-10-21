package state;
import builder.*;
import factory.Activity;
import factory.Errand;
import singleton.Storage;

import java.util.*;
public class CreateErrand implements State{

	@Override
	public void posStatus(Context context, Storage storage) {
		ActivityBuilder errandBuilder = new ErrandBuilder();

		System.out.println("Create an Errand\n");
		System.out.println("Enter name");
		errandBuilder.addName();
		System.out.println("Enter description");
		errandBuilder.addDescription();
		System.out.println("Enter Start Date");
		errandBuilder.addStartDate();
		System.out.println("Enter End Date");
		errandBuilder.addEndDate();
		System.out.println("Enter some notes");
		errandBuilder.addNotes();

		Activity errand = errandBuilder.build();

		storage.addErrand((Errand)errand);
		System.out.println("Added Errand");
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
