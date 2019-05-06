
package se.kth.iv1350.POSsystem.view;

import se.kth.iv1350.POSsystem.controller.Controller;

/**
 * This class can be used by the user. user can enter all system operations with different inputs.
 */

public class View {
    private Controller controller;
    /**
     * Create a constructor for View.
     * @param contr the controller that has all operatin systems.
     */
    public View (Controller contr){
        this.controller = contr;
    }
    /**
     * Simulate an input that generates calls to all system operations
     */
    public void runSampleExecution(){
        controller.startNewSale();
        controller.registerItem("banana", 4);
        controller.registerItem("pizza", 3);
        controller.showTotal();
        controller.payAmount(140);
        
    }
}
