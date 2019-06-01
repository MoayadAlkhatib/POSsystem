
package se.kth.iv1350.POSsystem.view;
/**
 * Thrown when an item is not found.
 */
public class ItemNotFoundException extends Exception{
    
     /**
     * Creates a new instance representing the condition
     * as described in the specified message.
     * @param message A message that describes what went wrong.
     */
    public ItemNotFoundException (String message){
        super(message);
    }
    
}
