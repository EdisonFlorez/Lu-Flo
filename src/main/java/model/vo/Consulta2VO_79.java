package model.vo;

public class Consulta2VO_79 {
	private String name;
	private int salary;
	private double deductible;
	private String last_names;
	
	public Consulta2VO_79(){}
	public Consulta2VO_79(String name, int salary, double deductible, String last_names){
		this.name = name;
		this.salary = salary;
		this.deductible = deductible;
		this.last_names = last_names;
	}


	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public double getDeductible(){
		return deductible;
	}
	public void setDeductible(double deductible){
		this.deductible = deductible;
	}
	
	public String getLastNames(){
		return last_names;
	}
	public void setLastNames(String last_names){
		this.last_names = last_names;
	}



		

    
}
