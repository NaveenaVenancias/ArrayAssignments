package class_assignments;

import java.util.Scanner;

public class Array90DegreeRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter the no of column: ");
		int cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		rotatingArray(a,rows,cols);
	}
	public static void rotatingArray(int a[][],int rows,int cols) {
		int b[][]=new int[rows][cols];
		System.out.println("Rotated Array");
		for(int i=0;i<rows;i++) {
			int count=rows-1;
			for(int j=0;j<cols;j++) {
				b[i][j]=a[count][i];
				count--;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
