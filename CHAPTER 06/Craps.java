import java.util.Random;
import java.util.Scanner;

public class Craps 
{
	private Scanner scanner;
	private Random random;
	
	public Craps()
	{
		scanner = new Scanner(System.in);
		random = new Random();
	}
	
	public void play()
	{
		int firstDice = 0;
		int secondDice = 0;
		int sum = 0;
		int established = 0;
		
		System.out.println("*****GAME OF CRAPS*****");
		System.out.print("PRESS ENTER TO ROLL THE DICES! <enter>");
		scanner.nextLine();
		
		firstDice = 1 + random.nextInt(6);
		secondDice = 1 + random.nextInt(6);
		
		System.out.println("YOU ROLLED: " + firstDice + " + " + secondDice + " = " + 
							(firstDice + secondDice));
		
		sum = firstDice + secondDice;
		
		if(sum == 2 || sum == 3 || sum == 12)
			System.out.println("YOU LOST!\n");
		else if(sum == 7 || sum == 11)
			System.out.println("YOU WON!\n");
		else
		{
			established = sum;
			
			System.out.println("ESTABLISHED POINT: " + sum);
			
			sum = 0;
			
			while(sum != 7 && sum != established)
			{
				System.out.println("\nROLL ONCE AGAIN!");
				System.out.print("PRESS ENTER TO ROLL THE DICES! <enter>");
				scanner.nextLine();
				
				firstDice = 1 + random.nextInt(6);
				secondDice = 1 + random.nextInt(6);
				
				System.out.println("YOU ROLLED: " + firstDice + " + " + secondDice + " = " + 
						(firstDice + secondDice));
				
				sum = firstDice + secondDice;
			}
			
			if(sum == 7)
				System.out.println("YOU LOST!\n");
			else
				System.out.println("YOU WON!\n");
		}
	}
}
