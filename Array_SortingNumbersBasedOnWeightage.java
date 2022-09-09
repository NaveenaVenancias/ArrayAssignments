package class_assignments;

import java.util.Scanner;

public class Array_SortingNumbersBasedOnWeightage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		findWeightage(a,n);
	}
	public static void findWeightage(int a[],int n) {
		int weightage[]=new int[n];
		int result[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			if((a[i]%2)==0) {
				weightage[i]+=3;
			}
			if((a[i]%4==0)&&(a[i]%6==0)) {
				weightage[i]+=4;
			}
			int squarerootValue=(int)(Math.sqrt(i));
			if(squarerootValue*squarerootValue==i) {
				weightage[i]+=5;
			}
				result[i][0]=a[i];
				result[i][1]=weightage[i];
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				
			}
		}
	}
}
