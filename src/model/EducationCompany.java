package model;

import java.util.ArrayList;

public class EducationCompany extends ServiceCompany implements ProCalculator{
	public static final String EDUCATIONSECTOR_B = "Bachillerato";
	public static final String EDUCATIONSECTOR_U = "Universidad";
	private String approvalRegistration;
	private String accreditationYears;
	private String saberProRanking;
	private String principalName;
	private String educationSector;
	private int numberOfStudents1and2; 
	private int totalStudents;
	/**
	 * Description builder of the class Education company
	 * @param registeredName
	 * @param nit
	 * @param address
	 * @param phoneNumber
	 * @param employementQuantity
	 * @param assetsValue
	 * @param constitutionDate
	 * @param legalAgentName
	 * @param typeOfCorporation
	 * @param approvalRegistration
	 * @param accreditationYears
	 * @param saberProRanking
	 * @param principalName
	 * @param educationSector
	 * @param numberOfStudents1and2
	 * @param totalStudents
	 * @param floor
	 */
	public EducationCompany(String registeredName, String nit, String address, String phoneNumber,
			int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName,
			String typeOfCorporation, String approvalRegistration, String accreditationYears, String saberProRanking,
			String principalName, String educationSector, int numberOfStudents1and2, int totalStudents, int floor) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName, typeOfCorporation, floor);
		this.approvalRegistration = approvalRegistration;
		this.accreditationYears = accreditationYears;
		this.saberProRanking = saberProRanking;
		this.principalName = principalName;
		//this.educationSector = educationSector;
		this.numberOfStudents1and2 = numberOfStudents1and2;
		this.totalStudents = totalStudents;
		if(educationSector.equals("1")){
			educationSector = EDUCATIONSECTOR_B;
		}
		else if(educationSector.equals("2")){
			educationSector = EDUCATIONSECTOR_U;
		}
	}
	/*
public EducationCompany(String registeredName, String nit, String address, String phoneNumber,
			int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName,
			String approvalRegistration, String accreditationYears, String saberProRanking, String principalName,
			String educationSector, int numberOfStudents1and2, int totalStudents) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName);
		this.approvalRegistration = approvalRegistration;
		this.accreditationYears = accreditationYears;
		this.saberProRanking = saberProRanking;
		this.principalName = principalName;
		//this.educationSector = educationSector;
		this.numberOfStudents1and2 = numberOfStudents1and2;
		this.totalStudents = totalStudents;
		
	}
	*/
/*
	public EducationCompany(String approvalRegistration, String accreditationYears,String saberProRanking,String principalName, String educationSector, int numberOfStudents1and2,int totalStudents, String registeredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName ) {
		super(registeredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName);
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
		if(educationSector.equals("1")){
			educationSector = EDUCATIONSECTOR_B;
		}
		else if(educationSector.equals("2")){
			educationSector = EDUCATIONSECTOR_U;
		}
		this.approvalRegistration = approvalRegistration;
		this.accreditationYears = accreditationYears;
		this.saberProRanking = saberProRanking;
		this.principalName = principalName;
		//this.educationSector = educationSector;
		this.numberOfStudents1and2 = numberOfStudents1and2;
		this.totalStudents = totalStudents;
	
	}
	*/
	/**
	 * Description: This method allows to calculate the procultura tax
	 * Post: The tax is calculated
	 * @return An int with the value of proculura tax
	 */
	public double proculturaCalculation() {
		int procul = 0;
		procul = 20 -((totalStudents/100)*numberOfStudents1and2);
		return procul;	
	}
	/**
	 * Description: This method allows to convert each attribute of the class in a String
	 * Post: The attributes are converted to a string
	 * @return A string with the value of each attribute
	 */
	public String toString(){
		String msg = "Registro de aprobacion: "+approvalRegistration+ "Anios de acreditacion: "+accreditationYears+"Rango en el saber pro: "+saberProRanking+"Nombre del rector: "+principalName+ "Numero de estudiantes estrato 1 y 2"+numberOfStudents1and2+"Total de estudiantes: "+totalStudents+"Sector educativo"+educationSector+"Nombre registrado"+getRegisteredName()+"Direccion: "+getAddress()+"Numero telefonico: "+getPhoneNumber()+"Cantidad de empleados: "+getEmployementQuantity()+"Cantidad de activos: "+getAssetsValue()+"Fecha de constitucion: "+getConstitutionDate()+"Tipo de corporacion: "+getTypeOfCorporation()+"Nombre del agente legal: "+getLegalAgentName();
		return msg;
	}
	/**
	 *Description: This method allows to add poll to the ArrayList polls
	 *pre: parameters most be not null
	 *Post: the poll is added
	 *@param serviceQuality
	 *@param timeQuality
	 *@param valueQuality
	 *@return: A message with the state of the transaction
	 */
	public String addPolls(double serviceQuality,double timeQuality, double valueQuality){
		String msg = "AGREGADO CON EXITO COMPANIA EDUCATIVA";
		Poll poll = new Poll( serviceQuality, timeQuality,  valueQuality);
		getPolls().add(poll);
		return msg;
	}
	/**
	 * Description: This method allows to add an employee to a cubicle 
	 * @param email
	 * @param employeeName
	 * @param job
	 * @param extension
	 */
	public String addEmployeToCubicles(String email, String employeeName, String job, String extension){
		boolean centinel = false;
		String msg = "AGREGADO CON EXITO";
		for(int i = 0; i<getCubicleMatrix().length && centinel == false; i++) {
			for(int j = 0; j < getCubicleMatrix()[0].length && centinel == false; j++) {
				if(getCubicleMatrix()[i][j].getEmail().equals("")&& centinel == false){
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
