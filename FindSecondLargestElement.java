import java.util.Arrays;

/**
 * Java program to find the second largest element in an array
 * 
 * @author Mohammed
 *
 */
public class FindSecondLargestElement {
	static void findSecondLargest(int[] arrNum) {
		Arrays.sort(arrNum);

		// with this line i can find exect index
		// int secondLargest = arrNum.length-1-1;
		
		// with this line i can find exect value
		System.out.println("Second Largest from the Integer array is :" + arrNum[arrNum.length - 1 - 1]);
	}

	public static void main(String[] args) {
		int myArr[] = { 12, 45, 67, 78, 45, 89, 90, 112, 234 };
		findSecondLargest(myArr);

	}

}
