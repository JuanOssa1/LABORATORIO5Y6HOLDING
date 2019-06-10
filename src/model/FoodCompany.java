package model;

public class FoodCompany extends Company {
	private String saycoAcinproCertification;
	private String nationalTourismRegidtry;
	/**
	 * Description: Builder of the class Food company
	 * Pre: Parameters most be not null
	 * @param saycoAcinproCertification
	 * @param nationalTourismRegidtry
	 * @param registeredName
	 * @param nit
	 * @param address
	 * @param phoneNumber
	 * @param employementQuantity
	 * @param assetsValue
	 * @param constitutionDate
	 * @param typeOfCorporation
	 * @param legalAgentName
	 * @param floor
	 */
	public FoodCompany(String saycoAcinproCertification,String nationalTourismRegidtry, String registeredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName, int floor) {
		super( registeredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName, floor);
		this.saycoAcinproCertification = saycoAcinproCertification;
		this.nationalTourismRegidtry = nationalTourismRegidtry;
	}
	

}
