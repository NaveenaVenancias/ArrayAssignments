package class_assignments;

import java.util.Scanner;

public class ArraySubtraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row1=sc.nextInt();
		System.out.println("Enter the no of cols: ");
		int col1=sc.nextInt();
		int a[][]=new int[row1][col1];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the no of rows: ");
		int row2=sc.nextInt();
		System.out.println("Enter the no of col: ");
		int col2=sc.nextInt();
		int b[][]=new int[row2][col2];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int output[][]=new int[row1][col2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				output[i][j]=a[i][j]-b[i][j];
				System.out.print(output[i][j]+" ");
			}
		}
		System.out.println();
	}
}
