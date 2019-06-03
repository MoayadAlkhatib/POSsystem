package se.kth.iv1350.POSsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private double totalBalance;
    private List<SaleObserver> saleObservers = new ArrayList<>();

    /**
     * create a constructor.
     *
     * @param totalBalance total balance since the program started.
     */
    public Sale(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Sale() {
    }

    /**
     * the pay method calculates the change amount.
     *
     * @param amountPaid amount that customer paid.
     * @param priceToPay the total price of the sale.
     * @return the change that customer will get back.
     */
    public double pay(double amountPaid, double priceToPay) {
        double change = amountPaid - priceToPay;
        this.totalBalance += priceToPay;
        notifyObservers(priceToPay);
        return change;
    }

    private void notifyObservers(double salePrice) {
        for (SaleObserver observer : saleObservers) {
            observer.addSale(salePrice);

        }
    }
        /**
         * Add a new sale observer.
         *
         * @param observer The observer to be added.
         */
    public void addObserver(SaleObserver observer) {
        saleObservers.add(observer);
    }

}
