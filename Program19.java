import java.util.*;
import java.util.Scanner;
public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitwise Opertors");
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1.Bitwise AND \n 2.Bitwise XOR \n 3.Bitwise OR\n 4.Bitwise Complement \n 5.Bitwise Shift operators");
		int n =sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Bitwise AND");
			System.out.println("a&b = "+(a&b));
			break;
		case 2:
			System.out.println("Bitwise XOR");
			System.out.println("a^b = "+(a^b));
			break;
		case 3:
			System.out.println("Bitwise OR");
			System.out.println("a|b = "+(a|b));
			break;
		case 4:
			System.out.println("Bitwise Complement");
			System.out.println("~a = "+(-(~a)));
			break;
		case 5:
			System.out.println("Bitwise Shift operator");
			System.out.println("Bitwise Left Shift");
			System.out.println("a<<b"+(a<<b));
			System.out.println("Bitwise Right Shift");
			System.out.println("a>>b"+(a>>b));
			System.out.println("Bitwise Unsigned Right Shift");
			System.out.println("a>>>b"+(a>>>b));
			break;
			default:
				System.out.println("Enter from 1 to 5");
		}
		
	}

}
