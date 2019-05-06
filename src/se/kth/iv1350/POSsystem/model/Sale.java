package se.kth.iv1350.POSsystem.model;

public class Sale {

    public Sale() {
}
    /**
     * the pay method calculates the change amount.
     * @param amountPaid amount that customer paid.
     * @param priceToPay the total price of the sale.
     * @return the change that customer will get back.
     */
    public double pay (double amountPaid, double priceToPay){
        double change = amountPaid - priceToPay;
        System.out.println("\nAmount paid " +amountPaid);
        System.out.println("Change to get back " +change);
        return change;
    }

}
