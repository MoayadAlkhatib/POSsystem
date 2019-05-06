package se.kth.iv1350.POSsystem.model;

public class Sale {

    public Sale() {
}
    public double pay (double amountPaid, double priceToPay){
        return amountPaid - priceToPay;
    }

}
