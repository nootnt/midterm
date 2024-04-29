package midterm.nikolozi_lagvilava_1.task3;

class SelfTest {
	public static void main(String[] args) {
        AMS AMS = new AMS();

        System.out.print("self test: ");

		AMS.displayItems();
        
        AMS.addItem("Guitar 1", "fender");
        AMS.addItem("keyboard 1", "casio");
        AMS.addItem("headphone 2", "Sennheiser");
        AMS.displayItems();

        AMS.removeItem("keyboard 1");
        AMS.displayItems();
    }
}
