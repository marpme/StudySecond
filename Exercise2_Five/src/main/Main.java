package main;
import matrices.*;

/**
 * An Ad-hoc testing class for all matrices.
 * @author Marvin Piekarek
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf("Test is running ...%n");
        System.out.printf("Starting with Identity Matrix:%n");
        TestIdentityMatrix();
        System.out.printf("%nStarting the Vector test next:%n");
        TestVectors();
        System.out.printf("%nStarting last QuadraticMatrix test:%n");
        TestQuadraticMatrix();
    }

    public static void TestIdentityMatrix(){
        //Identity Matrix creation
        IdentityMatrix a = new IdentityMatrix(5);
        System.out.printf("%n%s%n", a);
        try{
            IdentityMatrix b = new IdentityMatrix(-1);
            System.out.printf("%nUhm, that's not good ...%n");
        }catch (IllegalArgumentException e){
            System.out.printf("%n" + e.getMessage() + "%n");
        }
    }

    public static void TestVectors(){
        // Vector functions/creation
        Vector v = new Vector(new double[]{0, 2, -2, 91});
        Vector x = new Vector(new double[]{1, 1, 1, 1});

        System.out.printf("%n%s%n", v.add(x));
        //That's not possible and throws an error
        try{
            System.out.println(v.multiply(x));
        }catch(ArithmeticException e){
            System.out.printf("%n" + e.getMessage() + "%n");
        }

        System.out.printf("%n%s%n", v.multiplyScalar(2));

        System.out.printf("%n%s%n", v);
        System.out.printf("%nVector v length: %s%n", v.length());
        System.out.printf("%n%s%n", x);
        System.out.printf("%nVector x length: %s%n", x.length());
    }

    public static void TestQuadraticMatrix(){
        // quadratic matrix creation/functions
        QuadraticMatrix qw = new QuadraticMatrix(new double[][]{{2, 6, 5},{4, 4, 8}, {5, 5, 7}});
        System.out.printf("%n%s%n", qw);

        try{
            Matrix powMinus = qw.pow(-1);
            System.out.println(powMinus);
            System.out.printf("%n Ups something went wrong. %n");
        }catch(IllegalArgumentException e){
            System.out.printf("%n"+e.getMessage()+"%n");
        }


        Matrix powTwoQW = qw.pow(2);
        System.out.printf("%n%s%n", powTwoQW);

        Matrix powZeroQW = qw.pow(0);
        System.out.printf("%n%s%n", powZeroQW);

        Matrix powOneQW = qw.pow(1);
        System.out.printf("%n%s%n", powOneQW);
    }

}
