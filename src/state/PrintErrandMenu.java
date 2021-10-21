package state;

import factory.*;
import iterator.*;

public class PrintErrandMenu {

	ErrandMenu errandMenu;
	public PrintErrandMenu(ErrandMenu errandMenu) {
		this.errandMenu = errandMenu;
	}
	public void printMenu() {
		Iterator errandIterator = errandMenu.createIterator();
		printMenu(errandIterator);
	}
	public void printMenu(Iterator iterator) {
		System.out.println("\n==============Errands===============\n");
		while(iterator.hasNext()) {
			Errand errand = (Errand) iterator.next();
			System.out.print(errand.getName() + "\t");
			System.out.print(errand.getDescription() + "\t");
			System.out.print(errand.getStartDate() + "\t");
			System.out.print(errand.getEndDate() + "\t");
			System.out.println(errand.getStatusCompletion() );

		}
	}
}
