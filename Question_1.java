
import java.util.Scanner; // import the Scanner class 

public class Question_1 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				counter++;
				break;
			}
		
		}
		if(counter==0 && n!=1 )
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
  }
}