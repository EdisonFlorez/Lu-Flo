package model.vo;

public class Consulta1VO_79 {
	private int project_id;
	private String start_date;
	private String banking_entity;
	private	String serial;

	public Consulta1VO_79(){}
	public Consulta1VO_79(int project_id, String start_date, String banking_entity, String serial){
		this.project_id = project_id;
		this.start_date = start_date;
	 	this.banking_entity = banking_entity;
		this.serial = serial;
	}
	

	public int getId(){
		return project_id;
	}
	public void setId(int project_id){
		this.project_id = project_id;
	}

	public String getDate(){
		return start_date;
	}
	public void setDate(String start_date){
		this.start_date = start_date;
	}

	public String getBank(){
		return banking_entity;
	}
	public void setBank(String banking_entity){
		this.banking_entity = banking_entity;
	}

	public String getSerial(){
		return serial;
	}
	public void setSerial(String serial){
		this.serial = serial;
	}

}
