package homework4;

public class hw7_23 {

	public static void main(String[] args) {
		int [] L = new int [101];
		for (int i = 1; i <= 100; ++i) L[i] = 1;
		for (int i = 2; i <= 100; ++i) {
			for (int j = i; j <= 100; j += i) {
				L[j] ^= 1;
			}
		}
		System.out.print("The following cabinets are open:");
		for (int i = 1; i <= 100; ++i) {
			if (L[i] == 1) {
				System.out.print(" " + i);
			}
		}
	}
}