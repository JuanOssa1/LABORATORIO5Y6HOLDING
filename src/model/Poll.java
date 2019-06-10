package model;

public class Poll {
	private double serviceQuality;
	private double timeQuality;
	private double valueQuality;
	/**
	 * Description Builder of the class poll
	 * Pre: parameters most be not null
	 * @param serviceQuality
	 * @param timeQuality
	 * @param valueQuality
	 */
	public Poll(double serviceQuality,double timeQuality, double valueQuality ){
		this.serviceQuality = serviceQuality;
		this.timeQuality = timeQuality;
		this.valueQuality = valueQuality;
	}

}
