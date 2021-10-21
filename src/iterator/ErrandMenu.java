package iterator;
import java.util.List;

import factory.*;
import singleton.Storage;
public class ErrandMenu {
	Storage storage;
	List<Errand> errandMenu;
	public ErrandMenu(Storage storage) {
		this.storage = storage;
		this.errandMenu = storage.getErrands();
	}
	public Iterator createIterator() {
		return storage.createErrandIterator();
	}

}
