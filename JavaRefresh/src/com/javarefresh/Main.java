package com.javarefresh;

public class Main {

    public static void main(String[] args) {

        /* var console = new Console(new Scanner(System.in));

        int principal = (int)console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float)console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte)console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MorgageCalculator(principal, annualInterest, years);

        var report2020 = new MorgageReport(calculator);

        report2020.printMortgage();
        report2020.printPaymentSchedule();
 */

        var control = new TextBox(true);

        System.out.println(control.isEnabled());
        control.disable();
    
        System.out.println(control.isEnabled());
        control.setText("lamine");
        System.out.println(control); 

        show(new TextBox(false));

        var pointA = new Point(1, 4);
        var pointB = new Point(1, 4);

        System.out.println(pointA.equals(pointB));
        System.out.println(pointA == pointB);
        System.out.println(Integer.valueOf(pointB.hashCode()).equals(Integer.valueOf(pointA.hashCode())));
        
        UIControl controls[] = {new CheckBox(), control};

        for(var i : controls){
            i.render();
        }
    }

    static void show(UIControl control) {
         
        if(control instanceof TextBox) {
            TextBox text = (TextBox)control;
            text.setText("Mohamed");
            System.out.println(text);
        }

    }
}
