package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePeHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePeHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePeHour() {
		return valuePerHour;
	}

	public void setValuePeHour(Double valuePeHour) {
		this.valuePerHour = valuePeHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour*hours;
	}

}
