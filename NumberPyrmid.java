package HomeTask;

public class NumberPyrmid {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		int number = 5;
		for (int i = number; i>= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
