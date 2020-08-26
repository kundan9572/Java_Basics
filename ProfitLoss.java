import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int costP=sc.nextInt();
		int sellP=sc.nextInt();
		int profit= sellP-costP;
		if(sellP > costP) {
			int res=(100*profit)/costP;
			System.out.println("Profit - "+res+"%");
		}
		else if(profit ==0) {
			System.out.println("Invalid Data");
		}
		else {
			int res=-(100*profit)/costP;
			System.out.println("Loss -"+res+"%");

		}

	}

}
