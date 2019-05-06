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
        return amountPaid - priceToPay;
    }

}
