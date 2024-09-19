public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        // employee count, full/part, hours and salary/hourly rate

        employees[0] = new FullTimeEmployee(1200);
        employees[1] = new PartTimeEmployee(8, 80);
        employees[2] = new PartTimeEmployee(6, 120);

        for (Employee employee : employees) {
            System.out.println("Bruto alga: " + employee.calculateSalary() + " EUR");
        }
    }
}