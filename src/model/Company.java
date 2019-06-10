package model;

public abstract class Company extends AbstractCompany {
	
	public static final String AGRICULTUREHUNTINGSILVICULTUREANDFISHING = "Agricultura, caza, silvicultura y pesca ";
	public static final String EXPLOITATION_OF_MINES_AND_QUARRIES ="Explotacion de minas y canteras";
	public static final String MANUFACTURING_INDUSTRY = "Industria manufacturera";
	public static final String ELECTRICITY_GAS_AND_STEAM ="Electricidad, gas y vapor";
	public static final String WHOLESALE_AND_RETAIL ="Comercio al por mayor y al por menor";
	public static final String BUILDING ="Construccion";
	public static final String WHOLESALEANDRETAIL ="Comercio al por mayor y al por menor";
	public static final String TRANSPORTATION_STORAGE_AND_COMMUNICATIONS = "Transporte, almacenamiento y comunicaciones";
	public static final String ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES ="Est.f/cieros,seguros,b.inmuebles,serv. a companias";
	public static final String COMUNALSOCIAL ="Comunal, social";
	private String typeOfCorporation;
	/**
	 * Description: Builder of the class Company
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
	public Company(String registeredName, String nit, String address, String phoneNumber, int employementQuantity,
			double assetsValue, String constitutionDate, String legalAgentName, String typeOfCorporation, int floor) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName, floor);
		if(typeOfCorporation.equals("1")){
			typeOfCorporation = Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING;
		}
		else if(typeOfCorporation.equals("2")){
			typeOfCorporation =Company.BUILDING;
		}
		else if(typeOfCorporation.equals("3")){
			typeOfCorporation =Company.COMUNALSOCIAL;
		}
		else if(typeOfCorporation.equals("4")){
			typeOfCorporation =Company.ELECTRICITY_GAS_AND_STEAM;
		}
		else if(typeOfCorporation.equals("5")){
			typeOfCorporation =Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES;
		}
		else if(typeOfCorporation.equals("6")){
			typeOfCorporation =Company.EXPLOITATION_OF_MINES_AND_QUARRIES;
		}
		else if(typeOfCorporation.equals("7")){
			typeOfCorporation =Company.MANUFACTURING_INDUSTRY;
		}
		else if(typeOfCorporation.equals("8")){
			typeOfCorporation =Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS;
		}
		else if(typeOfCorporation.equals("9")){
			typeOfCorporation =Company.WHOLESALE_AND_RETAIL;
		}
		
	}

	/**
	 * Description: This method allows to get the "typeOfCorporation" to use it in another class
	 * Pre: The parameter "typeOfCorporation" most be not null
	 * @return A string with the value of the attribute "typeOfCorporation"
	 */
	public String getTypeOfCorporation() {
		return typeOfCorporation;
	}
	/**
	 * Description: This method allows to give a value to the attribute "typeOfCorporation" in another class
	 * Post: The parameter is set
	 * @param typeOfCorporation
	 */
	public void setTypeOfCorporation(String typeOfCorporation) {
		this.typeOfCorporation = typeOfCorporation;
	}
	/*
	public Company(String typeOfCorporation) {
		AbstractCompany legalPersonality = new AbstractCompany(typeOfCorporation, typeOfCorporation, typeOfCorporation, typeOfCorporation, 0, 0, typeOfCorporation, typeOfCorporation);
		
		if(typeOfCorporation.equals(1)){
			typeOfCorporation = AGRICULTUREHUNTINGSILVICULTUREANDFISHING;
		}
		else if(typeOfCorporation.equals(2)){
			typeOfCorporation =BUILDING;
		}
		else if(typeOfCorporation.equals(3)){
			typeOfCorporation =COMUNALSOCIAL;
		}
		else if(typeOfCorporation.equals(4)){
			typeOfCorporation =ELECTRICITY_GAS_AND_STEAM;
		}
		else if(typeOfCorporation.equals(5)){
			typeOfCorporation =ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES;
		}
		else if(typeOfCorporation.equals(6)){
			typeOfCorporation =EXPLOITATION_OF_MINES_AND_QUARRIES;
		}
		else if(typeOfCorporation.equals(7)){
			typeOfCorporation =MANUFACTURING_INDUSTRY;
		}
		else if(typeOfCorporation.equals(8)){
			typeOfCorporation =TRANSPORTATION_STORAGE_AND_COMMUNICATIONS;
		}
		else if(typeOfCorporation.equals(8)){
			typeOfCorporation =WHOLESALE_AND_RETAIL;
		}
	}
	*/
	/**
	 * Description: This method allows to set the attributes of the cubicles 
	 * Pre: The parameters most be not null
	 * @param email
	 * @param employeeName
	 * @param job
	 * @param extension
	 * @return A string with the state of the transaction
	 */
	public String addEmployeToCubicles(String email, String employeeName, String job, String extension) {
		boolean centinel = false;
		String msg = "Agregado con exito";
		for(int i = 0; i<getCubicleMatrix().length && centinel == false; i++) {
			for(int j = 0; j < getCubicleMatrix()[0].length && centinel == false ; j++) {
				if(getCubicleMatrix()[i][j].getEmail().equals("") && centinel == false){
					getCubicleMatrix()[i][j].setEmail(email);
					getCubicleMatrix()[i][j].setEmployeName(employeeName);
					getCubicleMatrix()[i][j].setJob(job);
					getCubicleMatrix()[i][j].setExtension(extension);
					centinel = true;
				}
				
			}
		}
		return msg;
	}
	

		
	

}
