import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper 
{
	private int playerWins;
	private int computerWins;
	private boolean isWinner;
	private Scanner scanner;
	private Random random;
	
	private int computersChoice;
	private int playersChoice;
	
	public ScissorRockPaper()
	{
		playerWins = 0;
		computerWins = 0;
		computersChoice = 0;
		playersChoice = 0;
		isWinner = false;
		scanner = new Scanner(System.in);
		random = new Random();
	}
	
	public void play()
	{
		playerWins = 0;
		computerWins = 0;
		isWinner = false;
		
		while(!isWinner)
		{
			System.out.println("**********SCISSOR, ROCK, PAPER!**********");
			System.out.print("PLAYER'S CHOICE [0 - SCISSOR, 1 - ROCK, 2 - PAPER]: ");
			playersChoice = scanner.nextInt();
			
			if(playersChoice < 0 || playersChoice > 2)
			{
				System.out.println("Invalid number! Try again!\n");
				continue;
			}
			
			computersChoice = random.nextInt(3);
			
			if(playersChoice == computersChoice)
			{
				printMoves();
				System.out.println("\nRESULT: DRAW!\n");
			}
			else if(playersChoice == 0 && computersChoice == 1)
			{
				printMoves();
				System.out.println("\nRESULT: COMPUTER WON!\n");
				computerWins++;
			}
			else if(playersChoice == 0 && computersChoice == 2)
			{
				printMoves();
				System.out.println("\nRESULT: PLAYER WON!\n");
				playerWins++;
			}
			else if(playersChoice == 1 && computersChoice == 0)
			{
				printMoves();
				System.out.println("\nRESULT: PLAYER WON!\n");
				playerWins++;
			}
			else if(playersChoice == 1 && computersChoice == 2)
			{
				printMoves();
				System.out.println("\nRESULT: COMPUTER WON!\n");
				computerWins++;
			}
			else if(playersChoice == 2 && computersChoice == 0)
			{
				printMoves();
				System.out.println("\nRESULT: COMPUTER WON!\n");
				computerWins++;
			}
			else
			{
				printMoves();
				System.out.println("\nRESULT: PLAYER WON!\n");
				playerWins++;
			}
			
			if(Math.abs(playerWins - computerWins) == 2)
				isWinner = true;
		}
		
		if(playerWins > computerWins)
			System.out.println("THE PLAYER HAS WON THE ENTIRE GAME!");
		else
			System.out.println("THE COMPUTER HAS WON THE ENTIRE GAME!");
	}
	
	private String evaluate(int number)
	{
		if(number == 0)
			return "SCISSOR";
		else if(number == 1)
			return "ROCK";
		else
			return "PAPER";
	}
	
	private void printMoves()
	{
		System.out.printf("COMPUTER: %-15sPLAYER: %-15s", evaluate(computersChoice), evaluate(playersChoice));
	}
}
