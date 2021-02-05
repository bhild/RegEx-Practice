package RegEx;

import java.util.ArrayList;

public class WarehouseItemList {
	private ArrayList<String[]> itemList = new ArrayList<String[]>();
	private String nameRegex = "([a-zA-Z]|[0-9 -]){3,}";
	//any alphabetical number or dash 3 or more times
	private String idRegex = "([0-9]|[-])+";
	//any number or dash one or more times
	private String desRegex = "(([a-zA-Z]|[, '-]|[\\(\\)]|[0-9$]|([.]{1}([0-9]{1}))){5,}([.!;?]{1}([ ]{1}|$)))+";
	// determines any alphanumeric value with comma apostrophe dash parenthesis or $ which must be length 5 or more
	// then checks to see if there is punctuation followed by ether space or a end line
	// to allow cash amounts there can be a period that is not followed by an end line or a space
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
						System.err.print("			contains invalid characters / is too short / missing required characters");
					}
				}
				else if (i==1) {
					System.err.print("id: " + id);
					if (!isValidId(id)) {
						System.err.print("			contains invalid characters / is too short / missing required characters");
					}
				}
				else if (i==2) {
					System.err.print("description: " + description);
					if (!isValidDescription(description)) {
						System.err.print("			contains invalid characters / is too short / missing required characters");
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
