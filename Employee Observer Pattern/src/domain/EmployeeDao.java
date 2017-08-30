package domain;

import domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    Employee emp1 = new Employee("Abdul Aziz", 23, true);
    Employee emp2 = new Employee("Abdul Mohith", 25, true);
    Employee emp3 = new Employee("Abdur Rokib", 27, true);
    Employee emp4 = new Employee("Abdul Odud", 30, true);

    List<Employee> employees;

    public List<Employee> generateEmployees(){
        employees = new ArrayList<Employee>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;
    };

    public void addEmployee(Employee emp){
        employees.add(emp);
    }
}
