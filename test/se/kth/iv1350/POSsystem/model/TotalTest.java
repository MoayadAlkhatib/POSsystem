
package se.kth.iv1350.POSsystem.model;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.POSsystem.integration.ItemDTO;

public class TotalTest {
    private Total total;
    private ItemDTO item;
    private ItemDTO item1;
    private ArrayList <ItemDTO> items;
    
    @Before
    public void setUp() {
        total = new Total();
        item = new ItemDTO(0, "carrot", 10, 2);
        item1 = new ItemDTO(1, "tomato", 12, 2.2);
        items  = new ArrayList<ItemDTO>();
        items.add(item);
        items.add(item1);
    }

    /**
     * Test of measureTotalPrice method, of class Total.
     */
    @Test
    public void testMeasureTotalPrice() {
   
    double totalPrice =total.measureTotalPrice(items);
    assertEquals(22, totalPrice, 22);
    }

    /**
     * Test of measureTotalVAT method, of class Total.
     */
    @Test
    public void testMeasureTotalVAT() {
        double totalPrice =total.measureTotalVAT(items);
    assertEquals(4.2, totalPrice, 4.2);
    }

    /**
     * Test of measureTotalPriceAndVAT method, of class Total.
     */
    @Test
    public void testMeasureTotalPriceAndVAT() {
    double totalPrice =total.measureTotalPriceAndVAT(items);
    assertEquals(26.2, totalPrice, 26.2);
    }
    
}
