import java.util.Arrays;

/**
 * @author Marvin Piekarek
 * @matrikel 0556014
 * @module Programming 2
 * @date 16th October 2016
 */
public class ArrayElement {
	
	/**
	 * Method to seek for the most common elements inside an array
	 * @param arr a byte array
	 * @return most common elements byte array
	 */
	public static byte[] mostCommonElement(byte[] arr){

		//check if empty array
		if(arr.length == 0){
			return new byte[]{};
		}


		byte[] earr = new byte[1];
		int[] counts = new int[arr.length];
		boolean first = true;

		// creating the count array for all values
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				if(arr[i] == arr[j]){
					counts[i]++;
				}
			}
		}

		// get the highest value of the count array
		int highest = highestValue(counts);
		/*
		* loop through the count array and add all highest values indices
		* from the original array which holds the values.
		*/
		for(int i = 0; i < counts.length; i++){
			if(counts[i] == highest && first){
				earr[0] = arr[i];
				first = !first;
			}else if(counts[i] == highest && !first){
				earr = addToArray(earr, arr[i]);
			}
		}

		// return the array of the most often values
		return earr;
	}
	
	/**
	 * Get the highest value out of a int array
	 * @param arr array of integer values
	 * @return the highest integer
	 */
	private static int highestValue(int[] arr){
		int a = arr[0];

		//loop trough array and find the highest element
		for (int ar: arr){
			if(ar > a){
				a = ar;
			}
		}
		return a;
	}
	
	/**
	 * method to add a value to an existing array
	 * with a existing value check
	 * @param arr existing array
	 * @param value value to be added
	 * @return new byte array
	 */
	private static byte[] addToArray(byte[] arr, byte value){
		byte[] earr = new byte[arr.length+1];
		
		Arrays.sort(arr);
		int a = Arrays.binarySearch(arr, value);

		//check with binarySearch if element is already in
		if(a >= 0){
			return arr;
		}

		//otherwise add it
		for(int i = 0; i < earr.length; i++){
			if(i < earr.length-1){
				earr[i] = arr[i];
			}else{
				earr[i] = value;
			}
		}
		
		return earr;
		
	}

}
