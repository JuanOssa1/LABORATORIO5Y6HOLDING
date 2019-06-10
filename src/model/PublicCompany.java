package model;

public class PublicCompany extends ServiceCompany implements ProCalculator{
	public static final String SEWERAGESERVICE = "Alcantarillado";
	public static final String ENERGYSERVICE = "Energia";
	public static final String AQUEDUCTSERVICE = "Acueducto";
	private String typeOfService;
	private int totalSubscribers;
	private int numberOfSubscrib1and2;
	
	
		public PublicCompany(String registeredName, String nit, String address, String phoneNumber, int employementQuantity,
			double assetsValue, String constitutionDate, String legalAgentName, String typeOfCorporation,
			String typeOfService, int totalSubscribers, int numberOfSubscrib1and2, int floor) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName, typeOfCorporation,floor);
		//this.typeOfService = typeOfService;
		this.totalSubscribers = totalSubscribers;
		this.numberOfSubscrib1and2 = numberOfSubscrib1and2;
		if(typeOfService.equals("1")){
			typeOfService = PublicCompany.SEWERAGESERVICE;
		}
		else if(typeOfService.equals("2")){
			typeOfService = PublicCompany.ENERGYSERVICE;
		}
		else if(typeOfService.equals("3")){
			typeOfService = PublicCompany.AQUEDUCTSERVICE;
		}
	}
		/*
		if(typeOfCorporation.equals(1)){
			typeOfCorporation = Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING;
		}
		else if(typeOfCorporation.equals(2)){
			typeOfCorporation =Company.BUILDING;
		}
		else if(typeOfCorporation.equals(3)){
			typeOfCorporation =Company.COMUNALSOCIAL;
		}
		else if(typeOfCorporation.equals(4)){
			typeOfCorporation =Company.ELECTRICITY_GAS_AND_STEAM;
		}
		else if(typeOfCorporation.equals(5)){
			typeOfCorporation =Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES;
		}
		else if(typeOfCorporation.equals(6)){
			typeOfCorporation =Company.EXPLOITATION_OF_MINES_AND_QUARRIES;
		}
		else if(typeOfCorporation.equals(7)){
			typeOfCorporation =Company.MANUFACTURING_INDUSTRY;
		}
		else if(typeOfCorporation.equals(8)){
			typeOfCorporation =Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS;
		}
		else if(typeOfCorporation.equals(8)){
			typeOfCorporation =Company.WHOLESALE_AND_RETAIL;
		}
		
		*/
		/*
		this.totalSubscribers = totalSubscribers;
		this.numberOfSubscrib1and2 = numberOfSubscrib1and2;
		*/
	
	
	/**
	 * Description: This method allows to calculate the value of procultua
	 * @return The value of procultyra
	 */
	public double proculturaCalculation() {
		int procul = 0;
		procul = 40 -(((totalSubscribers-numberOfSubscrib1and2)/100));
		return procul;	
	}
	/**
	 * Description: This method allows to convert each attribute of the class in a String
	 * Post: The attributes are converted to a string
	 * @return A string with the value of each attribute
	 */
	public String toString(){
		String msg = "Tipo de servicio: "+typeOfService+ "Total de suscriptores: "+totalSubscribers+"Subscriptores estrato 1 y 2: "+numberOfSubscrib1and2+getRegisteredName()+"Direccion: "+getAddress()+"Numero telefonico: "+getPhoneNumber()+"Cantidad de empleados: "+getEmployementQuantity()+"Cantidad de activos: "+getAssetsValue()+"Fecha de constitucion: "+getConstitutionDate()+"Tipo de corporacion: "+getTypeOfCorporation()+"Nombre del agente legal: "+getLegalAgentName();
		return msg;
	}
	/**
	 * Description: This method allows to add polls to the arrayList of polls
	 * pre: The parameters most be not null
	 * @param serviceQuality
	 * @param timeQuality
	 * @param valueQuality
	 * @return A String with the state of the transaction 
	 */
	public String addPolls(double serviceQuality,double timeQuality, double valueQuality){
		String msg = "AGREGADO CON EXITO COMPANIA PUBLICA";
		Poll poll = new Poll( serviceQuality, timeQuality,  valueQuality);
		getPolls().add(poll);
		return msg;
	}
	/**
	 * Description: This method allows to add employees to a cubicle
	 * pre: Parameters most be not null
	 * @param email
	 * @param employeeName
	 * @param job
	 * @param extension
	 * @return A string with the state of the transaction 
	 */
	public String addEmployeToCubicles(String email, String employeeName, String job, String extension){
		boolean centinel = false;
		String msg = "AGREGADO CON EXITO A COMPANIA PUBLICA";
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
