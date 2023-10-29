package Module3.employees;

public abstract class Employees {
	protected String name, SSN;

	
	public Employees() {}
	public Employees(String name, String sSN) {
		this.name = name;
		this.SSN = sSN;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public abstract double luong();

	@Override
	public String toString() {
		return "Employees [name=" + name + ", SSN=" + SSN + "]";
	}

}
