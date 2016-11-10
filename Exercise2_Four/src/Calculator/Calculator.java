package calculator;

/**
 * Created by marvinpiekarek on 01.11.16.
 */
public class Calculator {

    public static void main(String[] args) {

        if(args.length != 3)
        {
            System.out.println("Proper Usage is: java Calculator <num> <operator> <num>");
            System.out.println(" => Operator would be: add, sub, mul and div");
            System.out.println(" => Numbers can be written like: 4 or 4.4");

        }else{
            mathCalc(args);
        }
    }

    public static void mathCalc(String[] args){
        double a;
        double b;

        try{
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[2]);

            switch (args[1]){
                case "add":
                    System.out.printf("%s %s %s is %s %n", args[0], args[1], args[2], add(a,b));
                    break;
                case "sub":
                    System.out.printf("%s %s %s is %s %n", args[0], args[1], args[2], sub(a,b));
                    break;
                case "mul":
                    System.out.printf("%s %s %s is %s %n", args[0], args[1], args[2], mul(a,b));
                    break;
                case "div":
                    System.out.printf("%s %s %s is %s %n", args[0], args[1], args[2], div(a,b));
                    break;
                default:
                    System.out.println("No proper operator was provided.");
                    System.out.println("Available operator are add, sub, mul and div.");
            }

        }catch(NumberFormatException e) {
            System.out.println("<Num> <Operator> <Num2> - Number wasn't a number. Please retry.");
        }

    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double mul(double a, double b){
        return a * b;
    }

    public static double div(double a, double b){
        if(b == 0) return Double.NaN;

        return a / b;
    }
}
