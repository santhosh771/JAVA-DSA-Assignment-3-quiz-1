
import java.util.Scanner; // import the Scanner class 

public class Question_2 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long gcd=0;
		long temp;
		if(a>b)
		{
			
			a=a+b;
			b=a-b;
			a=a-b;			
		}
		for(;a>0;)
		{
			if(b%a==0)
			{
				gcd=a;
				break;
			}
			else
			{
				temp=a;
				a=b%a;
				b=temp;
				
				
			}
		}
		System.out.println(gcd);
  }
}