package RegEx;

import java.util.ArrayList;

public class WarehouseItemList {
	private ArrayList<String[]> itemList = new ArrayList<String[]>();
	private String nameRegex = "([a-zA-Z]|[0-9 -]){3,}";
	private String idRegex = "([0-9]|[-])+";
	private String desRegex = "(([a-zA-Z]|[, '-]|[\\(\\)]){5,}[.!;?])+";
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
		// Variable 1 -- id
		// Variable 2 -- name
		// Variable 3 -- description
		if (isValidId(id)&&isValidDescription(description)&&isValidName(name)) {
			itemList.add(new String[] {name,id,description});//run if all vars are valid
		}else {
			//prints out a syserr for the reason the input is invalid
			System.err.println("invalid WarehouseItem:");
			for(int i = 0; i<3;i++) {
				System.err.print("	");
				if (i==0) {
					System.err.print("name: " + name);
					if (!isValidName(name)) {
						if (name.replaceAll(nameRegex,"").length()!=0) {
							System.err.print("	contains invalid character(s) - "+name.replaceAll(nameRegex, ""));
						}else {
							System.err.print("	input too short or missing required character(s)");
						}
					}
				}
				else if (i==1) {
					System.err.print("id: " + id);
					if (!isValidId(id)) {
						System.err.print("	contains invalid character(s) - "+id.replaceAll(idRegex, ""));	
					}
				}
				else if (i==2) {
					System.err.print("description: " + description);
					if (!isValidDescription(description)) {
						if (description.replaceAll(desRegex, "").length()!=0) {
							System.err.print("	contains invalid character(s) - "+description.replaceAll(desRegex, ""));							
						}else {
							System.err.print("	input too short or missing required character(s)");
						}
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
