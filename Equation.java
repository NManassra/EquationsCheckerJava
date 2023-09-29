
package ass1_1212359_s4;
import java.util.Scanner;



public class Equation {
	/*
		 Student's full name : Noura Awni Jaber Manassra
		 Student's ID : 1212359
		 Lecture Section No: 7
		 Lab Section No:4 */
	
	public static boolean isBalanced(int idNumb) {
		
		int evenSum=0,oddSum=0,divide=1,next=1,flag=0,nextt=1,test=idNumb;
		while (test>0) {
			next=test%10;
			if(next%2==0)
				evenSum=evenSum+next;
			else
				oddSum = oddSum+next;
			test=test/10;
		}
		test=idNumb;divide=1;next=1; 
		while (test>0) {
			next = test%10;
			test=test/10;
			nextt= test%10;
			if(next==nextt)
			{flag=1;break;}
		}
		if(evenSum==oddSum && flag==0)
			return true;
		else
			return false;
	}
	
	
	
	public static double solveEquation (int a, int b ,int c , int x) {
		return ((a*x*x)+(b*x)+(c));
	}
	
	
	
	public static void findEquationRoots (int a, int b, int c){
	      double s = ((b*b)-(4.0*a*c));	
	        if(s>=0)
	        {
	        	double nm=Math.sqrt(s);
	        	double firstAns = (((-1*b)+s)/(2*a));
	        	double secondAns = (((-1*b)-s)/(2*a));
            System.out.println(firstAns);
            System.out.println(secondAns);
	        }
	        else
	        { System.out.println("BE CAREFUL!! THERE IS IMAGINARY ROOTS!!!!!!!!!");}
	}
	
	
	public static void compineEquations(double a,double b,double c,double a2,double b2,double c2) {
	
		double A =a+a2;
		double B =b+b2;
		double C =c+c2;
		if(B>=0 && C>=0)
		System.out.println(A + "X2" + " + " + B + "X" + " + "+ C );
		else if(B>0 && C<0)
			System.out.println(A + "X2" + " + " + B + "X " + C );
		else if(B<0 && C>0)
			System.out.println(A + "X2 "  + B + "X" + " + "  + C );
		else if(B<0 && C<0)
			System.out.println(A + "X2 "  + B + "X "  + C );
	}

	
}