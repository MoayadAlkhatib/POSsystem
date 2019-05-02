package se.kth.iv1350.POSsystem.integration;

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

    public static void printOutItemDescription(ItemDTO[] item) {
        for (int i = 0; i < item.length; i++) {
            System.out.println("item " + item[i].getName());
            System.out.println("price " + item[i].getPrice());
            System.out.println("Tax " + item[i].getTax());
            System.out.println("quantity " + item[i].getQuantity());
            System.out.println("\n");
        }
    }

    public static void printOutTotal(ItemDTO[] items) {
        Total total = new Total();
        System.out.println("Total price " + total.measureTotalPrice(items));
        System.out.println("Total VAT " + total.measureTotalVAT(items));
        System.out.println("Total to pay " + total.measureTotalPriceAndVAT(items));

    }
}
