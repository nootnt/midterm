package midterm.nikolozi_lagvilava_1.task3;

class Item {
 	private String itemName;
    private String itemBrand;

    public Item(String name, String brand) {
        this.itemName = name;
        this.itemBrand = brand;
    }

    public String getName() {
        return itemName;
    }

    public String getBrand() {
        return itemBrand;
    }

	public void setName(String name) {
	    this.itemName = name;
	}

    public void setBrand(String brand) {
        this.itemBrand = brand;
    }

    @Override
    public String toString() {
    	return "Item: " + itemName + ", Brand: " + itemBrand;
    }
}
