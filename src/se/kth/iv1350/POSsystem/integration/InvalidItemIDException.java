
package se.kth.iv1350.POSsystem.integration;
/**
 * Thrown when something goes wrong with finding an item.
 *
 */

public class InvalidItemIDException extends Exception{
    
    /**
     * Creates a new instance representing the condition
     * as described in the specified message.
     * @param message A message that describes what went wrong.
     */
    public InvalidItemIDException (String message){
        super(message);
    }
}
