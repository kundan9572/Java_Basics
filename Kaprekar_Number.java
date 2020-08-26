import java.util.Scanner;

public class Kaprekar_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int res = num*num;
		while(res > 0) {
			int rem=res%10;
			 sum+=rem;
			 res=res/10;
		}
		if(sum == num) {
			System.out.println("Kaprekar number");
		}
		else
			System.out.println("Not a Kaprekar number");


	}

}
