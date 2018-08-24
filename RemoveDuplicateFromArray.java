import java.util.Arrays;

/**
 * Java program to remove duplicate elements from an array.
 * 
 * @author Mohammed
 *
 */
public class RemoveDuplicateFromArray {

	static void removeDuplicate(int[] arrNum) {
		System.out.println("Original Array :" + Arrays.toString(arrNum));

		int no_of_duplicate = arrNum.length;

		// comparing each element with all other elements wit htwo loops

		for (int i = 0; i < no_of_duplicate; i++) {
			for (int j = i + 1; j < no_of_duplicate; j++) {

				// if any two elements are found equal
				if (arrNum[i] == arrNum[j]) {

					// then it will replace duplicate element with last unique
					// elemetn
					arrNum[j] = arrNum[no_of_duplicate - 1];
					no_of_duplicate--;
					j--;
				}

			}
		}

		extracted(arrNum, no_of_duplicate);

		// below those line i made a method for them and call later
		/*
		 * int newArray [] = Arrays.copyOf(arrNum, no_of_duplicate);
		 * System.out.println("After removing : "+Arrays.toString(newArray));
		 */
	}

	private static void extracted(int[] arrNum, int no_of_duplicate) {
		// copying only unique elements from the original array to the new array
		int newArray[] = Arrays.copyOf(arrNum, no_of_duplicate);
		System.out.println("After removing : " + Arrays.toString(newArray));
	}

	public static void main(String[] args) {
		int myArr[] = { 3, 2, 4, 5, 6, 7, 3, 2 };
		removeDuplicate(myArr);

	}

}

//removing dup using arraylist

/*public static void removeDuplicates() {
	String[] array = { "Hello", "Hi", "Bye", "See you", "Hello", "Hey", "Bye" };
	ArrayList<string> list = new ArrayList();
	for (int i = 0; i < array.length; i++) {
		list.add(array[i]);
	}
	for (int i = 0; i < array.length; i++) {
		for (int j = i + 1; j < array.length; j++) {
			if ((array[i] == array[j]) && (i != j)) {
				list.remove(array[j]);
			}
		}
	}
	System.out.println("Original array" + Arrays.toString(array));
	System.out.println("Array with unique value: " + Arrays.toString(list.toArray()));
}*/
