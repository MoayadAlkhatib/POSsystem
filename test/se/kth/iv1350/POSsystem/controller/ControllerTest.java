
package se.kth.iv1350.POSsystem.controller;

import org.junit.After;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import se.kth.iv1350.POSsystem.integration.ItemDTO;
import se.kth.iv1350.POSsystem.view.DataBaseException;
import se.kth.iv1350.POSsystem.view.ItemNotFoundException;


public class ControllerTest {
    private Controller contr;
    
    public ControllerTest() {
    }
    
    @Before
    public void setUp() {
     contr = new Controller();
    }
    
    @After
    public void tearDown() {
        contr =null;
    }

    
    @Test
    public void testValidItemName(){
      ItemDTO item = new ItemDTO(0, "carrot", 10, 2);
          try {
              contr.registerItem(item.getName(), 1);
          } catch (DataBaseException ex) {
              fail("A data base exception was thrown.");
              ex.printStackTrace();
              
          } catch (ItemNotFoundException ex) {
              fail("An item not found exception was thrown.");
              ex.printStackTrace();
          }
      }
    

@Test
    public void testInValidItemName(){
      ItemDTO item = new ItemDTO(5, "olive", 10, 2);
          try {
              contr.registerItem(item.getName(), 1);
              fail("invalid item scanned");
          } catch (DataBaseException ex) {
              ex.printStackTrace();
              
          } catch (ItemNotFoundException ex) {
              ex.printStackTrace();
          }
      }
}

