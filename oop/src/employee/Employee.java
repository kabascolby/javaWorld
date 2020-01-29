package employee;

/**
 * Employee
 */
public class Employee {

    private int baseSalary;
    private int hourlyRate;

    // Static field
    public static int numberOfEmployees;

    // Static method;
    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return (baseSalary + (hourlyRate * extraHours));
    }

    // Method overloading
    public int calculateWage() {
        return calculateWage(0);
    }

    // Constructor overloading avoid using it.
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary((baseSalary));
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate has to be greate than 0.");
        this.hourlyRate = hourlyRate;
    }

}