package se.kth.iv1350.POSsystem.controller;

import java.util.ArrayList;
import se.kth.iv1350.POSsystem.integration.Item;
import se.kth.iv1350.POSsystem.integration.ItemDTO;
import se.kth.iv1350.POSsystem.integration.ItemDescription;
import se.kth.iv1350.POSsystem.model.Sale;
import se.kth.iv1350.POSsystem.model.Total;

/**
 * The controller class has all system operations and all calls go through it.
 */

public class Controller {

    public Controller() {

    }
    private Sale sale;

    /**
     * the startNewSale system operation prints out "New sale was started" to
     * the io.
     */
    public void startNewSale() {
        sale = new Sale();
        System.out.println("New sale was started \n");
    }
    private Item item = new Item();
    private ItemDTO itemMatch;
    private ArrayList<ItemDTO> allItems = new ArrayList<ItemDTO>();
    
    /**
     * register item get the name and quantity of each item and print out the item
     * discription to the io.
     *
     * @param name the name of each item.
     * @param quantity for item.
     */
    public void registerItem(String name, int quantity) {
            if (item.checkIfItemExist(name)) {
                itemMatch = item.extractTheItemThatMatches(name);
                itemMatch.addQuantityNumber(quantity);
                allItems.add(itemMatch);
            }
        ItemDescription.printOutItemDescription(itemMatch);
    }
    /**
     * showTotal operation shows the total price of the sale.
     */
    public void showTotal(){
         ItemDescription.printOutTotal(allItems);
    }
    
    /**
     * the payAmount method prints out the amount paid and change to get back to the io.
     * @param amountPaid amount that customer paid.
     */
    public void payAmount (double amountPaid){
        Total total = new Total();
        double change  =sale.pay(amountPaid, total.measureTotalPriceAndVAT(allItems));
        System.out.println("\nAmount paid " +amountPaid);
        System.out.println("Change to get back " +change);
        
    }
      

}
