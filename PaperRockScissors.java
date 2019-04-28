import java.util.Scanner;

public class PaperRockScissors

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String answer;
		
		System.out.println();
		System.out.println("----Rules of the Game---- \nR = Rock, P = Paper, X = Scissors, L = Lizard, S = Spock");
		System.out.println();
		
		//Gameplay in a do-while loop
		do
		{
		System.out.print("Player 1 enter your choice (R, P, X, L, S): ");
		char player1 = kb.nextLine().toUpperCase().charAt(0);
		
		//Input validation for Player 1
		while(!(player1 == 'R' || player1 == 'S' || player1 == 'L' || player1 == 'X' || player1 == 'P'))
		{
			System.out.println("Skynet does not recognize your input.  Try again.");
			System.out.print("Player 1 enter your choice (R, P, X, L, S): ");
			player1 = kb.nextLine().toUpperCase().charAt(0);
		}
		
		System.out.print("Player 2 enter your choice (R, P, X, L, S:) ");
		char player2 = kb.nextLine().toUpperCase().charAt(0);
		
		//Input validation for player 2
		while(!(player2 == 'R' || player2 == 'S' || player2 == 'L' || player2 == 'X' || player2 == 'P'))
		{
			System.out.println("Skynet does not recognize your input.  Try again.");
			System.out.print("Player 2 enter your choice (R, P, X, L, S:) ");
			player2 = kb.nextLine().toUpperCase().charAt(0);
		}
		
		//Rock plays
		if (player1 == 'R' && player2 == 'X')
		{
			System.out.println("Rock crushes Scissors! Player 1 Wins!");
		}
		else if (player1 == 'R' && player2 == 'L')
		{
			System.out.println("Rock crushes Lizard! Player 1 Wins!");
		}
		else if (player2 == 'R' && player1 == 'L')
		{
			System.out.println("Rock crushes Lizard! Player 2 Wins!");
		}
		else if (player2 == 'R' && player1 == 'X')
		{
			System.out.println("Rock crushes Scissors! Player 2 Wins!");
		}
		
		//Lizard plays
		else if (player1 == 'L' && player2 == 'P')
		{
			System.out.println("Lizard eats Paper! Player 1 Wins! ");
		}
		else if (player1 == 'L' && player2 == 'S')
		{
			System.out.println("Lizard poisons Spock! Player 1 Wins!");
		}
		else if (player2 == 'L' && player1 =='P')
		{
			System.out.println("Lizard eats Paper! Player 2 Wins!");
		}
		else if (player2 == 'L' && player1 =='S')
		{
			System.out.println("Lizard poisons Spock! Player 2 Wins!");
		}
		
		//Paper plays
		else if (player1 == 'P' && player2 == 'R')
		{
			System.out.println("Paper covers Rock! Player 1 Wins!");
		}
		else if (player1 == 'P' && player2 == 'S')
		{
			System.out.println("Paper disproves Spock! Player 1 Wins!");
		}
		else if (player2 == 'P' && player1 == 'R')
		{
			System.out.println("Paper covers Rock! Player 2 Wins!");
		}
		else if (player2 == 'P' && player1 == 'S')
		{
			System.out.println("Paper disproves Spock! Player 2 Wins!");
		}
		
		//Scissors plays
		else if (player1 == 'X' && player2 == 'P')
		{
			System.out.println("Scissors cuts Paper! Player 1 Wins!");
		}
		else if (player1 == 'X' && player2 == 'L')
		{
			System.out.println("Scissors decapitates Lizard! Player 1 Wins!");
		}
		else if (player2 == 'X' && player1 == 'P')
		{
			System.out.println("Scissors cuts Paper! Player 2 Wins!");
		}
		else if (player2 == 'X' && player1 == 'L')
		{
			System.out.println("Scissors decapitates Lizard! Player 2 Wins!");
		}
		
		//Spock plays
		else if (player1 == 'S' && player2 == 'X')
		{
			System.out.println("Spock smashes Scissors! Player 1 Wins!");
		}
		else if (player1 == 'S' && player2 == 'R')
		{
			System.out.println("Spock vaporizes Rock! Player 1 Wins!");
		}
		else if (player2 == 'S' && player1 == 'X')
		{
			System.out.println("Spock smashes Scissors! Player 2 Wins!");
		}
		else if (player2 == 'S' && player1 == 'R')
		{
			System.out.println("Spock vaporizes Rock! Player 2 Wins!");
		}
		
		//Tie
		else
		{
			System.out.println("Its a tie! Nobody wins!");
		}
		
		//part of do-while loop
		System.out.print("Would you like to play again? Yes / No:  ");
		answer=kb.nextLine();
		}while(answer.equalsIgnoreCase("Yes"));
		
		{
			System.out.print("Thank you! Come again......");
		}
		
	}
	}
	