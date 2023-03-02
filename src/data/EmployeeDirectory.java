/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author gunjitarora
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getAllEmployee() {
        return employeeList;
    }

    public Employee getEmployee(String employeeId) {
        return employeeList.stream().filter((u) -> u.getEmployeeId().equals(employeeId)).findAny().get();
    }

    public boolean addEmployee(Employee employee) {
        employee.generateEmployeeId();
        return employeeList.add(employee);
    }

    public Employee updateEmployee(String employeeId, Employee employee) {
        int index = employeeList.indexOf(employeeList.stream().filter((u) -> u.getEmployeeId().equals(employeeId)).findAny().get());
        return employeeList.set(index, employee);
    }

    public boolean removeEmployee(Employee employee) {
        return employeeList.remove(employee);
    }

    public boolean removeEmployee(String employeeId) {
        return employeeList.removeIf((u) -> u.getEmployeeId().equals(employeeId));
    }
    
}
