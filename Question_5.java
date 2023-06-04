
import java.util.Scanner; // import the Scanner class 

public class Question_5 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long lcm=0;
		long temp;
		if(a>b)
		{
			
			a=a+b;
			b=a-b;
			a=a-b;			
		}
		for(int i=1;i<a*b;i++)
		{
			if(b*i%a==0)
			{
				lcm=b*i;
				break;
			}
		}
		System.out.println(lcm);
  }
}