package es2;

import es2.entities.Employee;
import es2.entities.Executive;
import es2.entities.FullTimeEmployee;
import es2.entities.PartTimeEmployee;
import es2.enums.Department;

public class Main {
    public static void main(String[] args) {

        Executive rob = new Executive(Department.ADMINISTRATION);
        FullTimeEmployee tim = new FullTimeEmployee(Department.SALES);
        FullTimeEmployee rex = new FullTimeEmployee(Department.ADMINISTRATION);
        FullTimeEmployee tex = new FullTimeEmployee(Department.ADMINISTRATION);
        PartTimeEmployee sam = new PartTimeEmployee(Department.PRODUCTION);
        PartTimeEmployee bob = new PartTimeEmployee(Department.PRODUCTION);
        PartTimeEmployee col = new PartTimeEmployee(Department.SALES);
        PartTimeEmployee max = new PartTimeEmployee(Department.PRODUCTION);


        rob.getInfo();
        tim.getInfo();
        sam.getInfo();

        Employee[] employeesList = {rob, rex, tim, sam, bob, col, max, tex};
        int totalSalaryExecutives = 0;
        int totalSalaryFullTimes = 0;
        int totalSalaryPartTimes = 0;

        for (int i = 0; i < employeesList.length; i++) {
            Employee currentEmployee = employeesList[i];


            if (currentEmployee instanceof Executive) {
                totalSalaryExecutives += currentEmployee.getSalary();
            }
            if (currentEmployee instanceof FullTimeEmployee) {
                totalSalaryFullTimes += currentEmployee.getSalary();
            } else {
                totalSalaryPartTimes += currentEmployee.getSalary();
            }

        }

        System.out.println("Total executives: " + totalSalaryExecutives);
        System.out.println("Total full time employees: " + totalSalaryFullTimes);
        System.out.println("Total part time employees: " + totalSalaryPartTimes);

    }
}