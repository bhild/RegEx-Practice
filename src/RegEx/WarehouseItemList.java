package RegEx;

import java.util.ArrayList;

public class WarehouseItemList {
	private ArrayList<String[]> itemList = new ArrayList<String[]>();
	private String nameRegex = "([a-zA-Z]|[0-9 -]){3,}";
	private String idRegex = "([0-9]|[-])+";
	private String desRegex = "(([a-zA-Z]|[, '-]|(\\(\\))){5,}[.!;?])+";
	public WarehouseItemList() {
		// TODO Auto-generated constructor stub
	}
	public boolean isValidId(String id) {
		return id.matches(idRegex);
	}
	public boolean isValidName(String name) {
		return name.matches(nameRegex);
	}
	public boolean isValidDescription(String des) {
		return des.matches(desRegex);
	}
	public void addItem(String id, String name, String description) {
		if (isValidId(id)&&isValidDescription(description)&&isValidName(name)) {
			itemList.add(new String[] {name,id,description});
		}else {
			
			System.err.println("offending characters");
			//System.err.println("invalid WarehouseItem:\nname: " + name + " - " + isValidName(name)+"\nid: "+
				//	id + " - " + isValidId(id)+"\ndescription: "+ description + " - " + isValidDescription(description)+"\n");
			System.err.println("invalid WarehouseItem:");
			for(int i = 0; i<3;i++) {
				System.err.print("	");
				if (i==0) {
					System.err.print("name: " + name);
					if (!isValidName(name)) {
						System.err.print("	contains invalid character - "+name.replaceAll(nameRegex, ""));
					}
				}
				else if (i==1) {
					System.err.print("id: " + id);
					if (!isValidId(id)) {
						System.err.print("	contains invalid character - "+id.replaceAll(idRegex, ""));
					}
				}
				else if (i==2) {
					System.err.print("description: " + name);
					if (!isValidDescription(description)) {
						System.err.print("	contains invalid character - "+description.replaceAll(desRegex, ""));
					}
				}
				System.err.println();
			}
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
