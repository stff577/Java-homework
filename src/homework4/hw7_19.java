package homework4;

import java.util.Scanner;

public class hw7_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter list: ");
		int n = in.nextInt();
		int []list = new int [n];
		for (int i = 0; i < n; ++i) list[i] = in.nextInt();
		if (isSorted(list)) System.out.println("The list is already sorted");
		else System.out.println("The list is not sorted");
	}
	public static boolean isSorted(int[] list) {
//		System.out.println(list.length);
		for (int i = 0; i < list.length - 1; ++i) {
//			System.out.printf("%d %d\n", list[i], list[i + 1]);
			if (list[i] > list[i + 1]) return false;
		}
		return true;
	}

}
