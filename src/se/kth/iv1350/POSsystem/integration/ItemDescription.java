
package se.kth.iv1350.POSsystem.integration;

public class ItemDescription {
  private ItemDTO item;
  /**
   * print out the item discription to th io
   * @param item to show its description
   */
  
  public static void printOutItemDescription (ItemDTO item){
      System.out.println("item "+ item.getName());
      System.out.println("price "+ item.getPrice());
      System.out.println("Tax "+ item.getTax());
      System.out.println("quantity "+ item.getQuantity());
      System.out.println("\n");
  }
  
}
