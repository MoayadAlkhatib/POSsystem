
package se.kth.iv1350.POSsystem.view;

import se.kth.iv1350.POSsystem.model.SaleObserver;

/**
 * This class shows the total income for the store since the program was started.
 */
public class TotalRevenueView implements SaleObserver {
    private double totalIncome = 0;
    
    /**
     * careate a constructor.
     */
    public TotalRevenueView(){
        
    }
    
    @Override
    public void addSale(double newSale) {
       this.totalIncome += newSale;
       System.out.println("\nTotal income: " + totalIncome);
    }
}
