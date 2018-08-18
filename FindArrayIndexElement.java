/**
 * Java program to find the index of an array element. when - 1 that means item
 * not found in the array index.
 * 
 * @author Mohammed
 *
 */
public class FindArrayIndexElement {

	static int findArrayIndexElement(int[] arrNum, int indexItem) {

		if (arrNum == null || arrNum.length == 0) {
			return -1;
		}
		int i = 0;
		while (i < arrNum.length) {
			if (arrNum[i] == indexItem) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int myArray[] = { 23, 34, 67, 4, 67, 89, 65, 2 };
		System.out.println("Index of number 230 is : " + findArrayIndexElement(myArray, 230));

		System.out.println("Index of number 23 is : " + findArrayIndexElement(myArray, 23));
	}

}
