package class_assignments;

import java.util.Scanner;

public class ArrayLeftRightRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the no of times wants to rotate in left side:");
		int leftRotate=sc.nextInt();
		
		for(int i=0;i<leftRotate;i++) {
			int first=a[0];
			int j;
			for(j=0;j<n-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		System.out.println("Array after "+leftRotate+"th roatation:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the no of times wants to rotate in right side:");
		int rightRotate=sc.nextInt();
		for(int i=0;i<rightRotate;i++) {
			int last=a[n-1];
			int j;
			for(j=n-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println("Array after "+rightRotate+"th roatation:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
