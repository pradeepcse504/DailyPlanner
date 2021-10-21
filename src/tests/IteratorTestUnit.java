package tests;

import java.util.Date;

import factory.*;
import iterator.*;
import singleton.Storage;

public class IteratorTestUnit {

	public static void main(String[] args) {
		Storage storage = Storage.getInstance();

		Event event = new Event();
		event.setName("Event");
		event.setDescription("Event description");
		event.setStartDate(new Date());
		event.setEndDate(new Date());
		event.setStatusCompletion("Not completed");

		storage.addEvent(event);

		EventMenu eventMenu = new EventMenu(storage);
		Iterator iterator = eventMenu.createIterator();

		if(iterator.hasNext()) {
			System.out.println("No violation in iterator");
		}
		else {
			System.out.println("Violation in iterator");
		}
	}

}
