package class_assignments;

import java.util.Scanner;

public class PrintingString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		int n=s.length();
		if(n%2==0) {
			System.out.print(false);
		}
		else {
		numberPattern(s);
		}
	}
	public static void numberPattern(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i==j) {
					System.out.print(s.charAt(i)+" ");
				}
				else if((i+j)==s.length()-1) {
					System.out.print(s.charAt(i)+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
