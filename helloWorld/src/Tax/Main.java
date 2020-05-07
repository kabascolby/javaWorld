package Tax;

public class Main {
    public static void main(String[] args) {
        var taxCalulator2018 = new TaxCalculator2018(10_000);

        var report = new TaxReport(taxCalulator2018);
        report.show();
        
        report.setCalculator(new TaxCalculator2018());
        report.show(new TaxCalculator2018(45000));
    }

}