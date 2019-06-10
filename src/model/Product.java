package model;

public class Product {
	private String name;
	private String productCode;
	private double neededWater;
	private int inventoryNumber;
	/**
	 * Description: Builder of the class Product
	 * Pre: Parameters most be not null
	 * @param name
	 * @param productCode
	 * @param neededWater
	 * @param inventoryNumber
	 */
	public Product(String name,String productCode,double neededWater,int inventoryNumber) {
		this.name = name;
		this.productCode = productCode;
		this.neededWater = neededWater;
		this.inventoryNumber = inventoryNumber;
	}
	/**
	 * Description: This method allows to convert each attribute of the class in a String
	 * Post: The attributes are converted to a string
	 * @return A string with the value of each attribute
	 */
	public String toString() {
		String msg = "";
		msg = "Nombre: " + name + "Codigo de producto: " + productCode + "Agua requerida: "+ neededWater + "Numero de inventario: " + inventoryNumber;
		return msg;
	}
	/**
	 * Description: This method allows to calculate the usage of water of a combo of products
	 * @return A double with the quantity of water
	 */
	public double calculateWater(){
		double msg = 0;
		msg = inventoryNumber*neededWater;
		return msg;
	}

}
