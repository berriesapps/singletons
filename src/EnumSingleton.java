/**
 * Description
 * --------------------------------
 * Use an enum to guarantee single instance
 *   
 * Advantages
 * --------------------------------
 * Extremely simple to write, impossible to make an error!
 * No need for synchronize or volatile keywords 
 * Single instance guaranteed even if we have more than one class loaders
 * 
 * Disadvantages
 * --------------------------------
 * Unable to pass any parameters when constructing it.
 * Extends enum class, so cannot extend anything else and provides possibly 
 * irrelevant methods to it's interface (the enum class methods).
 * Commits to an implementation strategy.
 * Has a serialization strategy that may not be wanted.
 * For an in-depth explanation of the above see the link below 
 * http://programmers.stackexchange.com/questions/179386/what-are-the-downsides-of-implementing-a-singleton-with-javas-enum
 * 
 * @author berry
 * 
 */

public enum EnumSingleton {
   INSTANCE;
   
   public void doSomething(){
	   
   }
}
