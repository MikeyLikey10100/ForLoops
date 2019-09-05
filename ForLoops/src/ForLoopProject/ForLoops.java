package ForLoopProject;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) 
		// TODO Auto-generated method stub

		{ 
		//help me please
			//print5();
			//printDoughnuts();
			//print1To5();
			//printSum();
			//printLowerAndUpperBound();
			rectangle();
		}
	
	public static void print5()
	{
		for( int i = 5; i <= 100; i = i+5)
			{
				System.out.println(i);
			}
	}
		public static void printDoughnuts()
			{
				for( int i =1; i <=5; i++ )
					{
						System.out.println("I love Doughnuts");
					}	
	}
		public static void print1To5()
			{
				for( int i =1; i <=5; i++ )
					{
						System.out.println(i);
					}
				for( int i =5; i >=1; i-- )
					{
						System.out.println(i);
					}
			}
		public static void printSum()
			{
				int sum = 0;
				
				
				for( int i = 5; i <= 100; i += 5)
					{	
					sum += i;
					}
				System.out.println("The total is: " + sum);
			}
				public static void printLowerAndUpperBound()
					{
					
					int lowerBoundNumber= 0;
					int highBoundNumber = 0;
					int sum = 0;
					Scanner userInput1 = new Scanner(System.in);
					System.out.println("pick a lower number");
					lowerBoundNumber = userInput1.nextInt();
					Scanner userInput2 = new Scanner(System.in);
					System.out.println("pick a higher number");
					highBoundNumber = userInput2.nextInt();
					for( int i = lowerBoundNumber; i <= highBoundNumber; i++)
							{
							
							sum = sum + i;
							
							}
						System.out.println(sum);
					}
				public static void rectangle ()
				{
					System.out.println("*********");
					for(int i =0; i <7; i++)
					{
					System.out.println("*       *");
					}
					System.out.println("*********");
					
				
				}

}
