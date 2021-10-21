package state;

import java.util.Scanner;

import builder.ActivityBuilder;
import builder.ErrandBuilder;
import factory.Activity;
import factory.Appointment;
import factory.Errand;
import singleton.Storage;
import builder.*;
public class CreateAppointmentState implements State{


	@Override
	public void posStatus(Context context, Storage storage) {
		ActivityBuilder appointmentBuilder = new AppointmentBuilder();

		System.out.println("Create an Appointment\n");
		System.out.println("Enter name");
		appointmentBuilder.addName();
		System.out.println("Enter description");
		appointmentBuilder.addDescription();
		System.out.println("Enter Start Date");
		appointmentBuilder.addStartDate();
		System.out.println("Enter End Date");
		appointmentBuilder.addEndDate();
		System.out.println("Enter some notes");
		appointmentBuilder.addNotes();

		Activity appointment = appointmentBuilder.build();

		storage.addAppointment((Appointment)appointment);
		System.out.println("Added Appointment");
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
