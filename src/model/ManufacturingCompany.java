package model;

import java.util.ArrayList;

public class ManufacturingCompany extends Company{
	private ArrayList<Product> products;
/**
 * Description: Builder of the class ManufacturingCompany
 * pre: Parameters most be not null
 * @param registeredName
 * @param nit
 * @param address
 * @param phoneNumber
 * @param employementQuantity
 * @param assetsValue
 * @param constitutionDate
 * @param legalAgentName
 * @param typeOfCorporation
 * @param floor
 */
	public ManufacturingCompany(String registeredName, String nit, String address, String phoneNumber,
			int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName,
			String typeOfCorporation, int floor) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName, typeOfCorporation, floor);
		products = new ArrayList<Product>();
	}
	/*
	public ManufacturingCompany(String RegisteredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName) {
		super(RegisteredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName);
		products = new ArrayList<Product>();
		//setLegalpersonality(RegisteredName,nit,address,phoneNumber,employementQuantity,assetsValue,constitutionDate,typeOfCorporation,legalAgentName);

	}
	*/
	/**
	 * Description: This method allows to get get the ArrayList of products  
	 * @return The ArrayList of products 
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}
	/**
	 * Description: This method allows to set the ArrayList of products 
	 * @param products
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	/**
	 * Description: This method allows to add products to the ArrayList of products 
	 * pre: The parameters most be not null 
	 * @param name
	 * @param productCode
	 * @param needed
	 * @param inventoryNumber
	 * @return A String with the state of the transaction 
	 */
	public String addProducts(String name, String productCode, double needed, int inventoryNumber){
		String msg = "SE HA AÑADIDO EL PRODUCTO";
		Product products1 = new Product(name, productCode, needed, inventoryNumber);
		products.add(products1);
			//products.add(new Product(name, productCode, needed, inventoryNumber));
		
		return msg;
	}
	/*
	 *  this.name = name;
		this.productCode = productCode;
		this.neededWater = neededWater;
		this.inventoryNumber = inventoryNumber
	 */

}
