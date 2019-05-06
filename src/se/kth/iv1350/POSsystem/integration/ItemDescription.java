package se.kth.iv1350.POSsystem.integration;

import java.util.ArrayList;
import se.kth.iv1350.POSsystem.model.Total;

public class ItemDescription {

    private ItemDTO item;

    public ItemDescription() {

    }

    /**
     * print out the item discription to th io
     *
     * @param item to show its description
     */
    public static void printOutItemDescription(ItemDTO item) {

        System.out.println("item " + item.getName());
        System.out.println("price " + item.getPrice());
        System.out.println("Tax " + item.getTax());
        System.out.println("quantity " + item.getQuantity());
        System.out.println("\n");

    }

    public static void printOutTotal(ArrayList<ItemDTO> items) {
        Total total = new Total();

        System.out.println("Total price " + total.measureTotalPrice(items));
        System.out.println("Total VAT " + total.measureTotalVAT(items));
        System.out.println("Total to pay " + total.measureTotalPriceAndVAT(items));

    }
}
