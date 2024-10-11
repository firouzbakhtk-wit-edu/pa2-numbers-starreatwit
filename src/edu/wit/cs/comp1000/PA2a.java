
package edu.wit.cs.comp1000;



import java.util.Scanner;
/**
 * Solution to PA2a. When the program runs, it prompts the user to enter five whole numbers.
 * The program then outputs the sum of the positive numbers, sum of the negative numbers, sum of all five numbers, average of positive numbers, average of negative numbers, and the average of all five numbers.
 * @author Ellie Starr
 */
public class PA2a {

	/**
	 * Starts program, outputs prompted entry
	 * 
	 */
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		int a;
		int b; 
		int c;
		int d;
		int e;
		
		int negSum=0;
		int posSum=0;
		
		int count = 0;
		

		
	
		
		System.out.printf("Enter five whole numbers: ");
		a=input.nextInt();
		if (a<0) {
			negSum = negSum+a;
			count = count+1;}
			else {
				posSum = posSum+a;}
		b=input.nextInt();
		if (b<0) {
			negSum = negSum+b;
			count = count+1;}
			else {
				posSum = posSum+b;
		}
		c=input.nextInt();
		if (c<0) {
			negSum = negSum+c;
			count = count+1;}
			else {
				posSum = posSum+c;
		}
		d=input.nextInt();
		if (d<0) {
			negSum = negSum+d;
			count = count+1;}
			else {
				posSum = posSum+d;
		}
		e=input.nextInt();
		if (e<0) {
			negSum = negSum+e;
			count = count+1;}
			else {
				posSum = posSum+e;
		}
		
		double avePos = 0;
		if(((5.0)-count) == 0) {
			avePos=0;
		}
			else {
				 avePos = posSum/((5.0)-count);
			}
		
		
		
		double aveNeg = 0;
		if (count==0) {
			aveNeg = 0;
		}
		else {
				aveNeg = negSum/count;
				
		}
		
		
		int sumSum = negSum+posSum;
		
		
		double aveSum = sumSum/(5.0);
		
		
		
		
		
		
		
		
		
		
	 if ((5.0-count)>1) {
		System.out.printf("The sum of the %d positive numbers: %d%n", Math.round(5.0-count), posSum);
	 }
	 else if((5.0-count)==1) {
		 System.out.printf("The sum of the %d positive number: %d%n", Math.round(5.0-count), posSum);
	 }
	 else {
		 System.out.printf("There are no positive numbers%n");
	 }
	 
	 if(count>1) {
		 System.out.printf("The sum of the %d non-positive numbers: %d%n", Math.round(count), negSum);
	 }
	 else if(count==1) {
		 System.out.printf("The sum of the %d non-positive number: %d%n", Math.round(count), negSum);
	 }
	 else {
		 System.out.printf("There are no negative numbers%n");
	 }
		
	 
		System.out.printf("The sum of the 5 numbers: %d%n", sumSum);
		
		if((5.0-count)>1) {
			System.out.printf("The average of the %d positive numbers: %.2f%n", Math.round(5.0-count), avePos);
		}
		else if((5.0-count)==0){
			System.out.printf("There are no positive numbers%n");
		}
			else {
			System.out.printf("The average of the %d positive number: %.2f%n", Math.round(5.0-count), avePos);
			
		}
	
		if(count>1) {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", Math.round(count), aveNeg);
		}
		else if(count==0) {
			System.out.printf("There are no negative numbers%n");
		}
		else {
			System.out.printf("The average of the %d non-positive number: %.2f%n", Math.round(count), aveNeg);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", aveSum);
		
		
	}

}
