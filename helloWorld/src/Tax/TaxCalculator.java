package Tax;

public interface TaxCalculator {
    /* 
        for interface there is no need to declare a method as public.
        also all the method are by defaul like abstract method they have to
        be implemented by all the class wich using this interface
    */
    double calculateTax();

}