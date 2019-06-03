package se.kth.iv1350.POSsystem.view;

import java.io.IOException;
import se.kth.iv1350.POSsystem.controller.Controller;
import se.kth.iv1350.POSsystem.util.log.LogHandler;

/**
 * This class can be used by the user. user can enter all system operations with
 * different inputs.
 */
public class View {
    
    private Controller controller;
    private ErrorMessageHandler emh = new ErrorMessageHandler();

    /**
     * Create a constructor for View.
     *
     * @param contr the controller that has all operatin systems.
     */
    public View(Controller contr) {
        this.controller = contr;
        contr.addSaleObserver(new TotalRevenueView());
    }

    /**
     * Simulate an input that generates calls to all system operations
     */
    public void runSampleExecution() {
        controller.startNewSale();
        try {
            controller.registerItem("banana", 4);
            controller.registerItem("pizza", 3);
            controller.registerItem("unique", 3); // tests the data base failure exception.
            //controller.registerItem("melon", 3); // tests the invalid item identifier exception.
        } catch (ItemNotFoundException e) {
            emh.showErrorMsg("Item can not be found.");
        } catch (DataBaseException e) {
            emh.showErrorMsg("can not access the data base.");
            LogHandler log;
            try {
                log = new LogHandler();
                log.logTheException(e);
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
        controller.showTotal();
        double amountPaid = 140;
        double change = controller.payAmount(amountPaid);
        System.out.println("\nAmount paid " + amountPaid);
        System.out.println("Change to get back " + change);
    }
}
