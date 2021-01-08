package homework4;

import java.util.Scanner;

public class hw7_34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		s = in.next();
		String ans = sort(s);
		System.out.print("The sorted string is: " + ans);
		
	}
	
	public static String sort(String s) {
		int[] num = new int [27];
		String ans = "";
		for (int i = 0; i < 26; ++i) num[i] = 0;
		for (int i = 0; i < s.length(); ++i) {
			num[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; ++i) {
			char c = (char) ('a' + i);
			while (num[i] > 0) {
				ans += c;
				num[i]--;
			}
		}
		return ans;
	}
}
