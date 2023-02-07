//	Switch Case

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char grade = sc.next().charAt(0);
		sc.close();
		
		SwitchCase s = new SwitchCase();
		s.switchCase(grade);
	}
	
	public void switchCase(char grade)
	{
		switch(grade)
		{
		case 'A':
			System.out.println("Grade A student");
			break;
		case 'B':
			System.out.println("Grade B student");
			break;
		case 'C':
			System.out.println("Grade C student");
		default :
			System.out.println("Grade not valid");
		}
	}
}