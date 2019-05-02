
package se.kth.iv1350.POSsystem.model;

import se.kth.iv1350.POSsystem.integration.ItemDTO;

/**
 * create a constuctor to use the methos in ItemDescription.
 */
public class Total {
    public Total(){
        
    }
   /**
    * measure the entire price forr the sale.
    * @param items that has been entered. 
    * @return the total price.
    */
    public double measureTotalPrice (ItemDTO[] items){
      double totalPrice =0;
      for (int i =0; i<items.length; i++){
          double priceAfterAddingQuantity = 0;
          if (items[i].getQuantity() > 1){
          priceAfterAddingQuantity = items[i].getPrice()*items[i].getQuantity();
          }
         totalPrice= totalPrice + items[i].getPrice() + priceAfterAddingQuantity;
      }
      return totalPrice;  
    }
    
    /**
     * measure the entire tax for the sale.
     * @param items that has been entered.
     * @return the total taxes.
     */
    public double measureTotalVAT (ItemDTO[] items){
      double totalVAT =0;
      for (int i =0; i<items.length; i++){
          double VATAfterAddingQuantity = 0;
          if (items[i].getQuantity() > 1){
          VATAfterAddingQuantity = items[i].getTax() * items[i].getQuantity();
          }
         totalVAT= totalVAT + items[i].getTax() + VATAfterAddingQuantity;
      }
      return totalVAT;  
    }
    
    /**
     * measure the entire 
     * @param items
     * @return 
     */
    public double measureTotalPriceAndVAT (ItemDTO[] items){
      double totalPriceAndVAT =0;
      for (int i =0; i<items.length; i++){
          double totalAfterAddingQuantity = 0;
          if (items[i].getQuantity() > 1){
          totalAfterAddingQuantity = items[i].getTax() * items[i].getQuantity();
          totalAfterAddingQuantity += items[i].getPrice()*items[i].getQuantity();
          }
         totalPriceAndVAT= totalPriceAndVAT + items[i].getPrice() + items[i].getTax() + totalAfterAddingQuantity;
      }
      return totalPriceAndVAT;  
    }
    
    
}
