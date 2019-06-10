package model;

import java.util.ArrayList;

public class Holding extends AbstractCompany{
	public static final int ARRAYSIZE = 1;
	private String name;
	private ArrayList<Company> companies;
	private Tower tower;
	
	/**
	 * Description: Constructor of the class Holding
	 * Pre: Params most be not null
	 * @param registeredName
	 * @param nit
	 * @param address
	 * @param phoneNumber
	 * @param employementQuantity
	 * @param assetsValue
	 * @param constitutionDate
	 * @param legalAgentName
	 * @param name
	 * @param floor
	 */
	
	public Holding(String registeredName, String nit, String address, String phoneNumber, int employementQuantity,
			double assetsValue, String constitutionDate, String legalAgentName, String name, int floor) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName, floor);
		this.name = name;
		companies = new ArrayList<Company>();
		tower = new Tower(employementQuantity);
		this.companies = companies;
		this.tower = tower;
	}
	/**
	 * Description: This method allows to register a public company to the holding
	 * Pre: The holding was created before
	 * Pre: The parameters must not be null
	 * Post: The public company is registered
	 * @param registeredName
	 * @param nit
	 * @param address
	 * @param phoneNumber
	 * @param employementQuantity
	 * @param assetsValue
	 * @param constitutionDate0
	 * @param legalAgentName
	 * @param typeOfCorporation
	 * @param typeOfService
	 * @param totalSubscribers
	 * @param numberOfSubscrib1and2
	 * @param floor
	 * @return A string that shows the state of the registration
	 */
	public String registerPublicCompany(String registeredName, String nit, String address, String phoneNumber, int employementQuantity,
			double assetsValue, String constitutionDate, String legalAgentName, String typeOfCorporation,
			String typeOfService, int totalSubscribers, int numberOfSubscrib1and2, int floor){
		String msg = "TRANSACCION REALIZADA DE MANERA EXITOSA";
		//String typeOfCorporation = "";
		companies.add(new PublicCompany( registeredName,  nit,  address,  phoneNumber,  employementQuantity,
				 assetsValue,  constitutionDate,  legalAgentName,  typeOfCorporation,
				 typeOfService,  totalSubscribers,  numberOfSubscrib1and2, floor));
		return msg;
	}
	/**
	 * Description: This method allows to register an education company to the holding
	 * Pre: The holding was created before
	 * Pre: The parameters must not be null
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
	 * @return A string that shows the state of the registration
	 */
	public String registerEducationCompany(String registeredName, String nit, String address, String phoneNumber,
			int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName,
			String typeOfCorporation, String approvalRegistration, String accreditationYears, String saberProRanking,
			String principalName, String educationSector, int numberOfStudents1and2, int totalStudents, int floor){
		String msg = "TRANSACCION REALIZADA DE MANERA EXITOSA";
		companies.add(new EducationCompany( registeredName,  nit,  address,  phoneNumber,
				 employementQuantity,  assetsValue,  constitutionDate,  legalAgentName,
				 typeOfCorporation,  approvalRegistration,  accreditationYears,  saberProRanking,
				 principalName,  educationSector,  numberOfStudents1and2,  totalStudents, floor));
		return msg;
	}
	/**
	 * Description: This method allows to register a Technology  company to the holding
	 * Pre: The holding was created before
	 * Pre: The parameters must not be null
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
	 * @return A string that shows the state of the registration
	 */
	public String registerTechnologyCompany(String offeredServices, double energyConsumption,String registeredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName, int floor){
		String msg = "TRANSACCION REALIZADA DE MANERA EXITOSA";
		companies.add(new TechnologyCompany( offeredServices,  energyConsumption, registeredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName, floor));
		return msg;
	}
	/**
	 * Description: This method allows to register a medic company to the holding
	 * Pre: The holding was created before
	 * Pre: The parameters must not be null
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
	 * @return A string that shows the state of the registration
	 */
	public String registerMedicCompany(String registeredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName, String sanitaryRegistratrion,String expirationDate,String modality, int floor){
		String msg = "TRANSACCION REALIZADA DE MANERA EXITOSA";
		companies.add(new MedicCompany( registeredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName,  sanitaryRegistratrion, expirationDate, modality, floor));
		return msg;
	}
	/**
	 * Description: This method allows to register a manufacturing company to the holding
	 * Pre: The holding was created before
	 * Pre: The parameters must not be null
	 * @param RegisteredName
	 * @param nit
	 * @param address
	 * @param phoneNumber
	 * @param employementQuantity
	 * @param assetsValue
	 * @param constitutionDate
	 * @param typeOfCorporation
	 * @param legalAgentName
	 * @param floor
	 * @return A string that shows the state of the registration
	 */
	public String registerManufacturingCompany(String RegisteredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName, int floor){
		String msg = "TRANSACCION REALIZADA DE MANERA EXITOSA";
		companies.add(new ManufacturingCompany( RegisteredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName, floor));
		return msg;
	}
	/**
	 * Description: This method allows to register a food company to the holding
	 * Pre: The holding was created before
	 * Pre: The parameters must not be null
	 * @param saycoAcinproCertification
	 * @param nationalTourismRegistry
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
	 * @return A string that shows the state of the registration
	 */
	public String registerFoodCompany(String saycoAcinproCertification,String nationalTourismRegistry, String registeredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName, int floor){
		String msg = "TRANSACCION REALIZADA DE MANERA EXITOSA";
		companies.add(new FoodCompany( saycoAcinproCertification, nationalTourismRegistry,  registeredName,  nit, address,  phoneNumber,  employementQuantity,  assetsValue,  constitutionDate,  typeOfCorporation,  legalAgentName, floor));
		return msg;
	}
	/**
	 * Description: This method allows to register a service company to the holding
	 * Pre: The holding was created before
	 * Pre: The parameters must not be null
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
	 * @return A string that shows the state of the registration
	 */
	public String registerServiceCompany(String registeredName, String nit, String address, String phoneNumber,int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName,String typeOfCorporation, int floor){
		String msg = "TRANSACCION REALIZADA DE MANERA EXITOSA";
		companies.add(new ManufacturingCompany( registeredName,  nit,  address,  phoneNumber, employementQuantity,  assetsValue,  constitutionDate,  legalAgentName, typeOfCorporation,  floor));
		return msg;
	}
	/**
	 * Description: This method allows to add products to a manufacturing company, and to a medic company and a food company that are manufacturing companies too.
	 * Pre: The companies that the user are going to add products ware created before
	 * Pre: The parameters must not be null
	 * post the products are added to the company requiered by the user 
	 * @param nit
	 * @param name
	 * @param productCode
	 * @param neededWater
	 * @param inventoryNumber
	 * @return A string that shows the state of the transaction
	 */
	public String addProducts(String nit, String name, String productCode, double neededWater, int inventoryNumber){
		String procul = "";
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i) instanceof ManufacturingCompany){
				if((companies.get(i).getNit().equals(nit))){
					ManufacturingCompany manufacturingCompany=(ManufacturingCompany)companies.get(i);
					procul = manufacturingCompany.addProducts(name, productCode, neededWater, inventoryNumber);
				}
				
			}
		}
		return procul;
	}
	/**
	 * Description: This method allows to calculate the tax that is called "Pro cultura" this tax is calculated to an Education company and to a public company if the value calculated is negative those companies are exempt to pay it
	 * Pre: The companies that the user are going to calculated the pro culture tax ware created before
	 * Pre: The parameters most be not null
	 * Post: The proculura tax is calculated 
	 * @param nit
	 * @return A string that shows the state of the transaction
	 */
	public double defineProCultura(String nit){
		double procul = 0;
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				if((companies.get(i) instanceof EducationCompany)){
					EducationCompany educationCompany=(EducationCompany)companies.get(i);
					procul = educationCompany.proculturaCalculation();
				}else if((companies.get(i) instanceof PublicCompany)){ //PEDIR EXOLICACION
					PublicCompany publicCompany=(PublicCompany)companies.get(i);
					procul = publicCompany.proculturaCalculation();
				}
				
			}
		}
		return procul;
	}
	/**
	 * Description: This method allows to calculate the number of trees that a medic company needs to plant depending of the consumption of water, the company is searched with the nit
	 * Pre: The nit requiered must be of a medic company
	 * Pre: The parameter most be not null
	 * Post: The numbers of trees are calculated
	 * @param nit
	 * @return A double with the number of trees that the medic company needs to plant
	 */
	public double defineTotalWater(String nit){
		double water = 0;
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				if((companies.get(i) instanceof MedicCompany)){
					MedicCompany medicCompany = (MedicCompany)companies.get(i);
					water = medicCompany.numberOfTreesCalculation();
				}
			}
			
			
		}
		return water;
	}
	/**
	 * Description: This method allows to calculate the number of trees that a technology company needs to plant depending of the consumption of energy, the company is searched with the nit
	 * Pre: The nit requiered must be of a technology company
	 * Pre: The parameter most be not null
	 * Post The numbers of trees are calculated
	 * @param nit
	 * @return A double with the number of trees that the technology company needs to plant
	 */
	public double defineTotalEnergy(String nit){
	
		double tree = 0;
		//double totalTree = 0;
		System.out.println("1");
		for(int i =0; i<companies.size(); i++){
			System.out.println("2");
			if(companies.get(i).getNit().equals(nit)){
				System.out.println("3");
				if((companies.get(i) instanceof TechnologyCompany)){
					System.out.println("4");
					TechnologyCompany technologyCompany = (TechnologyCompany)companies.get(i);
					 tree = technologyCompany.numberOfTreesCalculation();
				}
			}
			
			
		}
		return tree;
	}
	/**
	 * Description: This method allows to show the information of the companies created until now
	 * Pre: there must be at least one company
	 * Post: The information of each company is asked
	 * @return A string that shows the information of the companies 
	 */
	
	public String showAllInformation(){
		String msg = "";
		for(int i = 0; i<companies.size(); i++){
			msg += companies.get(i).toString();
		}
		return msg;
	}
	/**
	 * Description: This method allows to add surveys to services companies, the company is searched with the nit
	 * Pre: The nit requiered must be of a service company
	 * Pre: there must be at least one company service company
	 * Pre: The parameters most be not null
	 * Post The poll is added
	 * @param nit
	 * @param serviceQuality
	 * @param timeQuality
	 * @param valueQuality
	 * @return A message that shows the state of the transaction
	 */
	public String addPollsToACompany(String nit,double serviceQuality,double timeQuality, double valueQuality ){
		String msg = "" ;
		boolean centinel = true;
		for(int i =0; i<companies.size() && centinel == true; i++){
			if(companies.get(i).getNit().equals(nit)){
				
				ServiceCompany serviceCompany = (ServiceCompany)companies.get(i);
				msg = serviceCompany.addPolls(serviceQuality, timeQuality, valueQuality);
				
				if(serviceCompany.numberOfPolls() > 50){
					centinel = false;
					msg = "No puedes hacer mas encuestas ya has agregado 50";
				}
				
			}
			
		}
		return msg;
	}
	/**
	 * Description: This method allows to add an employee to a cubicle of the tower of the company, the company is searched with the nit
	 * Pre: The parameters most be not null
	 * Pre: there must be at least one company
	 * post: The employee is added 
	 * @param nit
	 * @param email
	 * @param employeeName
	 * @param job
	 * @param extension
	 * @return A message that shows which company the employee was added 
	 */
	public String addEmployee(String nit, String email, String employeeName, String job, String extension){
		String msg = "";
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				ServiceCompany serviceCompany = (ServiceCompany)companies.get(i);
				msg = serviceCompany.addEmployeToCubicles(email, employeeName, job, extension);
				
			}
			
		}
		return msg;
	}
	/**
	 * Description: this method allows to search the extension of an employee with the name of the employee, make the route of the cubicles of the in the form of L, the company is searched with the nit
	 * Pre: The employee was added before
	 * Post: The employee is asked 
	 * @param nit
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String askWithLetter_L(String nit, String extension){
		String msg = "";
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				ServiceCompany serviceCompany = (ServiceCompany)companies.get(i);
				msg = serviceCompany.letter_L(extension);
				
			}
			
		}
		return msg;
	}
	/**
	 * Description: This method allows to search the extension of an employee with the name of the employee, make the route of the cubicles of the in the form of X, the company is searched with the nit
	 * Pre: The employee was added before
	 * Pre: The parameters most be not null
	 * Post: The employee is asked
	 * @param nit
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String askWithLetter_X(String nit, String extension){
		String msg = "";
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				/*
				ServiceCompany serviceCompany = (ServiceCompany)companies.get(i);
				msg = serviceCompany.letter_X(extension);
				*/
				msg = companies.get(i).letter_X(extension);
			}
			
		}
		return msg;
	}
	/**
	 * Description:This method allows to search the extension of an employee with the name of the employee, make the route of the cubicles of the in the form of E, the company is searched with the nit 
	 * Pre: The number of floors of the tower of the company most be odd
	 * Pre: The parameters most be not null
	 * Pre: The employee was added before
	 * @param nit
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String askWithLetter_E(String nit, String extension){
		String msg = "";
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				//ServiceCompany serviceCompany = (ServiceCompany)companies.get(i);
				msg = companies.get(i).letter_E(extension);
				
			}
			
		}
		return msg;
	}
	/**
	 * Description:This method allows to search the extension of an employee with the name of the employee, make the route of the cubicles of the in the form of O, the company is searched with the nit
	 * Pre: The parameters most be not null
	 * Pre: The employee was added before
	 * @param nit
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String askWithLetter_O(String nit, String extension){
		String msg = "";
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				//ServiceCompany serviceCompany = (ServiceCompany)companies.get(i);
				msg = companies.get(i).letter_O(extension);
				
			}
			
		}
		return msg;
	}
	/**
	 * Description:This method allows to search the extension of an employee with the name of the employee, make the route of the cubicles of the in the form of Z, the company is searched with the nit
	 * Pre: The parameters most be not null
	 * Pre: The employee was added before
	 * @param nit
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String askWithLetter_Z(String nit, String extension){
		String msg = "";
		for(int i =0; i<companies.size(); i++){
			if(companies.get(i).getNit().equals(nit)){
				//ServiceCompany serviceCompany = (ServiceCompany)companies.get(i);
				msg = companies.get(i).letter_Z(extension);	
			}		
		}
		return msg;
	}
}
//matriz[].length//columnas