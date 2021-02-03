package RegEx;

import java.util.ArrayList;

public class WarehouseItemList {
	private ArrayList<String[]> itemList = new ArrayList<String[]>();
	public WarehouseItemList() {
		// TODO Auto-generated constructor stub
	}
	public boolean isValidId(String id) {
		return id.matches("^([0-9]|[-])+$");
	}
	public boolean isValidName(String name) {
		return name.matches("^([a-zA-Z]|[0-9 -]){3,}$");
	}
	public boolean isValidDescription(String des) {
		return des.matches("^(([a-zA-Z]|[, '-]|(\\(\\))){5,}[.!;?])+$");
	}
	public void addItem(String id, String name, String description) {
		if (isValidId(id)&&isValidDescription(description)&&isValidName(name)) {
			itemList.add(new String[] {name,id,description});
		}else {
			System.err.println("invalid WarehouseItem:\nname: " + name + " - " + isValidName(name)+"\nid: "+
					id + " - " + isValidId(id)+"\ndescription: "+ description + " - " + isValidDescription(description)+"\n");
		}
	}
	public String[] getItem(int id) {
		if (id<itemList.size()) {
			return getItem(id);
		}
		return null;
	}
	public String toString() {
		String out = "";
		out+= "Lenght: " + itemList.size() + "\n";
		for(String[] i : itemList) {
			out+= "item: ";
			for(String j : i) {
				out+=j+"  |  ";
			}
			out+="\n";
		}
		return out;
	}
}
