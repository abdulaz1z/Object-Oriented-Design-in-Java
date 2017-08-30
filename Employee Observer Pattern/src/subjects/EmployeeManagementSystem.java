package subjects;

import domain.EmployeeDao;
import domain.Employee;
import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {
    private Employee employee;
    private String msg;
    private EmployeeDao employeeDao;
    private List<IObserver> observers;
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employeeDao = new EmployeeDao();
        observers = new ArrayList<IObserver>();
        employees = new ArrayList<Employee>();
        employees = employeeDao.generateEmployees();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
//        msg = "registered a new observer";
//        notifyObservers();
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
//        msg = "removed an observer";
//        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (IObserver departments : observers) {
            departments.callMe(employee, msg);
//            System.out.println(msg);
        }
    }

    public void hireNewEmployee(Employee emp){
        employee = emp;
        msg = "New Hire: ";
        employees.add(emp);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String name){
        boolean notify = false;
        for (Employee e: employees) {
            if (id == e.getId()){
                this.msg = "Employee name has been modified from " + e.getName() + " to";
                e.setName(name);
                this.employee = e;
                notify = true;
            }
        }

        if (notify){
            notifyObservers();
        }else{
            System.out.println("Employee does not exist with id " + id);
        }
    }
}
