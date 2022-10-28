
public class FibonessisSeries {
	
	public static void main(String[] args) {
		int n=8;
		int j=1;
		int s=1;
		int t;
		System.out.println(j);
		System.out.println(s);
		for(int i=1;i<=n;i++) {
			t=j+s;
			System.out.println(t+" ");
			j=s;
			s=t;
		}
		
	}

}
