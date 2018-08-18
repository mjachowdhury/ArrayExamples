/**
 * Java program to sum values of an array and average
 * @author Mohammed
 *
 */
public class TotalSumOfAnArray {
/**
 * This method will return total sum from an integer array
 * @param arrNum
 * @return
 */
	public static int getTotalSumFromArray(int [] arrNum){
		int sum = 0;
		//traditional for loop
		/*for(int i = 0; i < arrNum.length; i++){
			sum +=arrNum[i];
		}*/
		//newer for loop
		for(int i : arrNum)
			sum += i;
		
		System.out.println("Average number is :"+sum/arrNum.length);
		return sum;
	}
	
	/*public static int getAverageSumFromArray(int [] arrNum){
		int sum = 0;
		for(int i = 0; i < arrNum.length; i++){
			sum +=arrNum[i];
		}
		int average = sum/arrNum.length;
		return average;
	}*/

	public static void main(String[] args) {
		 
		int myArr [] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Total Sum :" + getTotalSumFromArray(myArr));
		
		//System.out.println("Average number is :"+getAverageSumFromArray(myArr));
	}

}
