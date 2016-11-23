package calculator;

/**
 * Calculator Class
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
 */
public class Calculator {

    /**
     * Entry point for our GREAT calculator
     * @param args string args with calculation details
     */
    public static void main(String[] args) {

        if(args.length != 3)
        {
            System.out.println("Proper Usage is: java calculator <num> <operator> <num>");
            System.out.println(" => Operator would be: add, sub, mul and div");
            System.out.println(" => Numbers can be written like: 4 or 4.4");

        }else{
            mathCalc(args);
        }
    }

    /**
     * The mathematical parsing method
     * @param args passed through the main method (mathematical args)
     */
    private static void mathCalc(String[] args){
        double a;
        double b;

        try{

            // parsing numbers out of the first and the third args
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

    /**
     * Add method
     * @param a first number
     * @param b second number
     * @return the addition
     */
    private static double add(double a, double b){
        return a + b;
    }

    /**
     * Subtraction method
     * @param a first number
     * @param b second number
     * @return the subtraction
     */
    private static double sub(double a, double b){
        return a - b;
    }

    /**
     * Multiply method
     * @param a first number
     * @param b second number
     * @return multiplied number
     */
    private static double mul(double a, double b){
        return a * b;
    }

    /**
     * Dividing method
     * @param a first number
     * @param b second number
     * @return the divided number
     */
    private static double div(double a, double b){
        if(b == 0) return Double.NaN;

        return a / b;
    }
}
