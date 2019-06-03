package se.kth.iv1350.POSsystem.controller;

import java.util.ArrayList;
import se.kth.iv1350.POSsystem.integration.DataBaseFailureException;
import se.kth.iv1350.POSsystem.integration.InvalidItemIDException;
import se.kth.iv1350.POSsystem.integration.Item;
import se.kth.iv1350.POSsystem.integration.ItemDTO;
import se.kth.iv1350.POSsystem.integration.ItemDescription;
import se.kth.iv1350.POSsystem.model.Sale;
import se.kth.iv1350.POSsystem.model.SaleObserver;
import se.kth.iv1350.POSsystem.model.Total;
import se.kth.iv1350.POSsystem.view.DataBaseException;
import se.kth.iv1350.POSsystem.view.ItemNotFoundException;

/**
 * The controller class has all system operations and all calls go through it.
 */
public class Controller {

    private Sale sale;

    /**
     * Creates a new constructor.
     * @param saleAmount  the amount of cash in the register.
     */
    public Controller(double saleAmount) {
       this.sale = new Sale(saleAmount);
    }
    
    public Controller (){
        
    }

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
     * register item get the name and quantity of each item and print out the
     * item discription to the io.
     *
     * @param name the name of each item.
     * @param quantity for item.
     * @throws ItemNotFoundException if an item does not exist.
     */
    public void registerItem(String name, int quantity) throws DataBaseException, ItemNotFoundException {
        try {
            if (item.checkIfItemExist(name)) {
                itemMatch = item.extractTheItemThatMatches(name);
                itemMatch.addQuantityNumber(quantity);
                allItems.add(itemMatch);
            }
        } catch (InvalidItemIDException e) {
            throw new ItemNotFoundException("Item not found.");
        } catch (DataBaseFailureException e) {
            throw new DataBaseException("Can not access the data base.");
        }
        ItemDescription.printOutItemDescription(itemMatch);
    }

    /**
     * showTotal operation shows the total price of the sale.
     */
    public void showTotal() {
        ItemDescription.printOutTotal(allItems);
    }

    /**
     * the payAmount method prints out the amount paid and change to get back to
     * the io.
     *
     * @param amountPaid amount that customer paid.
     */
    public double payAmount(double amountPaid) {
        Total total = new Total();
        double change = sale.pay(amountPaid, total.measureTotalPriceAndVAT(allItems));
        return change;
    }

    /**
     * Add a new sale observer.
     *
     * @param observer the observer to be added.
     */
    public void addSaleObserver(SaleObserver observer) {
        sale.addObserver(observer);
    }

}
