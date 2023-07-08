package HomeTask;

import java.util.Arrays;

//Pangram

public class AnagramPangram {
	public static void main(String[] args) {
//		String a = "The five boxing wizards jumps quickly";
		String a="sinthu";
		a = a.replaceAll("", "").toLowerCase();
		String b = "";
		for (char i = 'a'; i <= 'z'; i++) {
			if (a.indexOf(i) != -1) {
				b = b + i;
			}
		}
		if (b.length() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not Pangram");
		}
		System.out.println("\n************");

		// Anagram

		String str1 = "Race";
		String str2 = "care";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() == str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result) {
				System.out.println("\n"+str1 + " and " + str2 + " are Anagram");
			} else {
				System.out.println("\n"+str1 + " and " + str2 + " are not Anagram");
			}
		}

	}
}
