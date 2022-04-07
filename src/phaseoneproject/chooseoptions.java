package phaseoneproject;


import java.util.InputMismatchException;
import java.util.Scanner;

import phaseoneproject.performingOperations;

public class chooseoptions {
	//@SuppressWarnings("unused")
	public static void display() {
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Retrive files in ascending order.");
			System.out.println("2. Perform Business Level operations.");
			System.out.println("3. Exit.");
			System.out.println("Choose from the above options :");
			
			try {
				int optionSelection = sc.nextInt();
				
				switch(optionSelection) {
				
				case 1:
					showFinal.showFile();
					break;
				case 2:
					performingOperations.businessLevelOperation();
					break;
				case 3:
					System.out.println("THANK YOU!!!");
					System.exit(0);
					break;
				default :
					System.out.println("You Have Entered wrong Input !");
					System.out.println(" ");
					display();
					
					
					
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Entered Input is not correct. Input should be in integer !!!!");
			}
			sc.nextLine();
			
			
		}
	}

}
