package homework4;

import java.util.Scanner;



public class hw7_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int [101];
		int t = 1;
		System.out.print("Enter the integers between 1 and 100: ");
		while (t != 0) {
			t = in.nextInt();
			num[t]++;
		}
		for (int i = 1; i <= 100; ++i) {
			if (num[i] > 0) {
				System.out.printf("%d occurs ", i);
				if (num[i] == 1) System.out.println("1 time");
				else System.out.printf("%d times\n", num[i]);
			}
		}
	}
	

}
