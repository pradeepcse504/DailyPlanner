package iterator;
import java.util.List;

import factory.*;
import singleton.Storage;
public class TaskMenu {
	Storage storage ;
	List<Task> taskMenu;
	public TaskMenu(Storage storage) {
		this.storage = storage;
		this.taskMenu = storage.getTasks();
	}
	public Iterator createIterator() {
		return storage.createTaskIterator();
	}

}

