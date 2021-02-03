package RegEx;

public class Driver {
	public static void main(String[] args) {
		WarehouseItemList list = new WarehouseItemList();
		list.addItem("909-365", "tempName", "No description provided."); // this should work
		list.addItem("909-365a", "tempName", "No description provided.--''()())(66."); // this has an invalid description and id
		list.addItem("909-365", "te", "No description provided"); // the description is missing punctuation and the name is too short
		list.addItem("someId", "potato", "Vegital.");//id is invalid
		list.addItem("someId", "potato2369-25@", "no");//all of these are invalid
		System.out.println(list.toString());
	}
}
	