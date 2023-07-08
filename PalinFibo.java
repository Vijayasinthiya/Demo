package HomeTask;
// Palindrome

public class PalinFibo {
	public static void main(String[]args) {
		String word="amma";
		String reverse="";
		for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}
		if(word.equals(reverse)){
			System.out.println("YES");
//			System.out.println(reverse);
		}
		else {
			System.out.println("Not Palindrome");
			
		}
		System.out.println("\n*****");
		
		// fibonacciSeries
		
		int num=5;
		int a=0;
		int b=0;
		int c=1;
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println("\n" +a);
			}
		}

}
