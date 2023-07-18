package rotatematrix;
import java.util.Scanner;

public class Rotate{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowsize = scanner.nextInt();
		System.out.println("Enter column size:");
		int columnsize = scanner.nextInt();
		System.out.println("Enter 2D array:");
		int arr[][] = new int[rowsize][columnsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
		int result[][]=new int[columnsize][rowsize];
		matrixtranspose(arr,rowsize,columnsize,result);
	}
		public static void matrixtranspose(int arr[][],int rowsize,int columnsize,int[][] result) {
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				result[j][i]=arr[i][j];
				
		}
		}
		for(int i=0;i<result.length;i++){
            for(int j=0;j< result.length/2;j++){

                   int temp=result[i][j];
                    result[i][j]=result[i][result.length-1-j];
                    result[i][result.length-1-j]=temp;

            }
        }
		for(int i=0;i<columnsize;i++) {
			for(int j=0;j<rowsize;j++) {
				System.out.print(result[i][j]+" ");
				
		}
			System.out.println();
		}
		
		
		
		}
}