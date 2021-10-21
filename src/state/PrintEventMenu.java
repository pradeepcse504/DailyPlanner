package state;
import factory.*;
import iterator.*;
public class PrintEventMenu {
	EventMenu eventMenu;
	public PrintEventMenu(EventMenu eventMenu) {
		this.eventMenu = eventMenu;
	}
	public void printMenu() {
		Iterator eventIterator = eventMenu.createIterator();
		printMenu(eventIterator);
	}
	public void printMenu(Iterator iterator) {
		System.out.println("\n==============Events===============\n");
		while(iterator.hasNext()) {

			Event event = (Event) iterator.next();
			System.out.print(event.getName() + "\t");
			System.out.print(event.getDescription() + "\t");
			System.out.print(event.getStartDate() + "\t");
			System.out.print(event.getEndDate() + "\t");
			System.out.println(event.getStatusCompletion() );

		}
	}

}
