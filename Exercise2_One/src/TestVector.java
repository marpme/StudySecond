
public class TestVector {
	
	private static Vector v;
	
	public static void main(String[] args) {
		
		//transpose
        test1();
        //scalarproduct
        test2();
        //invalid scalarproduct (different dimensions)
        test3();
        //tostring test
        test4();
        
	}
	
	public static void test1(){
		//setup the main vector before each test.
        v = new Vector(new float[]{4f, -1f}, false);
        
        v.transpose();
        // has to be true because we set it to false before.
        System.out.println("The vector is now a RowVector? " + v.getIsRowVector());
	}
	
	public static void test2(){
		v = new Vector(new float[]{4f, -1f}, false);
		
        Vector k = new Vector(new float[]{4f, 2f}, false);
        float scalar = v.scalarProduct(k);
        //test if the scalar of both vectors is correctly calculated.
        //expected: 14f;
        System.out.println("The scalarprod. is: " + scalar);
	}
	
	public static void test3(){
		v = new Vector(new float[]{4f, -1f}, false);
        
        // test exceptions with different dimensions
        Vector x = new Vector(new float[]{4f, 2f, 4f}, false);
        try {
        	//try to calculate the scalar.
            v.scalarProduct(x);
            System.out.println("expected Exception, but there was no!");
        }
        catch(IndexOutOfBoundsException e) {
        	// because I'm in the right catch block
        	System.out.println("Exception successfully thrown");
        }
        catch(Exception e) {
        	// because it threw an exception but not the one expected
        	System.out.println("expected Exception, but there was a wrong one!"); 
        }
	}
	
	public static void test4(){
		v = new Vector(new float[]{4f, -1f}, false);
        System.out.println(v.toString());
	}

}
