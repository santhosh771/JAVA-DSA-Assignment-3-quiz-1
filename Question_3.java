
import java.util.Scanner; // import the Scanner class 

public class Question_3 {
	
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			int k=i;
			for(;k>0;)
			{
				int lastDigit= k%10;
				sum=sum+(int)Math.pow(lastDigit, 3);  ;
				k=k/10;
			}
			if(i==sum)
			{
				System.out.println(i);
			}
			
		}
		
  }
}