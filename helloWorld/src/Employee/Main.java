package Employee;

public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee(50_000, 25);
        int wage = employee1.calculateWage(10);
        System.out.println(wage);
        System.out.println(employee1.calculateWage());

        var lamine = new Employee(300_000);
        System.out.println(lamine.calculateWage());
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployee();
    }

    

}