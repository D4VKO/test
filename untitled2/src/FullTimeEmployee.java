public class FullTimeEmployee extends Employee {

    int salary;

    public FullTimeEmployee(int salary) {
        this.salary = salary;
    }

    public int calculateSalary() {
        return salary;
    }
}