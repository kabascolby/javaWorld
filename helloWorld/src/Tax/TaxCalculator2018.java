package Tax;

public class TaxCalculator2018 implements TaxCalculator{
    private double taxIncome;

    public TaxCalculator2018(double taxIncome) {
        this.taxIncome = taxIncome;
    }
    
    //constructor overloading
    public TaxCalculator2018(){
        this(0);
    }

    @Override
    public double calculateTax(){
        return taxIncome * 0.3;
    }
}