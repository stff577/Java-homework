package homework4;

import java.util.Scanner;

public class hw7_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("Enter the number of students: ");
		n = in.nextInt();
		
		String[] name = new String [n + 7];
		int[] score = new int [n + 7];
		int intTmp;
		String strTmp;
		
		System.out.print("Enter the names of students: ");
		for (int i = 0; i < n; ++i) name[i] = in.next();
		
		System.out.print("Enter the scores of students: ");
		for (int i = 0; i < n; ++i) score[i] = in.nextInt();
		
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				if (score[i] < score[i + 1]) {
					intTmp = score[i];
					score[i] = score[i + 1];
					score[i + 1] = intTmp;
					strTmp = name[i];
					name[i] = name[i + 1];
					name[i + 1] = strTmp;
				}
			}
		}
		System.out.print("The rank of students is: ");
		for (int i = 0; i < n; ++i) {
			if (i > 0) System.out.print(" ");
			System.out.print(name[i]);
		}
	}

}
