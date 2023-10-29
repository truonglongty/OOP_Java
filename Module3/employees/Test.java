package Module3.employees;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Employees> nv = new ArrayList<>();
		nv.add(new SalariedEmployee("Employee 1","123456789", 1000.0));
        nv.add(new HourlyEmployee("Employee 2","987654321", 40.0, 15.0));
        nv.add(new CommissionEmployee("Employee 3","112334292", 20000.0, 10.0));
        nv.add(new BasePlusCommissionEmployee("Employee 4","001237427", 25000.0, 12.0, 1000.0));
        
        for(Employees ls : nv) {
        	System.out.println(ls);
        }
        
        System.out.println("\n======================BẢNG LƯƠNG======================");
        for (Employees employee : nv) {
            System.out.println(employee.getName() + ": " + employee.luong());
        }
        
	}
}
