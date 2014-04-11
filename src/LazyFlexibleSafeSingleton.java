
/**
 * Description
 * --------------------------------
 * Instance created only when instance is requested for the first time
 * getInstance method is synchronized and constructor made private so 
 * that we make sure we only have single instance.
 * no need for volatile
 * 
 * Advantages
 * --------------------------------
 * Single instance guaranteed even if we have more than one class loaders
 * Lazy instantiation
 * Flexible (constructor does not need to be empty)
 * instance does not need to be volatile
 * 
 * Disadvantages
 * --------------------------------
 * Instance is only created once, however each time we need access to
 * it we need to go through synchronized block
 * Will not take into account new set of parameters passed to getInstance
 * after the instance has been created
 * 
 * @author berry
 * 
 */
public class LazyFlexibleSafeSingleton {
	
	private static LazyFlexibleSafeSingleton sInstance;
	
	public static synchronized LazyFlexibleSafeSingleton getInstance(Object... params){
		if ( sInstance == null ){
			sInstance = new LazyFlexibleSafeSingleton(params);
		}
		return sInstance;
	}
	
	private LazyFlexibleSafeSingleton(Object... params){
		// do something to initialize the singleton 
	}
}
