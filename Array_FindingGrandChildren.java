package class_assignments;

import java.util.Scanner;

public class Array_FindingGrandChildren {

	public static void main(String[] args) {
		String names[][]= {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		String name="ronaldo";
		int grandchild=0;
		String childname=null;
		for(int i=0;i<4;i++) {
			if(names[i][1]==name) {
				childname=names[i][0];
			}
		}
		for(int i=0;i<4;i++) {
			if(names[i][1]==childname) {
				grandchild++;
			}
		}
		System.out.println("No of GrandChildren: "+grandchild);
	}

}
