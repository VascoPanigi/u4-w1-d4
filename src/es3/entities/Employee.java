package es3.entities;

import es3.enums.Department;
import es3.interfaces.Checker;

import java.util.Random;

public abstract class Employee implements Checker {
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

    @Override
    public void checkIn() {
        System.out.println("An employee just checked in");
    }

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
