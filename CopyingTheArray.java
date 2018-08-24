import java.util.Arrays;

/**
 * Java program to copy an array by iterating the array
 * 
 * @author Mohammed
 *
 */
public class CopyingTheArray {
	/**
	 * This method will copy original array to new array
	 * 
	 * @param arrNum
	 */

	/*
	 * static void copyArray(int [] arrNum){
	 * System.out.println("Original Array : "+ Arrays.toString(arrNum)); int
	 * newArray[] = arrNum.clone();
	 * System.out.println("After copying New Array:"+Arrays.toString(newArray));
	 * }
	 */

	/**
	 * This method will copy original array t onew array
	 * 
	 * @param arrNum
	 */

	static void copyArray(int[] arrNum) {
		System.out.println("Original Array : " + Arrays.toString(arrNum));
		int newArray[] = new int[7];

		for (int i = 0; i < arrNum.length; i++) {
			newArray[i] = arrNum[i];
		}
		System.out.println("After copying New Array:" + Arrays.toString(newArray));
	}

	// Main function
	public static void main(String[] args) {
		int myArray[] = { 1, 2, 4, 5, 7, 2, 78 };
		copyArray(myArray);
	}

}
