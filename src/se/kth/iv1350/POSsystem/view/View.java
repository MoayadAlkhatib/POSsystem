
package se.kth.iv1350.POSsystem.view;

import se.kth.iv1350.POSsystem.controller.Controller;

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
     * Execute the program with an input
     */
    public void runSampleExecution(){
        controller.startNewSale();
        String [] items = {"banana", "tomato"};
        controller.registerItem(items);
        controller.registerItem(items,2);
        controller.showTotal();
        
        
    }
}
