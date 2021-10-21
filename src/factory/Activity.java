package factory;
import java.util.*;
public class Activity {
	String description;
	Date startDate;
	Date endDate;
	String name;
	String statusCompletion;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatusCompletion() {
		return statusCompletion;
	}
	public void setStatusCompletion(String statusCompletion) {
		this.statusCompletion = statusCompletion;
	}


}
