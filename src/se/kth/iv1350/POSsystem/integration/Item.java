package se.kth.iv1350.POSsystem.integration;

public class Item {

    /**
     * create a constructor for Item
     */
    public Item() {

    }
    private ItemDTO[] item = {new ItemDTO(0, "carrot", 10, 2), new ItemDTO(1, "tomato", 12, 2.2),
        new ItemDTO(2, "banana", 14, 2.5), new ItemDTO(3, "pizza", 20, 3.2)};

    /**
     * this method check if a specific item exist by entering its name
     *
     * @param name the name for the item
     * @return true if the item exist. false if the item is not exist
     */
    public boolean checkIfItemExist(String name) {
        for (int i = 0; i < item.length; i++) {
            if (item[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * extract the item that matched and return it
     *
     * @param name name of the items
     * @return the item that matched
     */
    public ItemDTO extractTheItemThatMatches(String name) {
        for (int i = 0; i < item.length; i++) {
            if (item[i].getName().equals(name)) {
                return item[i];
            }
        }
        return null;
    }
}
