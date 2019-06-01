
package se.kth.iv1350.POSsystem.integration;

/**
 * Thrown when database failure occur.
 */
public class DataBaseFailureException extends RuntimeException {
    
     /**
     * Creates a new instance representing the condition
     * as described in the specified message.
     * @param message A message that describes what went wrong.
     */
    public DataBaseFailureException (String message){
        super(message);
    }     
}
