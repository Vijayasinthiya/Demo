package HomeTask;

import java.util.Arrays;

public class Operations {
	public static void main(String[] args) {

		// Swap

		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a= " + a + "," + "b= " + b);

		// sorting without comma

		String num = "1,2,4,6,8,3";
		String[] numbers = num.split(",");
		int[] arr = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			arr[i] = Integer.parseInt(numbers[i]);
		}

		Arrays.sort(arr);
		for(int nums:arr) {
        System.out.print(nums+" ");
		}
		
		//Iterate of a value
		
		int d= 10;
		
//		System.out.println("\n"+d++);
//		System.out.println("\n"+d);
        int result = d++ + ++d + d++ + ++d;
        System.out.println("\nResult: " + result);
   }
}

