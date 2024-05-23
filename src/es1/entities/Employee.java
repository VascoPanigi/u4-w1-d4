package es1.entities;

import es1.enums.Department;

import java.util.Random;

public class Employee {
    //    public Employee[] lastThreeEmployees;
    private int intern;
    private int salary;
    private Department department;


    public Employee(Department department) {
        Random random = new Random();
        this.intern = random.nextInt(10000, 15000);
        this.salary = 1200;
        this.department = department;
//        this.lastThreeEmployees = new Employee[3];
    }

//    public createLastThreeEmployees(Employee employee1, Employee employee2, Employee employee3){
//        lastThreeEmployees[0] = employee1;
//        lastThreeEmployees[1] = employee2;
//        lastThreeEmployees[2] = employee3;
//    }

    public int getIntern() {
        return intern;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }


}
