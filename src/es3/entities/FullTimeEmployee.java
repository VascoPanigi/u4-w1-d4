package es3.entities;

import es3.enums.Department;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(Department department) {
        super(department);
        this.salary = calculateSalary();
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.getSalary();
        int bonus = 1;
        return baseSalary * bonus;
    }

    @Override
    public void getInfo() {
        System.out.println("My intern is: " + this.intern);
        System.out.println("My salary is: " + this.salary);
        System.out.println("My department is: " + this.department);

    }

}
