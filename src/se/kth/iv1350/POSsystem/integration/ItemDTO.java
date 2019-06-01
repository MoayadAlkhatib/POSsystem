
package se.kth.iv1350.POSsystem.integration;

/**
 * This class has all attributes that item has.
 */

public class ItemDTO {
    private double itemId;
    private String name;
    private double price;
    private double tax;
    private int quantity = 1;
    
    /**
     * create a constructor for itemId
     * @param itemId an unique number determines which item was scaned
     * @param name for example tomato
     * @param price determines the price for a specific item
     * @param tax determines the tax for a specific item
     */
    
    public ItemDTO(double itemId, String name, double price, double tax){
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    
    /**
     * add quantity for item
     * @param quantity determines by user
     */
    public void addQuantityNumber (int quantity){
        this.quantity = quantity;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public double getTax(){
        return this.tax;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getItemID(){
        return this.itemId;
    }
    
    
}
