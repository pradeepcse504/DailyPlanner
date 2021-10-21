package iterator;

import java.util.*;

import factory.*;
public class ErrandIterator implements Iterator {
	List<Errand> errands;

	int position = 0;
	public ErrandIterator(List<Errand> errands) {
		this.errands = errands;
	}

	@Override
	public Activity next() {
		Activity event = errands.get(position);
		position = position + 1;
		return event;
	}

	@Override
	public boolean hasNext() {
		if(position >= errands.size()) {
			return false;
		}
		else {
			return true;
		}
	}

}
