
public class PracticeofPrime {
	public static void main(String[] args) {
		
		int num =100;
		int loop=0;
		for(int i=1;i<=num;i++) {
			if(num%i ==0) {
				loop++;
			}
		}
		
		if(loop==2) {
			System.out.println("prime");
		}else {
			System.out.println("non-prime");
		}
	}
	
}
