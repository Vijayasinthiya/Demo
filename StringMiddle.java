package HomeTask;

public class StringMiddle {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "developer";
		int index = 2;
		StringBuffer newStr = new StringBuffer(str1);
		newStr.insert(index, str2);
		System.out.println("Result: " + newStr.toString());
	}
}
