import java.util.Arrays;

/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 23. Dec 2016
 */
public class StackArray {

    private int[] stacky;

    public StackArray(){

    }

    public StackArray(int a){

    }

    public StackArray(int[] a){

    }

    public void push(int a){

    }

    public int pop(int a){

    }

    public int top(int a){

    }

    public void content(){

    }

    private void AddElement(int a){
        stacky = Arrays.copyOf(stacky, stacky.length+1);
        stacky[stacky.length - 1] = a;
    }

    private int removeElement(){
        int rem = stacky[stacky.length - 1];
        stacky = Arrays.copyOf(stacky, stacky.length-1);
        return rem;
    }
}
