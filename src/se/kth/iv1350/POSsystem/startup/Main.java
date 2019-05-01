
package se.kth.iv1350.POSsystem.startup;

import se.kth.iv1350.POSsystem.controller.Controller;
import se.kth.iv1350.POSsystem.view.View;

public class Main {
    public static void main (String args[]){
        Controller contr = new Controller();
        View view = new View (contr);
        view.runSampleExecution();
    }
}
