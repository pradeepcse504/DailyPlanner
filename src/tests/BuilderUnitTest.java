package tests;

import builder.ActivityBuilder;
import builder.EventBuilder;
import factory.Activity;
import factory.Event;
import singleton.Storage;

public class BuilderUnitTest {

	public static void main(String[] args) {
		Storage storage = Storage.getInstance();

		ActivityBuilder eventBuilder = new EventBuilder();
		System.out.println("Running Builder test...\nCreate an Event\n");
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

		if(event.getClass() == Activity.class) {
			System.out.println("Builder built an instance of Activity! Test passed");
		}
		else {
			System.err.println("Builder built an instance not of Activity ! Test Failed");
		}
		storage.addEvent((Event)event);
		System.out.println("Checking if Storage contains our new event");
		if(!storage.getEvents().contains(event)) {
			System.out.println("Storage does not have our new event");
		}
		else {
			System.out.println("Storage able to save Built object");
		}
	}

}
