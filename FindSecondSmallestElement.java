import java.util.Arrays;

/**
 * Java program to find the second smallest element in an array
 * 
 * @author Mohammed
 *
 */
public class FindSecondSmallestElement {
	static void findSecondSmallest(int[] arrNum) {
		Arrays.sort(arrNum);

		// with this line i can find exect value
		System.out.println("Second Largest from the Integer array is :" + arrNum[1]);
	}

	//output will be 45 as it is the second smallest element
	public static void main(String[] args) {
		int myArr[] = { 12, 45, 235, 345, 456, 67, 78, 45, 89, 90, 112, 234 };
		findSecondSmallest(myArr);

	}

}
