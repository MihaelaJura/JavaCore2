package Task7;

import Task6.Employee;

public class Manager extends Employee {

    public double getSalary(int hours) {
        return super.getSalary(hours) + ((super.getSalary(hours) * 50) / 100);
    }

}
