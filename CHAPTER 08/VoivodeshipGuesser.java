import java.util.Scanner;

public class VoivodeshipGuesser 
{
	private static String[][] voivodeshipCapitals = {{"West Pomeranian", "Szczecin", ""},
													{"Pomeranian", "Gdansk", ""},
													{"Warmian-Masurian", "Olsztyn", ""},
													{"Podlaskie", "Bialystok", ""},
													{"Lubusz", "Zielona Gora", "Gorzow Wielkopolski"},
													{"Greater Poland", "Poznan", ""},
													{"Lodz", "Lodz", ""},
													{"Masovian", "Warszawa", ""},
													{"Kuyavian-Pomeranian", "Bydgoszcz", "Torun"},
													{"Lublin", "Lublin", ""},
													{"Lower Silesian", "Wroclaw", ""},
													{"Opole", "Opole", ""},
													{"Silesian", "Katowice", ""},
													{"Lesser Poland", "Krakow", ""},
													{"Podkarpackie", "Rzeszow", ""},
													{"Swietokrzyskie", "Kielce", ""}};
	
	public static void play()
	{
		Scanner scanner = new Scanner(System.in);
		
		String answer = "";
		int correctAnswers = 0;
		
		for(int i = 0; i < 16; i++)
		{
			System.out.print("What is the capital of " + voivodeshipCapitals[i][0] + " Voivodeship: ");
			
			answer = scanner.nextLine();
			
			if(answer.equals(voivodeshipCapitals[i][1]) || answer.equals(voivodeshipCapitals[i][2]))
			{
				correctAnswers++;
				System.out.println("This is correct answer!\n");
			}
			else
			{
				System.out.println("This is incorrect answer!");
				System.out.print("Correct answer is: " + voivodeshipCapitals[i][1]);
				
				if(!voivodeshipCapitals[i][2].equals(""))
				{
					System.out.println(" or " + voivodeshipCapitals[i][2]);
				}
				
				System.out.println("\n");
			}
		}
		
		System.out.println("You scored " + correctAnswers + "/16 points!\n");
	}
}
