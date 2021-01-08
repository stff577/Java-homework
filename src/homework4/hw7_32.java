package homework4;

import java.util.Scanner;

public class hw7_32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter list: ");
		int n = in.nextInt();
		int[] list = new int [n];
		for (int i = 0; i < n; ++i) list[i] = in.nextInt();
		partition(list);
		System.out.print("After the partition, the list is");
		for (int i = 0; i < n; ++i) {
			System.out.print(" " + list[i]);
		}
	}
	
	public static int partition(int[] list) {
		int pos = 0, tmp = 0;
		for (int i = 1; i < list.length; ++i) {
			if (list[i] <= list[pos]) {
				tmp = list[i];
				for (int j = i - 1; j >= pos; --j) {
					list[j + 1] = list[j];
				}
				list[pos] = tmp;
				pos++;
			}
		}
		return pos;
	}

}