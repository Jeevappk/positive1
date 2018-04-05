package github;
import java.util.Scanner;

public class PositNeg {
	public static void main(String[] args) {
	 int  x;
		System.out.println("enter the numbers to be tested");
			Scanner a=new Scanner(System.in);
			x=a.nextInt();
	if(x>=1 && x<=1000)
			System.out.println("the number is positive");
		else if(x==0)
			System.out.println("the number is zero");
		else
			System.out.println("the number is negative");
		a.close();

	}

}
