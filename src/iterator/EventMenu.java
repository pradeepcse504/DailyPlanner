package iterator;
import java.util.*;

import factory.*;
import singleton.Storage;

public class EventMenu {
	Storage storage;
	List<Event> eventMenu;
	public EventMenu(Storage storage) {
		this.storage = storage;
		this.eventMenu = storage.getEvents();
	}
	public Iterator createIterator() {
		return storage.createEventsIterator();
	}

}
