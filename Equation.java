package interest;
import java.util.Scanner;
public class Equation {
	float interest;
	void Final(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount: ");
		int amount=sc.nextInt();
		System.out.println("enter the intrest rate: ");
		int rate=sc.nextInt();
		System.out.println("enter the time period(in years): ");
		float time=sc.nextFloat();
		interest=(amount*(1+(rate*time)));
		System.out.println("interested amount after " +time+ " years is=" +interest);
	}

}
