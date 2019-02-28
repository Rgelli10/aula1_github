package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id;
	private Date monant;
	private OrderStatus status;
	
	public Order () {
		
	}

	public Order(Integer id, Date monant, OrderStatus status) {
		this.id = id;
		this.monant = monant;
		this.status = status;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMonant() {
		return monant;
	}

	public void setMonant(Date monant) {
		this.monant = monant;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", monant=" + monant + ", status=" + status + "]";
	}
	
	
}
