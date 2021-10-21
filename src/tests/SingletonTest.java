package tests;
import singleton.*;

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton pattern cannot be instantiated with new keyword
		//Storage storage = new Storage();
		Storage storage = Storage.getInstance();

		System.out.println(storage);

	}

}
