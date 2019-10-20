package model;

import java.sql.Date;

public class Purchases {
	private String seller;
	private Double cash;
	private Double ctedit;
	private Date date;
	private String notes;
	private Date due_date;
	private Date lead_date;
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public Double getCash() {
		return cash;
	}
	public void setCash(Double cash) {
		this.cash = cash;
	}
	public Double getCtedit() {
		return ctedit;
	}
	public void setCtedit(Double ctedit) {
		this.ctedit = ctedit;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Date getLead_date() {
		return lead_date;
	}
	public void setLead_date(Date lead_date) {
		this.lead_date = lead_date;
	}
	public Purchases(String seller, Double cash, Double ctedit, Date date, String notes, Date due_date,
			Date lead_date) {
		
		this.seller = seller;
		this.cash = cash;
		this.ctedit = ctedit;
		this.date = date;
		this.notes = notes;
		this.due_date = due_date;
		this.lead_date = lead_date;
	}
}
