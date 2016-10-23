
/**
 * @author Marvin Piekarek
 * @matrikel 0556014
 * @module Programming 2
 * @date 16th October 2016
 */
public class Vector {

	// private instance variables
	private int dimension;
	private float[] components;
	private boolean isRowVector = true;

	/**
	 * custom constructor function for Vector Class
	 * @param components an array of floating numbers (Point)
	 * @param isRowVector a boolean
	 */
	public Vector(float[] components, boolean isRowVector){
		this.components = components;
		this.isRowVector = isRowVector;
		this.dimension = components.length;
	}
	
	/**
	 * Trasposing the actual vector
	 */
	public void transpose(){
		isRowVector = !isRowVector;
	}
	
	/**
	 * Calculates the scalar product of two vectors
	 * @param v the second vector
	 * @return a float value
	 */
	public float scalarProduct(Vector v){
		float skalar = 0;
		
		if(this.components.length == v.components.length){
			for(int i = 0; i < dimension; i++){
				skalar += this.components[i] * v.components[i];
			}
		}else{
			System.out.println("The scalarproduct is available for vectors with the same dimension only!");
			throw new IndexOutOfBoundsException();
		}
		
		return skalar;
	}

	/**
	 * Gets the actual isRowVector value
	 * @return a boolean value
	 */
	public boolean getIsRowVector(){
	    return isRowVector;
    }

	/**
	 * The vector to String
	 * @return String of a vector
	 */
	public String toString() {
		return "Vector (dimension=" + dimension + ", components=" + componentsToString() + ", isRowVector="
				+ isRowVector + ")";
	}

	/**
	 * custom Array to String Method
	 * @return String of an array
	 */
	private String componentsToString(){
		String end = "[ ";
		if(this.components.length == 1){
			end += this.components[0] + " ]";
		}else if(this.components.length == 0){
			end += "]";
		}else{
			for(float k : this.components){
				end += k + "; ";
			}
			end += "]";
		}
		return end;
	}
}
