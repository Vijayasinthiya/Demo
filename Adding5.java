package HomeTask;

import java.util.ArrayList;
import java.util.List;

public class Adding5 {
	public static void main(String[] args) {
		List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<String> pairs = findPairs(num, 5);

		for (String pair : pairs) {
			System.out.println(pair);
		}
	}

	public static List<String> findPairs(List<Integer> numbers, int target) {
		List<String> pairs = new ArrayList<>();

		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				if (numbers.get(i) + numbers.get(j) == target) {
					pairs.add(numbers.get(i) + "  " + numbers.get(j));
				}
			}
		}

		return pairs;
	}
}
