package model;

public class Cubicle {
	private String employeName;
	private String job;
	private String email;
	private String extension;
	/**
	 * Description: Builder of the class cubicle
	 * Pre: Parameters most be not null 
	 * @param extension
	 */
	public Cubicle(String extension) {
		this.employeName = "";
		this.job = "";
		this.email = "";
		//this.extension = "";
		this.extension = extension;
	}
	/**
	 * Description: This method allows to get the "employeName" to use it in another class
	 * Pre: The parameter "employeName" most be not null
	 * @return A string with the value of the attribute "employeName"
	 */
	public String getEmployeName() {
		return employeName;
	}
	/**
	 * Description: This method allows to get the "job" to use it in another class
	 * Pre: The parameter "job" most be not null
	 * @return A string with the value of the attribute "job"
	 */
	public String getJob() {
		return job;
	}
	/**
	 * Description: This method allows to get the "email" to use it in another class
	 * Pre: The parameter "email" most be not null
	 * @return A string with the value of the attribute "email"
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Description: This method allows to get the "extension" to use it in another class
	 * Pre: The parameter "extension" most be not null
	 * @return A string with the value of the attribute "extension"
	 */
	public String getExtension() {
		return extension;
	}
	/**
	 * Description: This method allows to give a value to the attribute "employeName" in another class
	 * Post: The parameter is set
	 * @param employeName
	 */
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	/**
	 * Description: This method allows to give a value to the attribute "job" in another class
	 * Post: The parameter is set
	 * @param job
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * Description: This method allows to give a value to the attribute "email" in another class
	 * Post: The parameter is set
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Description: This method allows to give a value to the attribute "extension" in another class
	 * Post: The parameter is set
	 * @param extension
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	

}
