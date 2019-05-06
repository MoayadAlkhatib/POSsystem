
package se.kth.iv1350.POSsystem.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SaleTest {
    
    private Sale sale;
    
    @Before
    public void setUp() {
        sale = new Sale();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pay method, of class Sale.
     */
    @Test
    public void testPay() {
      double change = sale.pay(10, 3);
      assertEquals(7, change, 7);
    }
    
}
