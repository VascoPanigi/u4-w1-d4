package es3.entities;

import es1.enums.Department;
import es2.entities.Employee;

public class Executive extends Employee {

    public Executive(Department department) {
        super(department);
        this.salary = calculateSalary();
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.getSalary();
        int bonus = 2;  // I'm too lazy to write 100%...

//        int totalSalary = baseSalary * bonus;
        return baseSalary * bonus;
    }

    @Override
    public void getInfo() {
        System.out.println("My intern is: " + this.intern);
        System.out.println("My salary is: " + this.salary);
        System.out.println("My department is: " + this.department);

    }

}
