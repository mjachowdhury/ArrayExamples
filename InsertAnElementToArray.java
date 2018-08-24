import java.util.Arrays;

/**
 * Java program to insert an element (specific position) into an array.
 * 
 * @author Mohammed
 *
 */
public class InsertAnElementToArray {

	/**
	 * This method will put new value to the index position.
	 * 
	 * @param arrNum
	 */
	static void intertAnElementIntoArray(int[] arrNum) {
		System.out.println("Original Array :" + Arrays.toString(arrNum));
		int indexPosition = 2;// Declare the index position
		int newValue = 5;// Declare new value
		arrNum[indexPosition] = newValue;
		System.out.println("After putting new value to the index :" + Arrays.toString(arrNum));
	}

	// Main method
	public static void main(String[] args) {
		int myArr[] = { 1, 2, 3, 4, 5 };
		intertAnElementIntoArray(myArr);
	}

}
