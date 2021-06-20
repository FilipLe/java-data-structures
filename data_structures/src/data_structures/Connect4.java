package data_structures;
import java.util.Scanner;

public class Connect4 {

	public static void main(String[] args) {
		int row = 6;
		int columns = 7;
		boolean playerWon = false;
		Scanner scan = new Scanner(System.in);
		
		String[][] gameboard = new String[row][columns];
		
		//initialize array
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < columns; j++) {				
				gameboard[i][j] = " 0 ";
			}
		}
		
		System.out.println("Gameboard:");
		for(int i = 0; i<row; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(gameboard[i][j]);
		    }
		    System.out.println();
		}
		
		System.out.println("Player 1, please enter your character: ");
		String player1 = scan.nextLine();
		
		System.out.println("Player 2, please enter your character: ");
		String player2 = scan.nextLine();
		while(player1 == player2)
	}

}
