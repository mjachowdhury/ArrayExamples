import java.util.Arrays;

/***
 * THis program will find duplicate string value
 * 
 * @author Mohammed
 *
 */
public class FindDuplicateStringValue {

	static void findStringDuplicate(String[] stringArray) {
		System.out.println("Originl String Array :" + Arrays.toString(stringArray));

		System.out.println("Duplicate value in the array: ");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[i].equals(stringArray[j]) && (i != j)) {
					System.out.println(stringArray[j] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {

		String myArray[] = { "abc", "bcd", "efg", "abc" };
		//Output will be abc
		findStringDuplicate(myArray);
	}

}
