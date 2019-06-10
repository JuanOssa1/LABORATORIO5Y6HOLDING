package ui;
import model.*;
import java.util.Scanner;


public class Main
{
	private Scanner dataRead;
	private Holding happyholding;
	
	public Main()
	{
		init();	
	}
	
	/**
	 * Description: This method allows to initialize other methods
	 * @param args
	 */
	public static void main(String args[])
	{
		Main m = new Main();
		m.menu(0);
	}
	/**
	 * Description: This method initialize some methods for default
	 */
	public void init()
	{
	//public TipoDeServicio(String nombre, int numeroDeRealizaciones, double ingresosAcumulados, double valorAcumuladoPorConceptoDeImpuestos)
		//String name, String RegisteredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName
	
	happyholding = new Holding("Holging el paisa papa", "Mano firme motosierra grande","19329392", "Calle2 11-95", 200, 1.1, "200133", Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING, "Juas vern",3 );
	dataRead = new Scanner(System.in);
	happyholding.registerEducationCompany("si ", "1234","ddd","ffff",33, 33.0, "sss","ssss",Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING,"ddd","si","33","ddd","alberto",33,33, 3);
	happyholding.registerMedicCompany("puespuespues", "12345", "ddddd", "ddsdfg", 33, 33333333, "erdf", Company.COMUNALSOCIAL, "JOHANIELS AGENT VIP", "SI", "dddd", "fff", 5);
	happyholding.registerTechnologyCompany("s", 1222, "jaja", "1234567", "ssss", "3333", 23, 22222, "2222", "1", "johaniels vip", 6);	//happyholding.addProducts("12345", "xdxdxd", "111", 2.2, 20);
	happyholding.addProducts("12345", "sss", "ssss", 12, 12);
	}
	/**
	 * Description This method allows to select which menu show
	 * @param option
	 */
	public void menu(int option){
		
		System.out.println("¡BIENVENIDO!, PORFAVOR ESCOJA UNA OPCION");
		System.out.println("1. Agregar una empresa al holding");//WORKING
		System.out.println("2. Calcular procultura");//WORKING
		System.out.println("3. Calcular arboles que necesita plantar una compania medica");//WARNING NOT TESTED
		System.out.println("4. Calcular arboles que necesita plantar una compania tecnologica");//WORKING
		System.out.println("5. Mostrar toda la informacion ingresada");//WORKING
		System.out.println("6. Agregar encuestas a una compania");//WORKING
		System.out.println("7. Agregar empleados a las torres");//WORKING
		System.out.println("8. Buscar empleado con letra L");//WORKING
		System.out.println("9. Buscar empleado con letra X");//WORKING
		System.out.println("10.Buscar empleado con letra Z");//WORKING
		System.out.println("11. Buscar empleado con letra O");//WORKING
		System.out.println("12. Buscar empleado con letra E");//WORKING
		System.out.println("13. Agregar productos a compania medica");//WARNING NOT TESTED
		int opcion = 0;
		opcion = dataRead.nextInt();
		dataRead.nextLine();
		if(opcion == 1) 
		{
			System.out.println("Ingrese el tipo de empresa que desea crear");
			System.out.println("1. Empresa publica");
			System.out.println("2. Empresa educativa");
			System.out.println("3. Empresa tecnologica");
			System.out.println("4. Empresa de Medicamentos");
			System.out.println("5. Empresa de Manofacturacion");
			System.out.println("6. Empresa de comida");
			//System.out.println("7. Empresa de servicios");
			int optionCompany = dataRead.nextInt();dataRead.nextLine();
			if(optionCompany == 1){
				//String typeOfService, int totalSubscribers,int numberOfSubscrib1and2, double serviceQuality,double timeQuality, double valueQuality, double numberOfPolls, String RegisteredName, String nit,String address, String phoneNumber, int employementQuantity, double assetsValue, String constitutionDate, String typeOfCorporation, String legalAgentName 
				System.out.println("AGREGAR EMPRESA PUBLICA");
				System.out.println("Ingrese el tipo de servicio que va a ofrecer la empresa publica");
				System.out.println("1. " + PublicCompany.SEWERAGESERVICE);
				System.out.println("2. " + PublicCompany.ENERGYSERVICE);
				System.out.println("3. " + PublicCompany.AQUEDUCTSERVICE);
				String typeOfService = dataRead.nextLine();
				System.out.println("Ingrese el total de susbcriptores");
				int totalSubsCribers = dataRead.nextInt();dataRead.nextLine();
				System.out.println("Ingrese el numero de subscriptores estrato 1 y 2");
				int numbersOfSubsCribers1and2 = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("¡EXCELENTE ACABA DE INGRESAR LA INFORMACION BASICA! Ahora procederemos a asignar la personalidad juridica");
				System.out.println("Ingrese el nombre de la compañia");
				String registeredName = dataRead.nextLine();
				System.out.println("Ingrese el nit de la empresa");
				String nit = dataRead.nextLine();
				System.out.println("Ingrese la direccion de la empresa");
				String address = dataRead.nextLine();
				System.out.println("Ingrese el numero telefonico de la empresa");
				String phoneNumber = dataRead.nextLine();
				System.out.println("Ingrese el numero de empleados");
				int employementQuantity = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el valor de assets");
				double assetsValue = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("Ingrese la fecha de la constitucion de la empresa");
				String constitutionDate = dataRead.nextLine();
				System.out.println("Ingrese el tipo de la corporacion");
				System.out.println("1. " + Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING);
				System.out.println("3. " + Company.BUILDING);
				System.out.println("4. " + Company.COMUNALSOCIAL);
				System.out.println("5. " + Company.ELECTRICITY_GAS_AND_STEAM);
				System.out.println("6. " + Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES);
				System.out.println("7. " + Company.EXPLOITATION_OF_MINES_AND_QUARRIES);
				System.out.println("8. " + Company.MANUFACTURING_INDUSTRY);
				System.out.println("9. " + Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS);
				System.out.println("10. " + Company.WHOLESALE_AND_RETAIL);
				String typeOfCorporation = dataRead.nextLine();
				System.out.println("Ingrese el nombre del agente legal");
				String legalAgentName = dataRead.nextLine();
				System.out.println("Ingrese el numero de pisos de la torre de la compania, mayor o igual a 3 o menor o igual a 7");
				int floor = dataRead.nextInt(); dataRead.nextLine();
				//happyholding.setLegalpersonality(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, typeOfCorporation, legalAgentName);
				System.out.println(happyholding.registerPublicCompany(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, legalAgentName, typeOfCorporation, typeOfService, totalSubsCribers, numbersOfSubsCribers1and2, floor));
				menu(0);
			}
			
			else if(optionCompany == 2){
				System.out.println("Ingrese el numero de registro ante el MEN");
				String approvalRegistration = dataRead.nextLine();
				System.out.println("Ingrese el numero de anios de acreditacion");
				String accreditationYears = dataRead.nextLine();
				System.out.println("Ingrese el ranking en saber PRO");
				String saberProRanking = dataRead.nextLine();
				System.out.println("Ingrese el nombre del rector");
				String principalName = dataRead.nextLine();
				System.out.println("Ingrese el sector educativo");
				System.out.println("1. "+EducationCompany.EDUCATIONSECTOR_B);
				System.out.println("2. "+EducationCompany.EDUCATIONSECTOR_U);
				String educationSector = dataRead.nextLine();
				System.out.println("Ingrese el numero de estudiantes de estrato 1 y 2");
				int numberOfStudents1and2 = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el numero total de estudiantes");
				int totalStudents = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("¡EXCELENTE ACABA DE INGRESAR LA INFORMACION BASICA! Ahora procederemos a asignar la personalidad juridica");
				System.out.println("Ingrese el nombre de la compañia");
				String registeredName = dataRead.nextLine();
				System.out.println("Ingrese el nit de la empresa");
				String nit = dataRead.nextLine();
				System.out.println("Ingrese la direccion de la empresa");
				String address = dataRead.nextLine();
				System.out.println("Ingrese el numero telefonico de la empresa");
				String phoneNumber = dataRead.nextLine();
				System.out.println("Ingrese el numero de empleados");
				int employementQuantity = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el valor de assets");
				double assetsValue = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("Ingrese la fecha de la constitucion de la empresa");
				String constitutionDate = dataRead.nextLine();
				System.out.println("Ingrese el tipo de la corporacion");
				System.out.println("1. " + Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING);
				System.out.println("3. " + Company.BUILDING);
				System.out.println("4. " + Company.COMUNALSOCIAL);
				System.out.println("5. " + Company.ELECTRICITY_GAS_AND_STEAM);
				System.out.println("6. " + Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES);
				System.out.println("7. " + Company.EXPLOITATION_OF_MINES_AND_QUARRIES);
				System.out.println("8. " + Company.MANUFACTURING_INDUSTRY);
				System.out.println("9. " + Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS);
				System.out.println("10. " + Company.WHOLESALE_AND_RETAIL);
				String typeOfCorporation = dataRead.nextLine();
				System.out.println("Ingrese el nombre del agente legal");
				String legalAgentName = dataRead.nextLine();
				System.out.println("Ingrese el numero de pisos de la torre de la compania, mayor o igual a 3 o menor o igual a 7");
				int floor = dataRead.nextInt(); dataRead.nextLine();
				System.out.println(happyholding.registerEducationCompany(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, legalAgentName, typeOfCorporation, approvalRegistration, accreditationYears, saberProRanking, principalName, educationSector, numberOfStudents1and2, totalStudents, floor));
				menu(0);
			}
			else if(optionCompany == 3){
				System.out.println("Ingrese los servicios ofrecidos");
				System.out.println("1. "+ TechnologyCompany.CONSULTANCY);
				System.out.println("2. "+ TechnologyCompany.CAPACITATION);
				System.out.println("3. "+ TechnologyCompany.SOFTWAREDEVELOPMENT);
				System.out.println("4. "+ TechnologyCompany.SERVICEASINFRASTRUCTURE);
				System.out.println("5. "+ TechnologyCompany.SOFTWAREINFRASTRUCTURE);
				System.out.println("6. "+ TechnologyCompany.PLATFORMASSERVICE);
				String offeredServices = dataRead.nextLine();
				System.out.println("Ingrese el consumo energetico de la compania");
				double energyConsumption = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("¡EXCELENTE ACABA DE INGRESAR LA INFORMACION BASICA! Ahora procederemos a asignar la personalidad juridica");
				System.out.println("Ingrese el nombre de la compañia");
				String registeredName = dataRead.nextLine();
				System.out.println("Ingrese el nit de la empresa");
				String nit = dataRead.nextLine();
				System.out.println("Ingrese la direccion de la empresa");
				String address = dataRead.nextLine();
				System.out.println("Ingrese el numero telefonico de la empresa");
				String phoneNumber = dataRead.nextLine();
				System.out.println("Ingrese el numero de empleados");
				int employementQuantity = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el valor de assets");
				double assetsValue = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("Ingrese la fecha de la constitucion de la empresa");
				String constitutionDate = dataRead.nextLine();
				System.out.println("Ingrese el tipo de la corporacion");
				System.out.println("1. " + Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING);
				System.out.println("3. " + Company.BUILDING);
				System.out.println("4. " + Company.COMUNALSOCIAL);
				System.out.println("5. " + Company.ELECTRICITY_GAS_AND_STEAM);
				System.out.println("6. " + Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES);
				System.out.println("7. " + Company.EXPLOITATION_OF_MINES_AND_QUARRIES);
				System.out.println("8. " + Company.MANUFACTURING_INDUSTRY);
				System.out.println("9. " + Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS);
				System.out.println("10. " + Company.WHOLESALE_AND_RETAIL);
				String typeOfCorporation = dataRead.nextLine();
				System.out.println("Ingrese el nombre del agente legal");
				String legalAgentName = dataRead.nextLine();
				System.out.println("Ingrese el numero de pisos de la torre de la compania, mayor o igual a 3 o menor o igual a 7");
				int floor = dataRead.nextInt(); dataRead.nextLine();
				System.out.println(happyholding.registerTechnologyCompany(offeredServices, energyConsumption, registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, typeOfCorporation, legalAgentName, floor));
				menu(0);
			}
			else if(optionCompany == 4){
				System.out.println("Ingrese la modalidad de la compania publica");
				System.out.println("1. "+MedicCompany.MODALITY_A);
				System.out.println("2. "+MedicCompany.MODALITY_B);
				System.out.println("3. "+MedicCompany.MODALITY_C);
				String modality = dataRead.nextLine();
				System.out.println("Tiene registro sanitario");
				System.out.println("1. Si");
				System.out.println("2. No");
				String sanitaryRegistration = dataRead.nextLine();
				System.out.println("Ingrese la fecha de expiracion");
				String expirationDate = dataRead.nextLine();
				System.out.println("¡EXCELENTE ACABA DE INGRESAR LA INFORMACION BASICA! Ahora procederemos a asignar la personalidad juridica");
				System.out.println("Ingrese el nombre de la compañia");
				String registeredName = dataRead.nextLine();
				System.out.println("Ingrese el nit de la empresa");
				String nit = dataRead.nextLine();
				System.out.println("Ingrese la direccion de la empresa");
				String address = dataRead.nextLine();
				System.out.println("Ingrese el numero telefonico de la empresa");
				String phoneNumber = dataRead.nextLine();
				System.out.println("Ingrese el numero de empleados");
				int employementQuantity = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el valor de assets");
				double assetsValue = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("Ingrese la fecha de la constitucion de la empresa");
				String constitutionDate = dataRead.nextLine();
				System.out.println("Ingrese el tipo de la corporacion");
				System.out.println("1. " + Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING);
				System.out.println("3. " + Company.BUILDING);
				System.out.println("4. " + Company.COMUNALSOCIAL);
				System.out.println("5. " + Company.ELECTRICITY_GAS_AND_STEAM);
				System.out.println("6. " + Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES);
				System.out.println("7. " + Company.EXPLOITATION_OF_MINES_AND_QUARRIES);
				System.out.println("8. " + Company.MANUFACTURING_INDUSTRY);
				System.out.println("9. " + Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS);
				System.out.println("10. " + Company.WHOLESALE_AND_RETAIL);
				String typeOfCorporation = dataRead.nextLine();
				System.out.println("Ingrese el nombre del agente legal");
				String legalAgentName = dataRead.nextLine();
				System.out.println("Ingrese el numero de pisos de la torre de la compania, mayor o igual a 3 o menor o igual a 7");
				int floor = dataRead.nextInt(); dataRead.nextLine();
				System.out.println(happyholding.registerMedicCompany(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, typeOfCorporation, legalAgentName, sanitaryRegistration, expirationDate, modality, floor));
				menu(0);
			}
			else if(optionCompany == 5){
				System.out.println("Ingrese el nombre de la compañia");
				String registeredName = dataRead.nextLine();
				System.out.println("Ingrese el nit de la empresa");
				String nit = dataRead.nextLine();
				System.out.println("Ingrese la direccion de la empresa");
				String address = dataRead.nextLine();
				System.out.println("Ingrese el numero telefonico de la empresa");
				String phoneNumber = dataRead.nextLine();
				System.out.println("Ingrese el numero de empleados");
				int employementQuantity = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el valor de assets");
				double assetsValue = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("Ingrese la fecha de la constitucion de la empresa");
				String constitutionDate = dataRead.nextLine();
				System.out.println("Ingrese el tipo de la corporacion");
				System.out.println("1. " + Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING);
				System.out.println("3. " + Company.BUILDING);
				System.out.println("4. " + Company.COMUNALSOCIAL);
				System.out.println("5. " + Company.ELECTRICITY_GAS_AND_STEAM);
				System.out.println("6. " + Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES);
				System.out.println("7. " + Company.EXPLOITATION_OF_MINES_AND_QUARRIES);
				System.out.println("8. " + Company.MANUFACTURING_INDUSTRY);
				System.out.println("9. " + Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS);
				System.out.println("10. " + Company.WHOLESALE_AND_RETAIL);
				String typeOfCorporation = dataRead.nextLine();
				System.out.println("Ingrese el nombre del agente legal");
				String legalAgentName = dataRead.nextLine();
				System.out.println("Ingrese el numero de pisos de la torre de la compania, mayor o igual a 3 o menor o igual a 7");
				int floor = dataRead.nextInt(); dataRead.nextLine();
				System.out.println(happyholding.registerManufacturingCompany(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, typeOfCorporation, legalAgentName, floor));
				menu(0);
			}
			else if(optionCompany == 6){
				System.out.println("Ingrese el centificado de Sayco & Acinpro");
				String saycoAcinproCertification = dataRead.nextLine();
				System.out.println("Ingrese el registro nacional de turismo");
				String nationalTourismRegistry = dataRead.nextLine();
				System.out.println("¡EXCELENTE ACABA DE INGRESAR LA INFORMACION BASICA! Ahora procederemos a asignar la personalidad juridica");
				System.out.println("Ingrese el nombre de la compañia");
				String registeredName = dataRead.nextLine();
				System.out.println("Ingrese el nit de la empresa");
				String nit = dataRead.nextLine();
				System.out.println("Ingrese la direccion de la empresa");
				String address = dataRead.nextLine();
				System.out.println("Ingrese el numero telefonico de la empresa");
				String phoneNumber = dataRead.nextLine();
				System.out.println("Ingrese el numero de empleados");
				int employementQuantity = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el valor de assets");
				double assetsValue = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("Ingrese la fecha de la constitucion de la empresa");
				String constitutionDate = dataRead.nextLine();
				System.out.println("Ingrese el tipo de la corporacion");
				System.out.println("1. " + Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING);
				System.out.println("3. " + Company.BUILDING);
				System.out.println("4. " + Company.COMUNALSOCIAL);
				System.out.println("5. " + Company.ELECTRICITY_GAS_AND_STEAM);
				System.out.println("6. " + Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES);
				System.out.println("7. " + Company.EXPLOITATION_OF_MINES_AND_QUARRIES);
				System.out.println("8. " + Company.MANUFACTURING_INDUSTRY);
				System.out.println("9. " + Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS);
				System.out.println("10. " +Company.WHOLESALE_AND_RETAIL);
				String typeOfCorporation = dataRead.nextLine();
				System.out.println("Ingrese el nombre del agente legal");
				String legalAgentName = dataRead.nextLine();
				System.out.println("Ingrese el numero de pisos de la torre de la compania, mayor o igual a 3 o menor o igual a 7");
				int floor = dataRead.nextInt(); dataRead.nextLine();
				System.out.println(happyholding.registerFoodCompany(saycoAcinproCertification, nationalTourismRegistry, registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, typeOfCorporation, legalAgentName, floor));
				menu(0);
			}
			else if(optionCompany == 7){
				System.out.println("Ingrese el nombre de la compañia");
				String registeredName = dataRead.nextLine();
				System.out.println("Ingrese el nit de la empresa");
				String nit = dataRead.nextLine();
				System.out.println("Ingrese la direccion de la empresa");
				String address = dataRead.nextLine();
				System.out.println("Ingrese el numero telefonico de la empresa");
				String phoneNumber = dataRead.nextLine();
				System.out.println("Ingrese el numero de empleados");
				int employementQuantity = dataRead.nextInt(); dataRead.nextLine();
				System.out.println("Ingrese el valor de assets");
				double assetsValue = dataRead.nextDouble(); dataRead.nextLine();
				System.out.println("Ingrese la fecha de la constitucion de la empresa");
				String constitutionDate = dataRead.nextLine();
				System.out.println("Ingrese el tipo de la corporacion");
				System.out.println("1. " + Company.AGRICULTUREHUNTINGSILVICULTUREANDFISHING);
				System.out.println("3. " + Company.BUILDING);
				System.out.println("4. " + Company.COMUNALSOCIAL);
				System.out.println("5. " + Company.ELECTRICITY_GAS_AND_STEAM);
				System.out.println("6. " + Company.ESTFINANCIALINSURANCEPROPERTYSERVTOCOMPANIES);
				System.out.println("7. " + Company.EXPLOITATION_OF_MINES_AND_QUARRIES);
				System.out.println("8. " + Company.MANUFACTURING_INDUSTRY);
				System.out.println("9. " + Company.TRANSPORTATION_STORAGE_AND_COMMUNICATIONS);
				System.out.println("10. " + Company.WHOLESALE_AND_RETAIL);
				String typeOfCorporation = dataRead.nextLine();
				System.out.println("Ingrese el nombre del agente legal");
				String legalAgentName = dataRead.nextLine();
				System.out.println("Ingrese el numero de pisos de la torre de la compania, mayor o igual a 3 o menor o igual a 7");
				int floor = dataRead.nextInt(); dataRead.nextLine();
				System.out.println(happyholding.registerManufacturingCompany(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate, typeOfCorporation, legalAgentName, floor));
				menu(0);
			}



		}	
		else if(opcion == 2) 
		{
			System.out.println("Ingrese el nit de la empresa a la que quiere calcular el procultura");
			String nit = dataRead.nextLine();
			if(happyholding.defineProCultura(nit)<0){
			System.out.println("Eximido");
			menu(0);
			}
			else{
				System.out.println(happyholding.defineProCultura(nit));
			}
			menu(0);
		}
		else if(opcion == 3)
		{
		System.out.println("Ingrese el nit de la compania de medicamentos a la cual le quiere calcular el numero de arboles");
		String nit = dataRead.nextLine();
		System.out.println(happyholding.defineTotalWater(nit));
		menu(0);
		}
		else if(opcion == 4) 
		{
		System.out.println("Ingrese el nit de la compania de tecnologica a la cual le quiere calcular el numero de arboles");	
		String nit = dataRead.nextLine();
		System.out.println(happyholding.defineTotalEnergy(nit));
		menu(0);
		}
		else if(opcion == 5){
		System.out.println(happyholding.showAllInformation());
		menu(0);
		}
		else if(opcion == 6){
		System.out.println("Ingrese el nit de la compania que quiere agregar");
		String nit = dataRead.nextLine();
		System.out.println("Ingrese la calidad del servicio");
		double serviceQuality = dataRead.nextDouble(); dataRead.nextLine();
		System.out.println("Ingrese la calidad de la rapidez del servicio");
		double timeQuality = dataRead.nextDouble(); dataRead.nextLine();
		System.out.println("Ingrese la calidad del valor");
		double valueQuality = dataRead.nextDouble(); dataRead.nextLine();
		System.out.println(happyholding.addPollsToACompany(nit, serviceQuality, timeQuality, valueQuality));
		menu(0);
		}
		else if(opcion == 7){
			System.out.println("Ingrese el nit de la compania que quiere agregar");
			String nit = dataRead.nextLine();
			System.out.println("Ingrese el email del empleado");
			String email = dataRead.nextLine();
			System.out.println("Ingrese el nombre del empleado");
			String employeeName = dataRead.nextLine();
			System.out.println("Ingrese el cargo del empleado");
			String job = dataRead.nextLine();
			System.out.println("Ingrese la extension");
			String extension = dataRead.nextLine();
			System.out.println(happyholding.addEmployee(nit, email, employeeName, job, extension));
			//LXZOE	
			menu(0);
		}
		else if(opcion ==8){
			System.out.println("Ingrese el nit de la compania");
			String nit = dataRead.nextLine();
			System.out.println("Ingrese el nombre del empleado");
			String extension = dataRead.nextLine();
			System.out.println(happyholding.askWithLetter_L(nit, extension));
			menu(0);
		}
		else if(opcion == 9){
			System.out.println("Ingrese el nit de la compania");
			String nit = dataRead.nextLine();
			System.out.println("Ingrese el nombren del empleado");
			String extension = dataRead.nextLine();
			System.out.println(happyholding.askWithLetter_X(nit, extension));
			menu(0);
		}
		else if(opcion ==10){
			System.out.println("Ingrese el nit de la compania");
			String nit = dataRead.nextLine();
			System.out.println("Ingrese el nombre del empleado");
			String extension = dataRead.nextLine();
			System.out.println(happyholding.askWithLetter_Z(nit, extension));
			menu(0);
		}
		else if(opcion == 11){
			System.out.println("Ingrese el nit de la compania");
			String nit = dataRead.nextLine();
			System.out.println("Ingrese el nombre del empleado");
			String extension = dataRead.nextLine();
			System.out.println(happyholding.askWithLetter_O(nit, extension));
			menu(0);
		}
		else if(opcion == 12){
			System.out.println("Ingrese el nit de la compania");
			String nit = dataRead.nextLine();
			System.out.println("Ingrese el nombre del empleado");
			String extension = dataRead.nextLine();
			System.out.println(happyholding.askWithLetter_E(nit, extension));
			menu(0);
		}
		else if(opcion ==13){
			System.out.println("Ingrese el nombre ");
			String name = dataRead.nextLine(); 
			System.out.println("Ingrese el nit de la compania medica");
			String nit = dataRead.nextLine();
			System.out.println("Ingrese el codigo del producto");
			String productCode = dataRead.nextLine();
			System.out.println("Ingrese la cantidad de agua requerida para ese producto");
			double neededWater = dataRead.nextDouble();// dataRead.nextLine();
			System.out.println("Ingrese la cantidad de este producto");
			int inventoryNumber = dataRead.nextInt(); //dataRead.nextLine();
			System.out.println(happyholding.addProducts(nit, name, productCode, neededWater, inventoryNumber));
			menu(0);
		}
		else 
		{
			System.out.println("Opcion no existe");
			menu(0);
		}
	}
	

}
