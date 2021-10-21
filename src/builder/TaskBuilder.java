package builder;

import java.text.ParseException;
import java.util.Date;

import factory.*;
public class TaskBuilder  extends ActivityBuilder {
	KeyboardScanner scanner = new KeyboardScanner();
	String name;

	public TaskBuilder() {
		this.name = " Task Builder";
	}
	public ActivityBuilder addName() {
		scanner.setName(" name");
		this.activityName = scanner.getString();
		return this;
	}
	public ActivityBuilder addDescription() {
		scanner.setName(" description");
		this.activityDescription = scanner.getString();
		return this;
	}
	public ActivityBuilder addNotes() {
		scanner.setName(" notes");
		this.activityNotes = scanner.getString();
		return this;
	}
	public ActivityBuilder addStartDate() {
		scanner.setName("start date");
		try {
			this.activityStartDate = scanner.getDate();
		} catch (ParseException e) {

			e.printStackTrace();
			this.activityStartDate = new Date();
			System.out.println("Error date set to current");
		}
		return this;
	}
	public ActivityBuilder addEndDate() {
		scanner.setName(" end date");
		try {
			this.activityEndDate = scanner.getDate();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.activityEndDate = new Date();
			System.out.println("Error setting date current date set ");
		}

		return this;
	}
	@Override
	public Task build() {
		{
			Task task = new Task();
			task.setName(activityName);
			task.setDescription(activityDescription);
			task.setStatusCompletion(activityNotes);
			task.setStartDate(activityStartDate);
			task.setEndDate(activityEndDate);
			return task;
		}
	}

}
