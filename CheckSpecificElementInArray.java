/**
 * Java program to test if an array contains a specific value
 * @author Mohammed
 *
 */
public class CheckSpecificElementInArray {

	static boolean findSpecificElement(int[] arrNum, int item) {
/*first way*/		
		/*for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == item)
				return true;
		}
		return false;*/
		
/* second way */
		
		for(int i : arrNum){
			if (item == i) {
				return true;
			}			
		}
		return false;
	}

	public static void main(String[] args) {

		int myArray[] = { 345, 45, 35, 2456, 34 };
		System.out.println("Item Found : " + findSpecificElement(myArray, 45));

	}

}
