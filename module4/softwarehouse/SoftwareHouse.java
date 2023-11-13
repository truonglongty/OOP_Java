package module4.softwarehouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SoftwareHouse {
	private String theName;
	private ArrayList<Employee> ds;
	
	public SoftwareHouse(String theName) {
		this.theName = theName;
		ds = new ArrayList<Employee>();
	}
	
	public boolean addEmployee(Employee emp) {
		if(ds.contains(emp))
			return false;
		ds.add(emp);
		return true;
	}
	
	public void displayAllStaff() {
		for (Employee emp : ds) {
			System.out.println(emp);
		}
	}
	
	public double getMonthlySalaryBill() {
		double s = 0;
		for (Employee emp : ds) {
			s += emp.getMonthlySalary();
		}
		return s;
	}
	
	public void sortAllStaffByName() {
		Collections.sort(ds, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1 != null && o2 != null) 
					return o1.theName.compareToIgnoreCase(o2.theName);
				return 0;
			}
		});
	}
	
	public void displayListProgrammers() {
		for (Employee emp : ds) {
			if(emp instanceof Programmer)
				System.out.println(emp);
		}
	}

	public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
		for (Employee emp : ds) {
			if(emp instanceof Administrator) {
				if(emp.getThePayrollNumber() == aPayrollNo) {
					((Administrator) emp).setTheDepartment(deptNew);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean deleteEmployee(int id) {
		for (Employee emp : ds) {
			if(emp.getThePayrollNumber() == id) {
				ds.remove(emp);
				return true;
			}
		}
		return false;
	}
}
