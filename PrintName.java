import java.util.Scanner;

public class PrintName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Fname=sc.nextLine();
		String Lname=sc.next();
		System.out.println(Lname+". "+Fname);
	}

}
