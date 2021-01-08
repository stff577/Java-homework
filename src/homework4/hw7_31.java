package homework4;

import java.util.Scanner;

public class hw7_31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int n1 = in.nextInt();
		int[] list1 = new int [n1 + 1];
		for (int i = 1; i <= n1; ++i) list1[i] = in.nextInt();
		System.out.print("Enter list2: ");
		int n2 = in.nextInt();
		int[] list2 = new int [n2 + 1];
		for (int i = 1; i <= n2; ++i) list2[i] = in.nextInt();
		int[] list = merge(list1, list2);
		System.out.print("The merge list is");
		for (int i = 1; i <= n1 + n2; ++i) {
			System.out.print(" " + list[i]);
		}
	}
	
	public static int[] merge(int[] list1, int[] list2) {
		int[] list = new int [list1.length + list2.length + 1];
		int f1 = 1, f2 = 1, f = 1;
		while (f1 < list1.length || f2 < list2.length) {
			if (f2 >= list2.length || list1[f1] < list2[f2]) list[f++] = list1[f1++];
			else list[f++] = list2[f2++];
		}
		return list;
	}
}

