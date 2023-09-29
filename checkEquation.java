package ass1_1212359_s4;
import java.util.Scanner;
public class checkEquation {
		public static void main(String[] args) {  
			/*
			 Student's full name : Noura Awni Jaber Manassra
			 Student's ID : 1212359
			 Lecture Section No: 7
			 Lab Section No:4 */			
		       int idNumb;
		       String name;

		     
		      while (true) {
		   System.out.println("Please enter the name and the ID || IF YOU WANT TO LOG OUT THE PROGRAM INSERT -1");
		      Scanner input = new Scanner(System.in);name = input.next();idNumb = input.nextInt();  	  
		      if (idNumb == -1)
		        break;
				boolean idNum=Equation.isBalanced(idNumb);
				while (idNum==false)
				{System.out.println("The number you enterd is invalid, please enter another ID");
				idNumb = input.nextInt();  
				 idNum=Equation.isBalanced(idNumb);}
				if (idNum==true)
					System.out.println("The number you entered is BALANCED,, you can go ahead!! ");
				while (idNum==true)
				{
					System.out.println("CHOOSE What you wanna do?  ");
				System.out.println("1.Solve equation  ");
				System.out.println("2.Find equation roots ");
				System.out.println("3.Compine equations ");
				System.out.println("4.Exit menu ");
				int z =input.nextInt();
				switch (z) {
				case 1 : {
					int a=input.nextInt();int b=input.nextInt();int c=input.nextInt();int x=input.nextInt();
					double res = Equation.solveEquation(a,b,c,x);
					System.out.println(res);
				} break;
				case 2: {
					int a=input.nextInt();int b=input.nextInt();int c=input.nextInt();
					Equation.findEquationRoots(a,b,c);
				}break;
				case 3:{
					double a=input.nextDouble();double b=input.nextDouble();double c=input.nextDouble();double a2=input.nextDouble();double b2=input.nextDouble();double c2=input.nextDouble();
					Equation.compineEquations(a,b,c,a2,b2,c2);
				}break;
				case 4: {idNum=false;}break;
				default :System.out.println("please enter valid option");
				}
				}
					}
		      
			                     }
			
	}