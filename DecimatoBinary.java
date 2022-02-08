import java.util.Scanner;
public class DecimatoBinary {
	
		
		public static void binary2Decimal(int n){
	        int[] binaryNum =new int[100];
	        int i=0;
	        while(n>0){
	            binaryNum [i] = n % 2;
	            n = n / 2;
	            i++;
	        }
	        for(int j=i-1;j>=0;j--)
	        {
	            System.out.print(binaryNum[j]);
	            System.out.print(" ");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner in= new Scanner(System.in);
	        System.out.println("Enter your decimal number : ");
	        int n= in.nextInt();
	        System.out.println("Your binary value is : ");
	        binary2Decimal(n);
	}

}
