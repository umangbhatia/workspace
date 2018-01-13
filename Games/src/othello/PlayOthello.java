package othello;

import java.util.Scanner;

public class PlayOthello {

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
		board.board[3][3] = player2.symbol;
		board.board[3][4] = player1.symbol;
		board.board[4][4] = player2.symbol;
		board.board[4][3] = player1.symbol;
		board.print();
		while(board.gameStatus()==1){
			boolean done = false;
			if(player1move){
				if(board.checkIfMovePossible(player1.symbol)){
				while(!done ){
				System.out.println(player1.name+" move");
				System.out.println("enter x");
				int x = s.nextInt();
				System.out.println("Enter y");
				int y = s.nextInt();
				
				try {
					done = board.move(x,y, player1.symbol);
				} catch (InvalidMove e) {
					System.out.println("Invalid Move");
				}
				}
				}else{
					System.out.println("No move possible for "+player1.name);
				}
				player1move = false;
			}else{
				if(board.checkIfMovePossible(player2.symbol)){
				while(!done){
				System.out.println(player2.name+" move");
				System.out.println("enter x");
				int x = s.nextInt();
				System.out.println("Enter y");
				int y = s.nextInt();
			
				
					try {
						done = board.move(x,y, player2.symbol);
						
					} catch (InvalidMove e) {
						System.out.println("Invalid Move");
					}
					}
				}
				else{
					System.out.println("No move possible for "+player2.name);
				}
					player1move = true;
			}
			board.print();

		}
		System.out.println("No further moves possible!");
		if(board.count1>board.count2){
			System.out.println(player1.name+" wins!");
		}else if(board.count1<board.count2){
			System.out.println(player2.name+" wins!");
		}else{
			System.out.println("It's a draw");
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
