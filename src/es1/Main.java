package es1;

import es1.entities.Employee;
import es1.enums.Department;

public class Main {
    public static void main(String[] args) {


        Employee tim = new Employee(Department.SALES);
        Employee sam = new Employee(Department.PRODUCTION);
        Employee bob = new Employee(Department.ADMINISTRATION);

        Employee[] employeesList = {tim, sam, bob};


        for (int i = 0; i < employeesList.length; i++) {
            Employee currentEmployee = employeesList[i];
            System.out.println(currentEmployee.getIntern());
        }
    }
}
