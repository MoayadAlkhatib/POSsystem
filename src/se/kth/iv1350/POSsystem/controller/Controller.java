package se.kth.iv1350.POSsystem.controller;

import se.kth.iv1350.POSsystem.integration.Item;
import se.kth.iv1350.POSsystem.integration.ItemDTO;
import se.kth.iv1350.POSsystem.integration.ItemDescription;
import se.kth.iv1350.POSsystem.model.Sale;

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
        System.out.println("New sale was started");
    }
    Item item = new Item();

    public void registerItem(String name) {
        if (item.checkIfItemExist(name)) {
            ItemDTO itemMatch = item.extractTheItemThatMatches(name);
            ItemDescription.printOutItemDescription(itemMatch);
        }

    }

    public void registerItem(String name, int quantity) {
        if (item.checkIfItemExist(name)) {
            ItemDTO itemMatch = item.extractTheItemThatMatches(name);
            itemMatch.addQuantityNumber(quantity);
            ItemDescription.printOutItemDescription(itemMatch);
        }
    }
}