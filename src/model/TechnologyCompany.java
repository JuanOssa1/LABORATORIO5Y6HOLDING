package model;

public class TechnologyCompany extends ServiceCompany implements TreePlanter{
	public static final String CONSULTANCY = "Consulta";
	public static final String CAPACITATION = "Capacitacion";
	public static final String SOFTWAREDEVELOPMENT = "Desarrollo de sofware a medida";
	public final static String SERVICEASINFRASTRUCTURE = "Infraestructura como servicio";
	public static final String SOFTWAREINFRASTRUCTURE = "Software como infraestructura";
	public static final String PLATFORMASSERVICE = "Plataforma como servicio";
	private String offeredServices;
	private double energyConsumption;
	/**
	 * Description: Builder of the class TechnologyCompany
	 * pre: Parameters most be not null
	 * @param offeredServices
	 * @param energyConsumption
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
	
	public TechnologyCompany(String offeredServices, double energyConsumption,String registeredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName, int floor) {
		super(registeredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName, floor);
		
		//this.offeredServices = offeredServices;
		/*
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
		*/
		if(offeredServices.equals("1")){
			offeredServices= CONSULTANCY;
		}
		else if(offeredServices.equals("2")){
			offeredServices= CAPACITATION;
		}
		else if(offeredServices.equals("3")){
			offeredServices= SOFTWAREDEVELOPMENT;			
		}
		else if(offeredServices.equals("4")){
			offeredServices= SERVICEASINFRASTRUCTURE;	
		}
		else if(offeredServices.equals("5")){
			offeredServices= SOFTWAREINFRASTRUCTURE;
		}
		else if(offeredServices.equals("6")){
			offeredServices= PLATFORMASSERVICE;
		}
		this.energyConsumption = energyConsumption;
	}
	/**
	 * Description: This method allows to get the "energyConsumption" to use it in another class
	 * Pre: The parameter "energyConsumption" most be not null
	 * @return A string with the value of the attribute "energyConsumption"
	 */
	public double getEnergyConsumption() {
		return energyConsumption;
	}
	/**
	 * Description: This method allows to give a value to the attribute "energyConsumption" in another class
	 * Post: The parameter is set
	 * @param energyConsumption
	 */
	public void setEnergyConsumption(double energyConsumption) {
		this.energyConsumption = energyConsumption;
	}
	/**
	 * Description: This method allows to calculate the number of trees that represent the energy consumption
	 * Post: The number of trees are calculated 
	 * @return An int with a number that represent the quantity of trees
	 */
	public int numberOfTreesCalculation(){
		System.out.println("5");
		int trees = 0;
		if(energyConsumption>1 && energyConsumption<=1000){
			trees = TreePlanter.FEWTREES_E;
			System.out.println("6");
		}
		else if(energyConsumption>=1001 && energyConsumption<=3000){
			trees = TreePlanter.MEDIUMTREES_E;
			System.out.println("7");
		}
		else if(energyConsumption>3000){
			trees = TreePlanter.ALOTTREES_E;
			System.out.println("8");
		}
		return trees;
	}
	/**
	 * Description: This method allows to convert each attribute of the class in a String
	 * Post: The attributes are converted to a string
	 * @return A string with the value of each attribute
	 */
	public String toString(){
		String msg = "Servicios ofrecidos: "+offeredServices+ "Consumo de energia: "+energyConsumption+"Direccion: "+getAddress()+"Numero telefonico: "+getPhoneNumber()+"Cantidad de empleados: "+getEmployementQuantity()+"Cantidad de activos: "+getAssetsValue()+"Fecha de constitucion: "+getConstitutionDate()+"Tipo de corporacion: "+getTypeOfCorporation()+"Nombre del agente legal: "+getLegalAgentName();
		return msg;
	}
	/**
	 * Description: This method allows add a poll to the ArrayList of polls 
	 * Post: The poll is added
	 * @param serviceQuality
	 * @param timeQuality
	 * @param valueQuality
	 * @return A string with the state of the transaction 
	 */
	public String addPolls(double serviceQuality,double timeQuality, double valueQuality){
		String msg = "AGREGADO CON EXITO COMPANIA TECNOLOGICA";
		Poll poll = new Poll( serviceQuality, timeQuality,  valueQuality);
		getPolls().add(poll);
		return msg;
	}
	/**
	 * Description: This method allows to set the parameters of a cubicle
	 * pre: Parameters most be not null
	 * Post: The employee is added
	 * @param email
	 * @param employeeName
	 * @param job
	 * @param extension
	 * @return A string with the state of the transaction
	 */
	public String addEmployeToCubicles(String email, String employeeName, String job, String extension){
		boolean centinel = false;
		String msg = "AGREGADO CON EXITO A COMPANIA TECNOLOGICA";
		for(int i = 0; i<getCubicleMatrix().length && centinel == false; i++) {
			for(int j = 0; j < getCubicleMatrix()[0].length; j++) {
				if(getCubicleMatrix()[i][j].getEmail().equals("")){
					getCubicleMatrix()[i][j].setEmail(email);
					getCubicleMatrix()[i][j].setEmployeName(employeeName);
					getCubicleMatrix()[i][j].setJob(job);
					getCubicleMatrix()[i][j].setExtension(extension);
					centinel =  true;
				}
				
			}
		}
		return msg;
	}

}
