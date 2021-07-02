import java.util.*;

public class Pangram
 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a = s.nextLine();
		
		int f = 1;
		if(a.length() < 26)
			f = 0 ;
		else
		{
			for(char c = 'a'; c<='z'; c++)
			{
				if(a.indexOf(c) < 0)
				{
					f =0;
					break;
					
				}
				
			}
		}
		if(f== 1)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
	}

}