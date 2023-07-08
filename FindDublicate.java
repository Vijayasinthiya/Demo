package HomeTask;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDublicate {
	public static void main(String[] args) {
		String a = "Onesoft Technologies";
		String string1 = a.toLowerCase();
		int count = 1;
		char string[] = string1.toCharArray();
		System.out.println("The Duplicates are:");
		for (int i = 0; i < string.length; i++) {
			count = 1;
			
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j]) {
					count++;
					string[j]=' ';
					
					}
				}
			if (count > 1 && string[i] != ' ') {
				System.out.println(string[i]);
			}
		}
		Map<Character, Long> result =string1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		result.forEach((k, v) -> {
			if (v > 1) {
				System.out.println("The count of Dublicate  "+k + " -> " + v);
			}
		});
	}
}
