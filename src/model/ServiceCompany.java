package model;

import java.util.ArrayList;

public abstract class ServiceCompany extends Company{
	
	private ArrayList <Poll> polls;
	/**
	 * Description: Builder of the class Service Company
	 * Pre: Parameters most be not null
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
public ServiceCompany(String registeredName, String nit, String address, String phoneNumber,
			int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName,
			String typeOfCorporation, int floor) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName, typeOfCorporation, floor);
		polls = new ArrayList<Poll>();
	}

/*
	public ServiceCompany(String registeredName, String nit, String address, String phoneNumber,
			int employementQuantity, double assetsValue, String constitutionDate, String legalAgentName) {
		super(registeredName, nit, address, phoneNumber, employementQuantity, assetsValue, constitutionDate,
				legalAgentName);
		
	}
*/
	/**
	 * Description: This method allows to get the ArrayList of the polls to use it in another class
	 * Pre: The ArrayList was initialized before
	 * @return A string with the value of the attribute "polls"
	 */
	public ArrayList<Poll> getPolls() {
		return polls;
	}
	/**
	 * This method allows to set the attribute polls in the ArrayList
	 * @param polls
	 * 
	 */
	public void setPolls(ArrayList<Poll> polls) {
		this.polls = polls;
	}
	/**
	 * Description: This method allows to add a poll to the ArrayList "polls"
	 * Pre: Parameters most be not null
	 * Pre: The ArrayList was initialized
	 * Post: The poll is added
	 * @param serviceQuality
	 * @param timeQuality
	 * @param valueQuality
	 * @return A string with the state of the transaction 
	 */
	public String addPolls(double serviceQuality,double timeQuality, double valueQuality){
		String msg = "AGREGADO CON EXITO SERVICE";
		Poll poll = new Poll( serviceQuality, timeQuality,  valueQuality);
		polls.add(poll);
		return msg;
	}
	/**
	 * Description: This method allows to calculate the number of polls that are in the arryList polls
	 * @return An int with the nomber of polls
	 */
	public int numberOfPolls(){
		int number = 0;
		for(int i = 0; i < polls.size(); i++){
			number++;
		}
		return number;
	}
	

}
