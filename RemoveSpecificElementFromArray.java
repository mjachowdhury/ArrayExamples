import java.util.Arrays;
/**
 * Java program to remove a specific element from an array.
 * @author Mohammed
 *
 */
public class RemoveSpecificElementFromArray {
	
	/**
	 * This method will remove specific element from the array
	 * @param arrNum
	 */
	static void removeFromArray(int [] arrNum){
		
		int removeIndex = 0;//whatever number will pass that index number will be removed
		for(int i = removeIndex; i< arrNum.length-1; i++){
			arrNum[i] = arrNum[i+1];
		}
	}

	public static void main(String[] args) {
		 int myArr [] = {1,3,5,6,7,34,56,78};
		 System.out.println("Origianl Array :" + Arrays.toString(myArr));
		 
		 // We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
		 
		 removeFromArray(myArr);
		 System.out.println("After Removing :" +Arrays.toString(myArr));

	}

}
