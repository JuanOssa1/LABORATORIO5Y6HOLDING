package model;

import java.util.ArrayList;

public class MedicCompany extends ManufacturingCompany implements TreePlanter{
	public static final String MODALITY_A = "Producir y exportar";
	public static final String MODALITY_B = "Producir y vender";
	public static final String MODALITY_C = "importar y vender";
	private String sanitaryRegistratrion;
	private String expirationDate;
	private String modality;
	//private double waterConsumption;
	/**
	 * Description: Builder of the class Medic company
	 * pre: The parameters most be not null
	 * @param registeredName
	 * @param nit
	 * @param address
	 * @param phoneNumber
	 * @param employementQuantity
	 * @param assetsValue
	 * @param constitutionDate
	 * @param typeOfCorporation
	 * @param legalAgentName
	 * @param sanitaryRegistratrion
	 * @param expirationDate
	 * @param modality
	 * @param floor
	 */
	public MedicCompany(String registeredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName, String sanitaryRegistratrion,String expirationDate,String modality, int floor) {
		super(registeredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName, floor);
		//this.sanitaryRegistratrion = sanitaryRegistratrion;
		this.expirationDate = expirationDate;
		if(sanitaryRegistratrion.equals("1")){
			sanitaryRegistratrion = "Si";
		}
		else if(sanitaryRegistratrion.equals("2")){
			sanitaryRegistratrion = "No";
		}
		if(modality.equals("1")){
			modality = MODALITY_A;
		}
		if(modality.equals("2")){
			modality = MODALITY_B;	
		}
		if(modality.equals("3")){
			modality = MODALITY_C;
		}
		//this.modality = modality;
		//this.waterConsumption = waterConsumption;
	}
	/**
	 * Description: This method allows to define how many trees represent the consumption of water
	 * Post: The number of trees are calculated 
	 * @return An int with the number of trees
	 */
	public int numberOfTreesCalculation(){
		int trees = 0;
		double water = 0;
		for(int i=0; i<getProducts().size() ;i++){
			water += getProducts().get(i).calculateWater();
		}
		if(water>1 && water < 140){
			trees = TreePlanter.FEWTREES_W;
		}
		else if(water > 141 && water < 800){
			trees = TreePlanter.MEDIUMTREES_W;
		}
		else if(water>800){
			trees = TreePlanter.ALOTTREES_W;
		}
		return trees;
	}

	
}
