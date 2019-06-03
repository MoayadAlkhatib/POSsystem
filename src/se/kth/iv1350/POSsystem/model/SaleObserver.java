
package se.kth.iv1350.POSsystem.model;

/**
 *An intertface that has the sale state.
 */
public interface SaleObserver {
    
    /**
     * Invoked when a sale has been paid.
     * @param newSale the sale that was paid.
     */
    public void addSale (double newSale);
}
