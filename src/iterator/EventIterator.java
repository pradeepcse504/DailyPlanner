package iterator;

import java.util.*;

import factory.*;
public class EventIterator implements Iterator {
	List<Event> events;
	int position = 0;
	public EventIterator(List<Event> events) {
		this.events = events;
	}

	@Override
	public Activity next() {
		Activity event = events.get(position);
		position = position + 1;
		return event;
	}

	@Override
	public boolean hasNext() {
		if(position >= events.size()) {
			return false;
		}
		else {
			return true;
		}
	}

}
