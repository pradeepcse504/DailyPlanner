package iterator;

import java.util.*;

import factory.*;
public class TaskIterator implements Iterator {
	List<Task> tasks;
	int position = 0;
	public TaskIterator(List<Task> tasks) {
		this.tasks = tasks;
	}


	@Override
	public Activity next() {
		Activity event = tasks.get(position);
		position = position + 1;
		return event;
	}

	@Override
	public boolean hasNext() {
		if(position >= tasks.size()) {
			return false;
		}
		else {
			return true;
		}
	}
}
