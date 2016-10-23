import java.util.Arrays;

public class TestArrayElement {

	public static void main(String[] args) {
		
		//single max output
        byte[] a = {4,4,4,4,1,2,3,32,21,21,1,1,1,1};
        byte[] aTest = ArrayElement.mostCommonElement(a);
        Arrays.sort(aTest);
        System.out.printf("Expected %s: %n", Arrays.toString(new byte[]{1}));
        System.out.printf("Actual %s: %n",Arrays.toString(aTest));

        //multiple Output
        byte[] b = {4,4,1,1};
        byte[] bTest = ArrayElement.mostCommonElement(b);
        Arrays.sort(bTest);
        System.out.printf("Expected %s: %n", Arrays.toString(new byte[]{1,4}));
        System.out.printf("Actual %s: %n", Arrays.toString(bTest));

        //null input = null output
        byte[] c = {};
        System.out.printf("Expected %s: %n", Arrays.toString(new byte[]{}));
        System.out.printf("Actual %s: %n", Arrays.toString(ArrayElement.mostCommonElement(c)));

	}

}
