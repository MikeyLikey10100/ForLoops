import java.util.Scanner;
public class ForLoop
	{

		public static void main(String[] args)
			{
			
				//print5();
				//printDoughnuts();
				//print1To5();
				//printSum();
				printLowerAndUpperBound();
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
						sum += 1;
						}
					System.out.println("The total is: " + sum);
				}
					public static void printLowerAndUpperBound()
						{
							for( int i = 5; i <= 100; i = i+5)
								{
									System.out.println(i);
								}
						}

	}

