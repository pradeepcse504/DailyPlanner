package builder;

import java.text.ParseException;
import java.util.Date;

import factory.*;

public class EventBuilder extends ActivityBuilder {
	KeyboardScanner scanner = new KeyboardScanner();
	String name;

	public EventBuilder() {
		this.name = " Event Builder";
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

			//e.printStackTrace();
			this.activityStartDate = new Date();
			System.out.println("Error date set to current date");
		}
		return this;
	}
	public ActivityBuilder addEndDate() {
		scanner.setName(" end date");
		try {
			this.activityEndDate = scanner.getDate();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			this.activityEndDate = new Date();
			System.out.println("Error Date set to current ");
		}

		return this;
	}
	@Override
	public Event build() {
		{
			Event event = new Event();
			event.setName(activityName);
			event.setDescription(activityDescription);
			event.setStatusCompletion(activityNotes);
			event.setStartDate(activityStartDate);
			event.setEndDate(activityEndDate);
			return event;
		}
	}


}
