package client;


import reporting.EmployeeReportFormatter;
import reporting.FormatType;
import domain.Employee;
import domain.dao.EmployeeDAO;

public class ClientModule {
	EmployeeDAO empDAO = new EmployeeDAO();
	
	public void hireNewEmp(Employee emp){
		System.out.println("Hiring");
		empDAO.saveEmployee(emp);
	}
	
	public void fireEmp(Employee emp){
		System.out.println("Firing");
		empDAO.deleteEmployee(emp);
	}
	
	public void printEmpReport(Employee emp, FormatType formatType){
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
		System.out.println(formatter.getFormattedValue());
	}
	
	public static void main(String[] args) {
		ClientModule client = new ClientModule();
		Employee emp = new Employee(1001, "Abdul Aziz");
		client.printEmpReport(emp, FormatType.CSV);
        System.out.println("done");
    }

}
