package builder;

import java.text.ParseException;
import java.util.Date;

import factory.*;

public class ErrandBuilder  extends ActivityBuilder {
	KeyboardScanner scanner = new KeyboardScanner();
	String name;

	public ErrandBuilder() {
		this.name = " Errand Builder";
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
			//e.printStackTrace();
			this.activityEndDate = new Date();
		}

		return this;
	}
	@Override
	public Errand build() {
		{
			Errand errand = new Errand();
			errand.setName(activityName);
			errand.setDescription(activityDescription);
			errand.setStatusCompletion(activityNotes);
			errand.setStartDate(activityStartDate);
			errand.setEndDate(activityEndDate);
			return errand;
		}
	}
}
