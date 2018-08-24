import java.util.Arrays;

public class FindMaxAndMinFromArray {

	// Both method will find out max and min value from array

	/*
	 * static void findMaxAndMin(int[] arrNum) { Arrays.sort(arrNum);//will sort
	 * original array System.out.println("Min number is : " + arrNum[0]);//After
	 * sorting 0 index will be min value System.out.println("Max Number is : " +
	 * arrNum[arrNum.length - 1]); //last index will be max value }
	 */

	static void findMaxAndMin(int[] arrNum) {

		int max = Integer.MIN_VALUE;// min number will be store at first to max
									// variable
		int min = Integer.MAX_VALUE;// max number will be store at first to min
									// variable

		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] > max) {
				max = arrNum[i];
			}
			if (arrNum[i] < min) {
				min = arrNum[i];
			}
		}
		System.out.println("Max number is :" + max + "\nMin number is :" + min);
	}

	public static void main(String[] args) {
		int myArr[] = { 75, 10, 20, 80, 65, 30, 40, 50 };
		findMaxAndMin(myArr);
	}
}
