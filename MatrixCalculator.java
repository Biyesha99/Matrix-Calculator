import java.util.*;

public class MatrixCalculator{
	public static void main(String args[]){
		
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the matrix..\n1 for 2x2 and 2 for 3x3:   ");
		int n = sc.nextInt();
		
		if(n == 1){
			size = 2;
		}else{
			size = 3;
		}
		
		int[][] matrix1 = new int[size][size];
		int[][] matrix2 = new int[size][size];
		int[][] matrix3 = new int[size][size];
		
		System.out.print("Enter the first Matrix...");
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter the second Matrix...");
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		// Summation
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("\n Summation: ");
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print("\t" + matrix3[i][j]);
			}
			System.out.println();
		}
		
		// Subtraction
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		
		System.out.println("\n Subtraction: ");
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print("\t" + matrix3[i][j]);
			}
			System.out.println();
		}
		
		// Multiplication
		
		int answer[][] = new int[matrix1.length][matrix2[0].length];
		
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix2[0].length; j++)
				for(int z=0; z<matrix1[0].length; z++){
					answer[i][j] += matrix1[i][z] * matrix2[z][j];
				}
				//matrix3[i][j] =  ( (matrix1[i][j] * matrix2[i][j]) + (matrix1[i][j+1] * matrix2[i+1][j]) );
		}
		
		System.out.println("\n Multiplication: ");
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print("\t" + answer[i][j]);
			}
			System.out.println();
		}
	}
}