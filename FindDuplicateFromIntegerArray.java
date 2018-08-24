/**
 * Java program to find the duplicate values of an array of integer values
 * 
 * @author Mohammed
 *
 */
public class FindDuplicateFromIntegerArray {
	static void findDuplicate(int[] arrNum) {
		for (int i = 0; i < arrNum.length - 1; i++) {
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] == arrNum[j] && (i != j)) {
					System.out.println("Duplicate element :" + arrNum[j]);
				}
			}

		}
	}

	public static void main(String[] args) {

		int myArr[] = { 1, 1, 3, 4, 4, 5, 6, 7 };
		findDuplicate(myArr);

	}

}

/*
 * public static Set<Integer> findDuplicateInArray(int... arr) { Set<Integer>
 * unique = new HashSet<>(); Set<Integer> duplicate = new HashSet<>();
 * 
 * for (int val : arr) (unique.contains(val) ? duplicate : unique).add(val);
 * 
 * return duplicate; }
 */