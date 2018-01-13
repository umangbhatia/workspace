package Tic_Tac_Toe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startGame();
	}

	private static void startGame() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=1;
		Players player1 = takeInput(num++);
		Players player2 = takeInput(num);
		while(player1.symbol==player2.symbol){
			player2 = takeInput(num);
		}
		Board board = new Board();
		board.player1 = player1;
		board.player2 = player2;
		boolean player1move = true;
		board.print();
		
		while(board.gameStatus()==4){
			boolean done = false;
		if(player1move){
			
			while(!done ){
			System.out.println(player1.name+" move");
			System.out.println("enter x");
			int x = s.nextInt();
			System.out.println("Enter y");
			int y = s.nextInt();
			
			try {
				board.move(x,y, player1.symbol);
				done = true;
			} catch (InvalidMoveException e) {
				System.out.println("Invalid Move");
			}
			}
			player1move = false;
		}else{
			while(!done){
			System.out.println(player2.name+" move");
			System.out.println("enter x");
			int x = s.nextInt();
			System.out.println("Enter y");
			int y = s.nextInt();
		
			
				try {
					board.move(x,y, player2.symbol);
					done = true;
				} catch (InvalidMoveException e) {
					System.out.println("Invalid Move");
				}
				}
				player1move = true;
		}
		board.print();
		}
		if(board.gameStatus()==1){
			System.out.println(player1.name+" Wins");
		}
		else if(board.gameStatus()==2){
			System.out.println(player2.name+" Wins");
		}
		else{
			System.out.println("Game draw");
		}

	}

	private static Players takeInput(int i) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Players player1 = new Players();
		System.out.println("Enter player "+i+" name");
		player1.name = s.nextLine();
		System.out.println("Enter symbol");
		player1.symbol = s.next().charAt(0);
		return player1;
	}

}
