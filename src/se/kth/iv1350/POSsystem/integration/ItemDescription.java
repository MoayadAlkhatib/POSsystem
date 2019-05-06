package se.kth.iv1350.POSsystem.integration;

import java.util.ArrayList;
import se.kth.iv1350.POSsystem.model.Total;

/**
 * This class has all methods to print out the item descriptions and the total price to the io.
 */

public class ItemDescription {

    private ItemDTO item;

    public ItemDescription() {

    }

    /**
     * print out the item discription to the io.
     *
     * @param item to show its description.
     */
    public static void printOutItemDescription(ItemDTO item) {

        System.out.println("item " + item.getName());
        System.out.println("price " + item.getPrice());
        System.out.println("Tax " + item.getTax());
        System.out.println("quantity " + item.getQuantity());
        System.out.println("\n");

    }
    
     /**
     * print out the total price for the sale to the io.
     * @param items all items that have been entered.
     */
    public static void printOutTotal(ArrayList<ItemDTO> items) {
        Total total = new Total();

        System.out.println("Total price " + total.measureTotalPrice(items));
        System.out.println("Total VAT " + total.measureTotalVAT(items));
        System.out.println("Total to pay " + total.measureTotalPriceAndVAT(items));

    }
}
