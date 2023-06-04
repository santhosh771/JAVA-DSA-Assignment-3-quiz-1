
import java.util.Scanner; // import the Scanner class 

public class Question_4 {
	
  public static void main(String[] args) 
  {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
			int sum=0;
			int k=n;
			for(;k>0;)
			{
				int lastDigit= k%10;
				sum=sum*10 + lastDigit;
				k=k/10;
			}
			if(n==sum)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
		
	}
}