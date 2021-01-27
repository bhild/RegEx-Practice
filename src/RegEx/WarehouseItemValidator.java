package RegEx;

public class WarehouseItemValidator {
	public WarehouseItemValidator() {}
	//left empty -- this class will only be used as a part of the item list
	//it is going to keep separate for organizational reasons
	public boolean isValidId(String id) {
		return id.matches("^([0-9]|[-])+$");
	}
	public boolean isValidName(String name) {
		return name.matches("^([a-zA-Z]|[0-9 -]){3,}$");
	}
	public boolean isValidDescription(String des) {
		return des.matches("^(([a-zA-Z]|[, ]){5,}[.!;?])+$");
	}
	
}
