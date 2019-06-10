package model;
public class AbstractCompany extends Tower {
	
	private String registeredName;
	private String nit;
	private String address;
	private String phoneNumber;
	private int employementQuantity;
	private double assetsValue;
	private String constitutionDate;
	private String legalAgentName;
	private Tower tower;
	/**
	 * Description: Builder of the class AbstractCompany
	 * Pre: Parameters most be not null
	 * @param registeredName
	 * @param nit
	 * @param address
	 * @param phoneNumber
	 * @param employementQuantity
	 * @param assetsValue
	 * @param constitutionDate
	 * @param legalAgentName
	 * @param floors
	 */
	
	public AbstractCompany(String registeredName, String nit, String address, String phoneNumber,
			int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName, int floors) {
		super(floors);
		this.registeredName = registeredName;
		this.nit = nit;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.employementQuantity = employementQuantity;
		this.assetsValue = assetsValue;
		this.constitutionDate = constitutionDate;
		tower = new Tower(floors);
		
	}
	/**
	 * Description: This method allows to get the "registeredname" to use it in another class
	 * Pre: The parameter "registeredname" most be not null
	 * @return A string with the value of the attribute "registeredname"
	 */
	public String getRegisteredName() {
		return registeredName;
	}
	/**
	 * Description: This method allows to get the "address" to use it in another class
	 * Pre: The parameter "address" most be not null
	 * @return A string with the value of the attribute "address"
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Description: This method allows to get the "phoneNumber" to use it in another class
	 * Pre: The parameter "phoneNumber" most be not null
	 * @return A string with the value of the attribute "phoneNumber"
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * Description: This method allows to get the "employementQuantity" to use it in another class
	 * Pre: The parameter "employementQuantity" most be not null
	 * @return A string with the value of the attribute "employementQuantity"
	 */
	public int getEmployementQuantity() {
		return employementQuantity;
	}
	/**
	 * Description: This method allows to get the "assetsValue" to use it in another class
	 * Pre: The parameter "assetsValue" most be not null
	 * @return A string with the value of the attribute "assetsValue"
	 */
	public double getAssetsValue() {
		return assetsValue;
	}
	/**
	 * Description: This method allows to get the "constitutionDate" to use it in another class
	 * Pre: The parameter "constitutionDate" most be not null
	 * @return A string with the value of the attribute "constitutionDate"
	 */
	public String getConstitutionDate() {
		return constitutionDate;
	}
	/**
	 * Description: This method allows to give a value to the attribute "registeredName" in another class
	 * Post: The parameter is set
	 * @param registeredName
	 */
	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}
	/**
	 * Description: This method allows to give a value to the attribute "nit" in another class
	 * Post: The parameter is set
	 * @param nit
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}
	/**
	 * Description: This method allows to give a value to the attribute "address" in another class
	 * Post: The parameter is set
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Description: This method allows to give a value to the attribute "phoneNumber" in another class
	 * Post: The parameter is set
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * Description: This method allows to give a value to the attribute "employementQuantity" in another class
	 * Post: The parameter is set
	 * @param employementQuantity
	 */
	public void setEmployementQuantity(int employementQuantity) {
		this.employementQuantity = employementQuantity;
	}
	/**
	 * Description: This method allows to give a value to the attribute "assetsValue" in another class
	 * Post: The parameter is set
	 * @param assetsValue
	 */
	public void setAssetsValue(double assetsValue) {
		this.assetsValue = assetsValue;
	}
	/**
	 * Description: This method allows to give a value to the attribute "constitutionDate" in another class
	 * Post: The parameter is set
	 * @param constitutionDate
	 */
	public void setConstitutionDate(String constitutionDate) {
		this.constitutionDate = constitutionDate;
	}
	/**
	 * Description: This method allows to get the "nit" to use it in another class
	 * Pre: The parameter "phoneNumber" most be not null
	 * @return A string with the value of the attribute "nit"
	 */
	public String getNit(){
		return nit;
	}
	/**
	 * Description: This method allows to get the "legalAgentName" to use it in another class
	 * Pre: The parameter "legalAgentName" most be not null
	 * @return A string with the value of the attribute "legalAgentName"
	 */
	public String getLegalAgentName() {
		return legalAgentName;
	}
	/**
	 * Description: This method allows to give a value to the attribute "legalAgentName" in another class
	 * Post: The parameter is set
	 * @param legalAgentName
	 */
	public void setLegalAgentName(String legalAgentName) {
		this.legalAgentName = legalAgentName;
	}
	/**
	 * Description: This method allows to convert each attribute of the class in a String
	 * Post: The attributes are converted to a string
	 * @return A string with the value of each attribute
	 */
	public String toString(){
		String msg = "Nombre registrado: "+registeredName+ "Nit: "+nit+"Direccion: "+address+"Numero telefonico: "+phoneNumber+"Cantidad de empleados: "+employementQuantity+"Activos: "+assetsValue+"Fecha de cosntitucion: "+constitutionDate+"Nombre del agente legal: "+legalAgentName;
		return msg;
		
	}
	
}