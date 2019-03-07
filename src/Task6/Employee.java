package Task6;

public class Employee {
    private double tariffPerHour = 5.5;
    public int hours;

    public Employee() {
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public double getSalary(int hours) {
        return tariffPerHour * hours;
    }
}
