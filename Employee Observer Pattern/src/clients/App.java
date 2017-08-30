package clients;

import domain.Employee;
import observers.HRDepartment;
import observers.PayrollDepartment;
import subjects.EmployeeManagementSystem;
import observers.IObserver;

public class App {
    public static void main(String[] args) {
        IObserver hrSystem = new HRDepartment();
        IObserver payroll = new PayrollDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.registerObserver(hrSystem);
        ems.registerObserver(payroll);

        Employee bob = new Employee("Bob A.", 33, true);
        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(1, "John J.");


    }
}
