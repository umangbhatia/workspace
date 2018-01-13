package Tic_Tac_Toe;

public class Board {
	char board[][] = new char[3][3];
	Players player1 = new Players();
	Players player2 = new Players();
	int incomplete = 4;
	int player1wins = 1;
	int player2wins = 2;
	int draw = 3;

	public void move(int x, int y, char symbol) throws InvalidMoveException {
		// TODO Auto-generated method stub
		if(x < 0 || x > 2 || y < 0 || y > 2 || board[x][y]!='\0'){
			throw new InvalidMoveException();
		}else{
			board[x][y] = symbol;
		}
		
	}

	public int gameStatus() {
		
		for(int i =0;i<3;i++){
			if(board[i][0]!='\0'&& board[i][0] == board[i][1] && board[i][1] == board[i][2]){
				if(board[i][0] == player1.symbol){
					return 1;
				}
				else{
					return 2;
				}
			}
		}
		for(int i = 0; i < 3; i++){
			if(board[0][i] != '\0' &&board[0][i] == board[1][i] && board[1][i] == board[2][i]){
				if(board[0][i] == player1.symbol){
					return 1;
				}
				else{
					return 2;
				}
			}
		}
		if(board[0][0] != '\0' &&board[0][0] == board[1][1] && board[1][1] == board[2][2]){
			if(board[0][0] == player1.symbol){
				return 1;
			}
			else{
				return 2;
			}
		}

		if(board[0][2] != '\0' &&board[0][2] == board[1][1] && board[1][1] == board[2][0]){
			if(board[0][2] == player1.symbol){
				return 1;
			}
			else{
				return 2;
			}
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(board[i][j]=='\0'){
					return 4;
				}
			}
		}
		return 3;
	}
	public void print(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(board[i][j]!='\0')
				System.out.print("| "+board[i][j]+" |");
				else{
					System.out.print("|   |");
				}
					
			}
			System.out.println();
		}
	}
	

}
