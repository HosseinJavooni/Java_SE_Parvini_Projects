import java.util.Scanner;
public class CalculateAverageOfTowWholeNumber{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Integer: ");
		int a = s.nextInt();
		System.out.println("Enter the first Integer: ");
		int b = s.nextInt();
		double c = (a + b)/2.0;
		System.out.println("average is: " + c);
	}
}
