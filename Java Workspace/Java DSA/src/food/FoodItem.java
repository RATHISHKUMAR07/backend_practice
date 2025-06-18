package food;

public class FoodItem {
	private String itemName;
	private double itemCost;
	public FoodItem(String itemName, double itemCost) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
	}
	public String getItemName() {
		return itemName;
	}
	public double getItemCost() {
		return itemCost;
	}
	
}
