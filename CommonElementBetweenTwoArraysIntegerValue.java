import java.util.HashSet;

/**
 * Java program to find the common elements between two arrays (integer values).
 * 
 * @author Mohammed
 *
 */
public class CommonElementBetweenTwoArraysIntegerValue {

	static void findCommonStringElement(int[] arrOne, int[] arrTwo) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arrOne.length; i++) {
			for (int j = 0; j < arrTwo.length; j++) {
				if (arrOne[i] == (arrTwo[j])) {
					set.add(arrOne[i]);
				}
			}
		}
		System.out.println("Common element in the both arrays are:" + set);
	}

	public static void main(String[] args) {

		int[] firstArr = { 1, 2, 3, 4, 5 };
		int[] secondArr = { 5, 9, 3, 7, 8 };
		findCommonStringElement(firstArr, secondArr);

	}

}
