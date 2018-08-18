import java.util.Arrays;

/**
 * Java program to sort a numeric array and a string array.
 * @author Mohammed
 *
 */
public class SortNumericAndStringArray {
	
	/**
	 * This method will sort numeric array 
	 * @param arrNum
	 */
	public static void sortNumericArray(int [] arrNum){
		System.out.println("Before Sorting :" +Arrays.toString(arrNum));
		Arrays.sort(arrNum);//sorting the array
		System.out.println("After Sorting the Array :"+Arrays.toString(arrNum));//after sorting the array
	}

	
	public static void sortStringArray(String [] arrStr){
		System.out.println("Before Sorting :" +Arrays.toString(arrStr));
		Arrays.sort(arrStr);//sorting the array
		System.out.println("After Sorting the Array :"+Arrays.toString(arrStr));//after sorting the array
	}
	public static void main(String[] args) {
		
		
		int myArray [] = {2,5,7,4,5,9,8};		 
		sortNumericArray(myArray);//calling Numeric sort array method
				
		String myStringArray[] = {"a","b","d","a"};
		sortStringArray(myStringArray);//calling String sort array method
	}

}
