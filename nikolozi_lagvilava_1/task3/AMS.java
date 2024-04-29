package midterm.nikolozi_lagvilava_1.task3;

import java.util.ArrayList;
import java.util.List;

class AMS {

    private List<Item> items;

    public AMS() {
        items = new ArrayList<>();
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items in invetory");
        } else {
            System.out.println("Items available in inventory: ");
            for (Item item : items) {
                System.out.println("'" + item.getName() + "' '" + item.getBrand() + "'");
            }
        }
    }

    public void addItem(String name, String brand) {
        Item item = new Item(name, brand);
        items.add(item);
        System.out.println("item '" + name + "' from: ''" + brand + "'' added to inventory.");
    }

	public void removeItem(String name) {
		Item itemToRemove = null;
	    for (Item item : items) {
	        if (item.getName().equals(name)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            items.remove(itemToRemove);
        } else {
            System.out.println("Item not found in inventory.");
        }
    }
}
