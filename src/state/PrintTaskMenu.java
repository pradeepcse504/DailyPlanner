package state;
import factory.*;
import iterator.*;
public class PrintTaskMenu {
	TaskMenu taskMenu;
	public PrintTaskMenu(TaskMenu taskMenu) {
		this.taskMenu = taskMenu;
	}
	public void printMenu() {
		Iterator taskIterator = taskMenu.createIterator();
		printMenu(taskIterator);
	}
	public void printMenu(Iterator iterator) {
		System.out.println("\n==============Tasks===============\n");
		while(iterator.hasNext()) {
			Task task = (Task) iterator.next();
			System.out.print(task.getName() + "\t");
			System.out.print(task.getDescription() + "\t");
			System.out.print(task.getStartDate() + "\t");
			System.out.print(task.getEndDate() + "\t");
			System.out.println(task.getStatusCompletion() );

		}
	}
}
