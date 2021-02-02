package RegEx;

public class WarehouseItemList {
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
		return des.matches("^(([a-zA-Z]|[, ]){5,}[.!;?])+$");
	}
}
