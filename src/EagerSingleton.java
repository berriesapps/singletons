/**
 * Description
 * --------------------------------
 * Instance created when class is loaded. 
 * Constructor is made private so no other class can create instance
 * Assuming we only have one class loader this guarantees single instance 
 * 
 * Advantages
 * --------------------------------
 * Simple to write
 * No need for synchronize or volatile keywords
 * 
 * Disadvantages
 * --------------------------------
 * Risk of having 2 instances if for some reason you have more than
 * one class loader loading the class
 * Constructor has to be empty
 * 
 * @author berry
 * 
 */
public class EagerSingleton {

	private static EagerSingleton sInstance = new EagerSingleton();

	public EagerSingleton getInstance() {
		return sInstance;
	}

	private EagerSingleton() {
	}
}
