package builder;

import java.text.ParseException;
import java.util.*;
import factory.*;

public class AppointmentBuilder  extends ActivityBuilder {
	KeyboardScanner scanner = new KeyboardScanner();
	String name;

	public AppointmentBuilder() {
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
			System.out.println("Error Setting date set to current date");
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
			System.out.println("Error Date set to current date");
		}

		return this;
	}
	@Override
	public Appointment build() {
		{
			Appointment appointment = new Appointment();
			appointment.setName(activityName);
			appointment.setDescription(activityDescription);
			appointment.setStatusCompletion(activityNotes);
			appointment.setStartDate(activityStartDate);
			appointment.setEndDate(activityEndDate);
			return appointment;
		}
	}

}
