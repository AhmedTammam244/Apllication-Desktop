package model;

import java.sql.Date;

public class Full_Product_Store {
	private String product;
	private Double newcomer;
	private Double inflected;
	private Double  balance;
	private String notes;
	private String material1;
	private String material2;
	private String material3;
	private String material4;
	private Date 	date_of_newcomer;
	private Date 	date_of_inflected;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Double getNewcomer() {
		return newcomer;
	}
	public void setNewcomer(Double newcomer) {
		this.newcomer = newcomer;
	}
	public Double getInflected() {
		return inflected;
	}
	public void setInflected(Double inflected) {
		this.inflected = inflected;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getMaterial1() {
		return material1;
	}
	public void setMaterial1(String material1) {
		this.material1 = material1;
	}
	public String getMaterial2() {
		return material2;
	}
	public void setMaterial2(String material2) {
		this.material2 = material2;
	}
	public String getMaterial3() {
		return material3;
	}
	public void setMaterial3(String material3) {
		this.material3 = material3;
	}
	public String getMaterial4() {
		return material4;
	}
	public void setMaterial4(String material4) {
		this.material4 = material4;
	}
	public Date getDate_of_newcomer() {
		return date_of_newcomer;
	}
	public void setDate_of_newcomer(Date date_of_newcomer) {
		this.date_of_newcomer = date_of_newcomer;
	}
	public Date getDate_of_inflected() {
		return date_of_inflected;
	}
	public void setDate_of_inflected(Date date_of_inflected) {
		this.date_of_inflected = date_of_inflected;
	}
	public Full_Product_Store(String product, Double newcomer, Double inflected, Double balance, String notes,
			String material1, String material2, String material3, String material4, Date date_of_newcomer,
			Date date_of_inflected) {
		
		this.product = product;
		this.newcomer = newcomer;
		this.inflected = inflected;
		this.balance = balance;
		this.notes = notes;
		this.material1 = material1;
		this.material2 = material2;
		this.material3 = material3;
		this.material4 = material4;
		this.date_of_newcomer = date_of_newcomer;
		this.date_of_inflected = date_of_inflected;
	}
	
}
