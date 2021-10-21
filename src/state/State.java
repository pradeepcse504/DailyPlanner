package state;

import singleton.Storage;

public interface State {
	public void posStatus(Context context, Storage storage);
}
