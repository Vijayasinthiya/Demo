package HomeTask;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 7, 8, 10, 5, 2 };
		
		// sorting
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Bubblesorting
		
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));

		// secondHighestValue
		
		int secondHighest = arr[arr.length - 2];
		System.out.println("Second Highest Value: " + secondHighest);

		// Duplicatevalues
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Map<Integer, Long> duplicates = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		duplicates.forEach((value, count) -> System.out.println("Duplicate: " + value + "\nDuplicate Count: " + count));

	}
}
