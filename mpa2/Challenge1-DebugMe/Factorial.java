import java.util.Scanner;
/**
 * A program to calculate a factorial. The given code may contain errors. Fix the
 * given code and add additional code to calculate a factorial and pass the unit
 * tests. Hint sometimes an 'int' just 'aint big enough.
 * 
 * @see Factorial-ReadMe.txt for details on how to complete this program.
 * @author mpa2
 */
public class Factorial {
	public static void main(String[] args) {
		int max = 0;
		long factorial = 1;
		
		Scanner scan = new Scanner(System.in);
		
		
		while (max < 1 || max > 20) {
			System.out.println("Enter a number between 1 and 20 inclusive.");
			max = scan.nextInt();
		}
		scan.close();
		
		for(int x = max; x > 0; x--){
			factorial = factorial * x;
		}
		
		System.out.println(max + "! = " + factorial);
		
	}
}
