package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 *Solution to PA2b. When the program runs, it asks for values a b and c and then evaluates the quadratic formula.
 * The program then prints the roots.
 * @author Ellie Starr
 */
public class PA2b {

	/**
	 * Starts program, outputs roots
	 * 
	 */
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		int a;
		int b; 
		int c;
		
		
		System.out.printf("Enter a b c: ");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		
		double discriminant = ((b*b)-(4*a*c));
		
		double root = ((-b)/(2*a));
		
		double d = 0;
		
		double root1 = 0;
		double root2 = 0;
		
		
		if(discriminant<0) {
			System.out.printf("Roots: imaginary%n");
		}
			else if(discriminant==0) {
				System.out.printf("Root: %.2f%n", root);
			}
				else {
					d = Math.sqrt(discriminant);
					 root1 = ((-b)+(d))/(2*a);
					 root2 = ((-b)-(d))/(2*a);
					
					if(root1<root2) {
						System.out.printf("Roots: %.2f, %.2%n", root1, root2);
					}
					else if(root1>root2) {
						System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
							
					}
				}
	}
}
				
				
			
		
	


