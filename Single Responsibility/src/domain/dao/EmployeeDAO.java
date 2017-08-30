package domain.dao;
import database.DatabaseConnectionManager;
import domain.Employee;


public class EmployeeDAO {
	DatabaseConnectionManager connectionManager;
	
	public EmployeeDAO(){
		connectionManager = new DatabaseConnectionManager();
	}
	
	public void saveEmployee(Employee emp){
		connectionManager.connect();
		System.out.println("Employee Name " + emp.getName() + " Has Been Saved");
		connectionManager.disconnect();
	}
	
	public void deleteEmployee(Employee emp){
		connectionManager.connect();
		System.out.println("Employee Name " + emp.getName() + " Has Been Deleted");
		connectionManager.disconnect();
	}

}
