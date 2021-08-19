package model.vo;

public class Consulta3VO_79 {
	private int project_id;
	private String name_lastName;

	public Consulta3VO_79(){}
	public Consulta3VO_79(int project_id, String name_lastName){
		this.project_id = project_id;
		this.name_lastName = name_lastName;
	}

	
	public int getId(){
		return project_id;
	}
	public void setId(int project_id){
		this.project_id = project_id;
	}

	public String getNameLastName(){
		return name_lastName;
	}
	public void setNameLastName(String name_lastName){
		this.name_lastName = name_lastName;
	}

}
