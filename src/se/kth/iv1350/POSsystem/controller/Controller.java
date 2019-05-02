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
    ItemDTO[] itemMatch;

    public void registerItem(String[] name) {
        int counter = 0;
        for (int i = 0; i < name.length; i++) {
            if (item.checkIfItemExist(name[i])) {
                counter++;
            }
        }
            itemMatch = new ItemDTO[counter];
            int j = 0;
            for (int k = 0; k < name.length; k++) {
                if (item.checkIfItemExist(name[k])) {
                    itemMatch[j++] = item.extractTheItemThatMatches(name[k]);
                }
            }
            ItemDescription.printOutItemDescription(itemMatch);
            
    }
    
      public void registerItem(String[] name, int quantity) {
        int counter = 0;
        for (int i = 0; i < name.length; i++) {
            if (item.checkIfItemExist(name[i])) {
                counter++;
            }
        }
            itemMatch = new ItemDTO[counter];
            int j = 0;
            for (int k = 0; k < name.length; k++) {
                if (item.checkIfItemExist(name[k])) {
                    itemMatch[j++] = item.extractTheItemThatMatches(name[k]);
                    
                }
            }
            for (int e =0; e<name.length; e++){
                itemMatch[e].addQuantityNumber(quantity);
            }
            ItemDescription.printOutItemDescription(itemMatch);
    }
      public void showTotal(){
          ItemDescription.printOutTotal(itemMatch);
      }

        

     
    
}
