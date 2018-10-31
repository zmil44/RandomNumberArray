/*
 * Zachary Miller
 * Assignment 7.2
 * The purpose of this program is to store random numbers into an int array. The quantity of numbers is determined by user input and then display the numbers  
 * 08 Oct 2017
 * Bellevue University
 * Arrays.java
 */
import java.util.*;

public class Arrays {

	public static void main(String[] args) 
	{
		int sizeOfArray = getSize();
		int num[]=new int [sizeOfArray];
		fillArray(num);
		display(num);
	}
	
	private static int getSize()
	{
		
		Scanner scan = new Scanner(System.in);
		int input=0;
		do
		{
			try
			{
				System.out.print("How many random numbers would you like: ");
				input = scan.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("\nYou did not enter a valid number please try again.");
			}
		}while(input<=0);
		scan.close();
		return input;
	}
	
	private static void fillArray(int[] num)
	{
		Random randomGenerator = new Random();
		for(int i=0;i<num.length;i++)
		{
			num[i]= randomGenerator.nextInt(100);
		}
	}
	
	private static void display(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Number "+(i+1)+" is "+num[i]);
			
		}
	}

}
