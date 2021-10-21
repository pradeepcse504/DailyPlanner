package builder;
import java.util.*;

import factory.*;
public abstract class ActivityBuilder {
		String name;
		String activityName;
		String activityDescription;
		String activityNotes;
		Date activityStartDate;
		Date activityEndDate;
		public abstract ActivityBuilder addName();
		public abstract ActivityBuilder addDescription();
		public abstract ActivityBuilder addNotes();
		public abstract ActivityBuilder addStartDate();
		public abstract ActivityBuilder addEndDate();
		public abstract Activity build() ;
	}


