import java.util.Random;

public class AddingTwoMatrixElement {
	
	static void addTwoMatrix(int matrix1[][], int matrix2[][]){
		
		Random random = new Random();
		//matrix1 = new int[10][10];
		//matrix2 = new int[10][10];
		
		//entering to the first matrix
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matrix1[i][j] = random.nextInt(3);
			}
		}
		
		//entering the second matrix
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matrix2[i][j] = random.nextInt(3);
			}
		}
		
		//Adding two matrix
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.println("First Matrix: "+matrix1[i][j]+ " + " +"Second Matrix: "+ matrix2[i][j] + " = " 
											+ (matrix1[i][j]+matrix2[i][j]));
			}
		}
	}

	public static void main(String[] args) {
		
		int matrix1 [][] = new int[3][3];
		int matrix2 [][] = new int[3][3];
		addTwoMatrix(matrix1, matrix2);

	}

}




/*import java.util.Scanner;
public class Exercise19 {
 public static void main(String args[])
   {
      int m, n, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Input number of rows of matrix");
      m = in.nextInt();
      System.out.println("Input number of columns of matrix");
      n  = in.nextInt();
 
      int array1[][] = new int[m][n];
      int array2[][] = new int[m][n];
      int sum[][] = new int[m][n];
 
      System.out.println("Input elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array1[c][d] = in.nextInt();
 
      System.out.println("Input the elements of second matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array2[c][d] = in.nextInt();
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = array1[c][d] + array2[c][d]; 
 
      System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
}

*/