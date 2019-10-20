package model;

import java.sql.Date;

public class Manufacturing {
	private String customer;
	private Date date_of_order;
	private Date date_of_delivery;
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Date getDate_of_order() {
		return date_of_order;
	}
	public void setDate_of_order(Date date_of_order) {
		this.date_of_order = date_of_order;
	}
	public Date getDate_of_delivery() {
		return date_of_delivery;
	}
	public void setDate_of_delivery(Date date_of_delivery) {
		this.date_of_delivery = date_of_delivery;
	}
	public Manufacturing(String customer, Date date_of_order, Date date_of_delivery) {
		
		this.customer = customer;
		this.date_of_order = date_of_order;
		this.date_of_delivery = date_of_delivery;
	}
	
}
