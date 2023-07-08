package HomeTask;

//Factorial

public class FactPrime {
	public static void main(String[]args) {
		int fact=1;
			for(int i=1;i<=5;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
			
			// Prime Number
			
			int num=5;
			boolean a=true;
			for(int i=2;i<=num;i++) {
				if(num/i==0) {
					a=false;
				}
			}
			System.out.println("***********");
				System.out.println("prime");
				
			}
		}
	



