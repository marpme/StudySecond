package main;

import matrices.IdentityMatrix;
import matrices.Matrix;
import matrices.QuadraticMatrix;
import matrices.Vector;

/**
 * Created by marvinpiekarek on 17/11/2016.
 */
public class Main {

    public static void main(String[] args) {

        //Identity Matrix creation
        IdentityMatrix a = new IdentityMatrix(5);
        System.out.println(a);

        // Vector functions/creation
        Vector v = new Vector(new float[]{0, 2, -2, 91}, true);
        Vector x = new Vector(new float[]{1, 1, 1, 1}, true);

        System.out.println(v.add(x));
        //That's not possible and throws an error
        //because multiplying two vector is not possible
        //System.out.println(v.multiply(x));
        System.out.println(v.multiplyScalar(2));

        System.out.println(v);
        System.out.println(v.length());
        System.out.println(x);
        System.out.println(x.length());

        // quadratic matrix creation/functions
        QuadraticMatrix qw = new QuadraticMatrix(new float[][]{{2, 6, 5},{4, 4, 8}, {5, 5, 7}});
        System.out.println(qw);

        Matrix powTwoQW = qw.pow(2);
        System.out.println(powTwoQW);

        Matrix powZeroQW = qw.pow(0);
        System.out.println(powZeroQW);

        Matrix powOneQW = qw.pow(1);
        System.out.println(powOneQW);
    }

}
