package Tax;

public class TaxReport {
    //Dependency injection (loose coupling)
    private TaxCalculator calculator;

    /* Constructor dependancy injection*/
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public void show(){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }
    
    //last one is a method injection we gona use method overloading to explain this behaviour
    //but it's not mandatory to use method overloading
    public void show(TaxCalculator calculator){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }

    //Setter injection
    /* We use setter injection to change a state of a dependancy in this class*/
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    

}