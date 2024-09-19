public class PartTimeEmployee extends Employee {

    //attributes for the part-time employees separately
    int hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(int hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}