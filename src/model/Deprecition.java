package model;

public class Deprecition {
	
	private String batch;
	private Double size ;
	private Double Deprecition ;
	
	public void setVisable(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Double getDeprecition() {
		return Deprecition;
	}

	public void setDeprecition(Double deprecition) {
		Deprecition = deprecition;
	}

	public Deprecition(String batch, Double size, Double deprecition) {
		super();
		this.batch = batch;
		this.size = size;
		Deprecition = deprecition;
	}

	public Deprecition() {
		super();
	}
	
	
	
	
}
