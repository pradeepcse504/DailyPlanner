package state;

import java.util.Scanner;

import builder.ActivityBuilder;
import builder.TaskBuilder;
import factory.*;
import singleton.Storage;

public class CreateTask implements State {

	@Override
	public void posStatus(Context context, Storage storage) {
		ActivityBuilder taskBuilder = new TaskBuilder();

		System.out.println("Create an Task\n");
		System.out.println("Enter name");
		taskBuilder.addName();
		System.out.println("Enter description");
		taskBuilder.addDescription();
		System.out.println("Enter Start Date");
		taskBuilder.addStartDate();
		System.out.println("Enter End Date");
		taskBuilder.addEndDate();
		System.out.println("Enter some notes");
		taskBuilder.addNotes();

		Activity task = taskBuilder.build();

		storage.addTask((Task)task);
		System.out.println("Added Task");
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