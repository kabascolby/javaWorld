package Employee;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

  
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    //contructor overloading is also possible cause contructor are like method

    // first way to do it is to use the setter we already implemented
    // public Employee(int baseSalary) {
    //     setBaseSalary(baseSalary);
    //     setHourlyRate(0);
    // }

    //the second way to do it is to use ``this`` keyword to call the first constructor
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public static void printNumberOfEmployee() {
        System.out.println(numberOfEmployees);
    }
    
    // method overloading

    public int calculateWage() {
        return calculateWage(0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
    
    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

}