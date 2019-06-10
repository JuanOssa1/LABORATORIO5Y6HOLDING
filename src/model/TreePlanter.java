package model;
/**
 * Description: Interface with the method without to calculate the number of trees
 * @author Juan Ossa PC
 *
 */

public interface TreePlanter {
	public static final int FEWTREES_W = 6;
	public static final int MEDIUMTREES_W = 25;
	public static final int ALOTTREES_W = 200;
	public static final int FEWTREES_E = 8;
	public static final int MEDIUMTREES_E = 35;
	public static final int ALOTTREES_E = 500;
	public int numberOfTreesCalculation();
	
}
