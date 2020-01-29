package employee;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(25);
        var employee2 = new Employee(50_000);
        var wage2 = employee2.calculateWage();
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(wage));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(wage2));
        Employee.printNumberOfEmployees();
    }
}