package RegEx;

public class WarehouseItemValidator {
	public WarehouseItemValidator() {}
	//left empty -- this class will only be used as a part of the item list
	//it is going to keep separate for organizational reasons
	public boolean isValidId(String id) {
		return id.matches("");
	}
	public boolean isValidName(String name) {
		return name.matches("");
	}
	public boolean isValidDescription(String des) {
		return des.matches("^(([:alpha:]|[, ]){5,}[.!;?])+$");
	}
	
}
