import java.util.HashSet;

/**
 * Java program to find the common elements between two arrays (string values).
 * 
 * @author Mohammed
 *
 */
public class CommonElementBetweenTwoArrays {

	static void findCommonStringElement(String[] arrOne, String[] arrTwo) {

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < arrOne.length; i++) {
			for (int j = 0; j < arrTwo.length; j++) {
				if (arrOne[i].equals(arrTwo[j])) {
					set.add(arrOne[i]);
				}
			}
		}
		System.out.println("Common element in the both arrays are:" + set);
	}

	public static void main(String[] args) {

		String[] firstArr = { "Java", "C++", "Python" };
		String[] secondArr = { "Python", "C#", "CSS" };
		findCommonStringElement(firstArr, secondArr);

	}

}
