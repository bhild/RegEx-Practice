package RegEx;

public class Driver {
	public static void main(String[] args) {
		WarehouseItemList list = new WarehouseItemList();
		list.addItem("909-365", "tempName", "No description provided.");
		list.addItem("909-365a", "tempName", "No description provided.--''()())(66.");
		list.addItem("909-365", "te", "No description provided");
		System.out.println(list.toString());
	}
}
	