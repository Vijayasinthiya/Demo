package HomeTask;

import java.util.Arrays;
// String Sorting

public class StringSorting {
	public static void main(String[] args) {
		String a = "Prakash";
		String a1 = a.toLowerCase();
		char[] charArray = a1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		System.out.println("\n***********");

		// input integer and output string

		String[] units = { "", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN",
				"TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN" };
		String[] tens = { "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY" };

		int number = 100;
		if(number<0||number>99) {
			System.out.println("enter value within 99");
		}

		else if (number < 20) {
			System.out.println(units[number]);
		}

			else  {
				int tensValue = number / 10;
				int unitsValue = number % 10;
				System.out.println(tens[tensValue] + units[unitsValue]);
			}
	}
}
