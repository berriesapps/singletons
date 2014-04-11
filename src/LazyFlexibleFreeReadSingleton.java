/**
 * Description
 * --------------------------------
 * Instance created only first time it is requested
 * getInstance method allows free access after instance has been created
 * Single instance is guaranteed 
 * 
 * Advantages
 * --------------------------------
 * Single instance guaranteed even if we have more than one class loaders
 * Lazy instantiation
 * Flexible (constructor does not need to be empty)
 * synchronized block is only reached first time it is accessed
 * 
 * Disadvantages
 * --------------------------------
 * More complicated to write thus error prone.
 * instance has to be made volatile (?)
 * Will not take into account new set of parameters passed to getInstance
 * after the instance has been created
 * 
 * @author berry
 */
public class LazyFlexibleFreeReadSingleton {
	private volatile static LazyFlexibleFreeReadSingleton sInstance;
	
	public static LazyFlexibleFreeReadSingleton getInstance(Object... params){
		if ( sInstance != null ){
			return sInstance;
		}
		
		createInstance(params);
		
		return sInstance;
	}
	
	private static synchronized void createInstance(Object...params){
		if ( sInstance == null ){
			sInstance = new LazyFlexibleFreeReadSingleton(params);
		}
	}
	
	private LazyFlexibleFreeReadSingleton(Object... params){
		// do something to initialize the singleton 
	}
}
