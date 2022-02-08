import java.util.Scanner;
public class OctaltoBinary {
	  public static void main(String[] args) {

		  System.out.println("Octal to Binary");
			Scanner sc= new Scanner(System.in);
			long n = sc.nextLong();
		
			int decimal = (int) convertOctalToBinary(n);
			System.out.println(n + " = "+ decimal);
		
  }

  public static long convertOctalToBinary(long n) {
    int decimalNumber = 0, i = 0;
    long binaryNumber = 0;

    while (n != 0) {
      decimalNumber += (n % 10) * Math.pow(8, i);
      ++i;
      n /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      binaryNumber += (decimalNumber % 2) * i;
      decimalNumber /= 2;
      i *= 10;
    }

    return binaryNumber;
  }
}