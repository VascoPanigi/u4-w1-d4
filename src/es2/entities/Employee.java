package es2.entities;

import es1.enums.Department;

import java.util.Random;

public abstract class Employee {
    protected int intern;
    protected int salary;
    protected Department department;


    public Employee() {
        Random random = new Random();
        this.intern = random.nextInt(10000, 15000);
        this.salary = 1200;
    }

    public Employee(Department department) {
        Random random = new Random();
        this.intern = random.nextInt(10000, 15000);
        this.salary = 1200;
        this.department = department;
    }

    public abstract int calculateSalary();

    public abstract void getInfo();

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
