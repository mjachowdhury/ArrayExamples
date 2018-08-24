import java.util.Arrays;

/**
 * Java program to reverse an array of integer values. To do reverse array start
 * condition from array length - 1 and
 * 
 * @author Mohammed
 *
 */
public class ReverseAnIntegerArray {
	static void reverseAnArray(int[] arrNum) {
		System.out.println("Original Array :" + Arrays.toString(arrNum));

		System.out.println("Reverse array:\n");
		for (int i = arrNum.length - 1; i >= 0; i--) {
			System.out.print(arrNum[i] + " ");
		}

	}

	public static void main(String[] args) {
		int myArr[] = { 1, 2, -3, 4, 5, -3, 34, 50 };

		reverseAnArray(myArr);
	}

}
