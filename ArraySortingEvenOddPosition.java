package class_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingEvenOddPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int output[]=new int[a.length];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int position=0;
		int midelement=0;
		
		if(n%2!=0) {
			midelement = (n/2)+1;
		
		}
		else if(n%2==0) {
			midelement = n/2;
			
		}
		output[position]=a[midelement];
		for(int i=1;i<=(midelement+1);i++) {
			if((midelement+i)<n) {
				output[++position]=a[midelement+i];
			}
			if((midelement-i)>=0) {
				output[++position]=a[midelement-i];
			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++) {
			System.out.print(output[i]);
		}
		
	}

}
