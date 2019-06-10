package model;

public class Tower {
	public static final int ARRAYSIZE = 20;
	private int floors;
	private Cubicle[][] cubicleMatrix;
	/**
	 * Description: The builder of the class Tower
	 * Pre: Parameters most be not null
	 * @param floors
	 */
	public Tower(int floors) {
		this.floors = floors;
		cubicleMatrix = new Cubicle[floors][ARRAYSIZE];
		initializeCubicles();
	}
	/**
	 * Description: This method allows to get the matrix of the cubicles of the tower
	 * @return
	 */
	public Cubicle[][] getCubicleMatrix() {
		return cubicleMatrix;
	}
	/*
	public void setCubicleMatrix(Cubicle[][] cubicleMatrix) {
		this.cubicleMatrix = cubicleMatrix;
	}
	*/
	/**
	 * Description: This method allows to initialize the cubicles of the tower
	 * Post: The cubicles of the tower are initialized 
	 */
	private void initializeCubicles() {
		for(int i = 0; i<cubicleMatrix.length; i++) {
			for(int j = 0; j < cubicleMatrix[0].length; j++) {
				cubicleMatrix[i][j] = new Cubicle("33"+i+j);
			}
		}
	}
	/**
	 * Description: This method allows to set the atributtes of an employee in a cubicle of the tower
	 * Pre: The matrix was initialized 
	 * Pre: The parameters most be not null
	 * Post: The attributes are set
	 * @param email
	 * @param employeeName
	 * @param job
	 * @param extension
	 * @return A string that shows the state of the transaction
	 */
	public String addEmployeToCubicles(String email, String employeeName, String job, String extension) {
		boolean centinel = false;
		String msg = "Agregado con exito";
		for(int i = 0; i<cubicleMatrix.length && centinel == false; i++) {
			for(int j = 0; j < cubicleMatrix[0].length && centinel == false ; j++) {
				if(cubicleMatrix[i][j].getEmail().equals("") && centinel == false){
					cubicleMatrix[i][j].setEmail(email);
					cubicleMatrix[i][j].setEmployeName(employeeName);
					cubicleMatrix[i][j].setJob(job);
					cubicleMatrix[i][j].setExtension(extension);
					centinel = true;
				}
				
			}
		}
	return msg;
	}
	//BIEN
	/**
	 * Description: This method allows to compare the name of the employee joined by the user and traverse the matrix comparing in form of X each name of the employees, if the method find the name return the extension of the employee
	 * Pre: The parameters most be not null
	 * Post: The extension is searched
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String letter_X(String extension){
		String msgInverse = "";
			for(int i = 0; i<cubicleMatrix.length; i++ ){
				if(cubicleMatrix[i][cubicleMatrix.length-i-1].getEmployeName().equals(extension)) {
					msgInverse = cubicleMatrix[i][cubicleMatrix.length-i-1].getExtension();
				}
				if(cubicleMatrix[i][i].getEmployeName().equals(extension)) {
					msgInverse = cubicleMatrix[i][i].getExtension();
				}
			}
			
			
		return msgInverse;
	}
	/**
	 * Description: This method allows to compare the name of the employee joined by the user and traverse the matrix comparing in form of Z each name of the employees, if the method find the name return the extension of the employee
	 * Post: The extension is searched
	 * Pre: The parameters most be not null
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String letter_Z(String extension) {
		String msg = "";
		for(int i = 0; i<cubicleMatrix.length; i++){
			if(cubicleMatrix[0][i].getEmployeName().equals(extension)) {
				msg = cubicleMatrix[0][i].getExtension();
			}
		}
		
		for(int i = 1; i<cubicleMatrix.length; i++ ){
			if(cubicleMatrix[i][i].getEmployeName().equals(extension)) {
				System.out.println("MATEO ES EL MEJOR");
				msg = cubicleMatrix[i][i].getExtension();
				
			}
		}
		for(int h = 0; h<cubicleMatrix.length; h++){
			if(cubicleMatrix[h][cubicleMatrix.length].getEmployeName().equals(extension)){
				System.out.println("MATEO ES EL MEJOR");
				msg = cubicleMatrix[h][cubicleMatrix.length].getExtension();
			}
		}
		return msg;	
	}
	/**
	 * Description: This method allows to compare the name of the employee joined by the user and traverse the matrix comparing in form of X each name of the employees, if the method find the name return the extension of the employee
	 * Pre: The parameters most be not null
	 * Post the extension is searched
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String letter_L(String extension) {
		String msg = "";
		for(int i = 0; i<cubicleMatrix[0].length; i++){
			if(cubicleMatrix[0][i].getEmployeName().equals(extension)) {
				msg = cubicleMatrix[0][i].getExtension();
			}
		}
		for(int k = 0; k<cubicleMatrix.length; k++){
			if(cubicleMatrix[k][0].getEmployeName().equals(extension)){
				msg = cubicleMatrix[k][0].getExtension();
			}
		}
		
		return msg;
	}
	/**
	 * Description: This method allows to compare the name of the employee joined by the user and traverse the matrix comparing in form of O each name of the employees, if the method find the name return the extension of the employee
	 * Pre: The parameters most be not null
	 * Post the extension is searched
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String letter_O(String extension){
		String msg = "";
		for(int i = 0; i<cubicleMatrix[0].length; i++){
			if(cubicleMatrix[0][i].getEmployeName().equals(extension)) {
				msg = cubicleMatrix[0][i].getExtension();
			}
		}
	
		for(int j = 0; j<cubicleMatrix[0].length; j++){
			if(cubicleMatrix[cubicleMatrix.length-1][j].getEmployeName().equals(extension)){
				msg = cubicleMatrix[cubicleMatrix.length-1][j].getExtension();
			}
		}
		for(int k = 0; k<cubicleMatrix.length; k++){
			if(cubicleMatrix[k][0].getEmployeName().equals(extension)){
				msg = cubicleMatrix[k][0].getExtension();
			}
		}
		for(int h = 0; h<cubicleMatrix.length; h++){
			if(cubicleMatrix[h][cubicleMatrix[0].length-1].getEmployeName().equals(extension)){
				msg = cubicleMatrix[h][cubicleMatrix[0].length-1].getExtension();
			}
		}
		
		return msg;
	}
	/**
	 * Description: This method allows to compare the name of the employee joined by the user and traverse the matrix comparing in form of E each name of the employees, if the method find the name return the extension of the employee
	 * Pre: The parameters most be not null
	 * Post the extension is searched
	 * @param extension
	 * @return A string with the extension of the employee required by the user
	 */
	public String letter_E(String extension){
		int m = 0;
		String msg = "";
		for(int i = 0; i < cubicleMatrix.length; i+=2) {
			for(int j = 0; j < cubicleMatrix.length;j++){
				if(m%2==0){
					if(cubicleMatrix[i][j].getEmployeName().equals(extension)){
						msg = cubicleMatrix[i][j].getExtension();
					}
					else{
						if(cubicleMatrix[i][((cubicleMatrix.length)-j-1)].getEmployeName().equals(extension)){
							msg = cubicleMatrix[i][cubicleMatrix.length-j-1].getExtension();
							}
						}
					}
				}
				
				if(m%2==0 && i < cubicleMatrix.length-1) {
					if(cubicleMatrix[i+1][cubicleMatrix.length-1].getEmployeName().equals(extension)){
						msg = cubicleMatrix[i+1][cubicleMatrix.length-1].getExtension();
					}
				}
			
		} 
		return msg;
	}
	
	
	
	
}
