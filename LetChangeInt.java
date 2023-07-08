package HomeTask;

public class LetChangeInt {
	public static void main(String[] args) {
		String a = "aaabbcccc";
		StringBuilder sb = new StringBuilder();

		int runLen = 1;
		char runChar = a.charAt(0);

		for (int k = 1; k < a.length(); k++) {
			if (a.charAt(k) == runChar) {
				++runLen;
			} 
			else {
				sb.append(runChar).append(runLen);
				runLen = 1;
				runChar = a.charAt(k);
			}
		}

		sb.append(runChar).append(runLen);
		System.out.println(sb.toString());
	}
}
