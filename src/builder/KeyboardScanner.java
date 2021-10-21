package builder;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class KeyboardScanner {
	String name;
	int dataInt;
	String dataString;
	Date dataDate;

	Scanner input;

	public KeyboardScanner() {
		input = new Scanner(System.in);
	}
	public int getInt() {
		return this.input.nextInt();

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getString() {
		return this.input.nextLine();
	}
	public Date getDate() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dataString = (String) input.nextLine();
		dataDate = format.parse(dataString);
		return dataDate;
	}

}
