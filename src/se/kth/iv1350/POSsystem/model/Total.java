
package se.kth.iv1350.POSsystem.model;

import java.util.ArrayList;
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
    public double measureTotalPrice (ArrayList<ItemDTO> items){
      double totalPrice =0;
      for (int i =0; i<items.size(); i++){
          double priceAfterAddingQuantity = 0;
          if (items.get(i).getQuantity() > 1){
          priceAfterAddingQuantity = items.get(i).getPrice()*items.get(i).getQuantity()- items.get(i).getPrice();
          }
         totalPrice= totalPrice + items.get(i).getPrice() + priceAfterAddingQuantity;
      }
      return totalPrice;  
    }
    
    /**
     * measure the entire tax for the sale.
     * @param items that has been entered.
     * @return the total taxes.
     */
    public double measureTotalVAT (ArrayList<ItemDTO> items){
      double totalVAT =0;
      for (int i =0; i<items.size(); i++){
          double VATAfterAddingQuantity = 0;
          if (items.get(i).getQuantity() > 1){
          VATAfterAddingQuantity = items.get(i).getTax() * items.get(i).getQuantity() - items.get(i).getTax();
          }
         totalVAT= totalVAT + items.get(i).getTax() + VATAfterAddingQuantity;
      }
      return totalVAT;  
    }
    
    /**
     * measure the entire price including the taxes.
     * @param items that has been entered.
     * @return the total price including taxes.
     */
    public double measureTotalPriceAndVAT (ArrayList<ItemDTO> items){
      double totalPriceAndVAT =0;
      for (int i =0; i<items.size(); i++){
          double totalAfterAddingQuantity = 0;
          if (items.get(i).getQuantity() > 1){
          totalAfterAddingQuantity = items.get(i).getTax() * items.get(i).getQuantity() - items.get(i).getTax();
          totalAfterAddingQuantity += items.get(i).getPrice()*items.get(i).getQuantity() - items.get(i).getPrice();
          }
         totalPriceAndVAT= totalPriceAndVAT + items.get(i).getPrice() + items.get(i).getTax() + totalAfterAddingQuantity;
      }
      return totalPriceAndVAT;  
    }
    
    
}
