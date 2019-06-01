
package se.kth.iv1350.POSsystem.view;
/**
 * Thrown when something goes wrong with database connection.
 */
public class DataBaseException extends RuntimeException{
    
    /**
     * Creates a new instance representing the condition
     * as described in the specified message.
     * @param message A message that describes what went wrong.
     */
    public DataBaseException (String message){
        super(message);
    }
}
