package phaseoneproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class performingOperations {
	
	public static void addFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your file name");
		String str = sc.nextLine();
		str="D:\\"+str;
		
		try {
			File file = new File(str);
			if(file.createNewFile())
				System.out.println("File added Successfully");
			else
				System.out.println("Error while creating File, file already exists in specified path.");
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	
	}
	
	public static void deleteFile() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your file :");
		String directory= sc.nextLine();
		directory="D:\\" +directory;
		
		try {
			File f= new File(directory);
			if(f.delete())
			{
				System.out.println("File is deleted Successfully");
			}
			else
			{
				System.out.println("File not found");
			}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void searchFile() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the correct path to read the file");
		String str1= sc.nextLine();
		str1="D:\\"+str1;
		
		try
		{
			File read = new File(str1);
			Scanner sc1 = new Scanner(read);
			while(sc1.hasNextLine())
			{
				String data = sc1.nextLine();
				System.out.println(data);
			}
			sc1.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot read the file");
		}
	}
	
	public static void businessLevelOperation() {
		boolean bool =true;
		Scanner sc = new Scanner(System.in);
		while(bool)
		{
			System.out.println("1. Add a file.");
			System.out.println("2. Search a file.");
			System.out.println("3. Delete a file.");
			System.out.println("4. Return to main-menu.");
			
			System.out.println("Choose anyone from the above options");
			
			int option =sc.nextInt();
			
			sc.nextLine();
			
			try {
				switch(option)
				{
				case 1:
					addFile();
					break;
				case 2:
					searchFile();
					break;
				case 3:
					deleteFile();
					break;
				case 4:
					bool =false;
					break;
				default:
					System.out.println("You have entered wrong Input!");
					System.out.println(" ");
					businessLevelOperation();
				}
			}
			catch(InputMismatchException im){
				System.out.println("Entered Input is not Correct. Input should be in Integer!!!");
			}
		}
		
	}

}
