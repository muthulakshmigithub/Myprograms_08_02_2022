import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;
public class Program35 {
	public static void main(String[] args) {
		 double secondRoot = 0, firstRoot = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		double a=sc.nextInt();
		System.out.println("Enter the value of b ::");
		double b=sc.nextInt();
		System.out.println("Enter the value of c ::");
		double c=sc.nextInt();
		
		
		double d= b*b-4*a*c;
		
		if(d>0.0) {
			double r1=(-b+Math.pow(d, 0.5))/(2*a);
			
			double r2=(-b-Math.pow(d, 0.5))/(2*a);
System.out.println("The Roots are "+r1+" and "+r2);

			
		}

		else if(d==0.0) {
			double r1=(-b/(2.0*a));
			
			System.out.println("The Roots is"+r1);
			
		}
		else {
			
			System.out.println("The Roots are not real");
		}
		/*
		 * double determinant = (b*b)-(4*a*c); double sqrt = Math.sqrt(determinant);
		 * 
		 * if(determinant>0){ firstRoot = (-b + sqrt)/(2*a); secondRoot = (-b -
		 * sqrt)/(2*a); System.out.println("Roots are :: "+ firstRoot
		 * +" and "+secondRoot); }else if(determinant == 0){
		 * System.out.println("Root is :: "+(-b + sqrt)/(2*a)); }
		 */

	}

}