package othello;

public class Board {
	char board[][] = new char[8][8];
	othelloGUI board1 = new othelloGUI();
	Players player1 = new Players();
	Players player2 = new Players();
	int count1 = 2;
	int count2 = 2;
	int[] xDir = {-1,-1,-1,0,1,1,1,0};
	int yDir[] = {-1,0,1,1,1,0,-1,-1};
	public boolean checkIfMovePossible(char symbol){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(board[i][j]=='\0'){
					for(int k=0;k<xDir.length;k++){
						
						int stepX = xDir[k];
						int stepY = yDir[k];
						int currentX = i + stepX;
						int currentY = j + stepY;
						while(currentX>=0&&currentX<=7&&currentY>=0&&currentY<=7){
							if(board[currentX][currentY]=='\0'){
								break;
							}else if(board[currentX][currentY]==symbol){
								if(currentX-stepX == i && currentY-stepY==j){
									break;
								}else{
									return true;
								}
								
							}else{
								currentX +=stepX;
								currentY +=stepY;
							}
						}
					
				}
			}
		}
		}
		return false;
	}
	
	public boolean move(int x, int y, char symbol) throws InvalidMove{
		if(x<0||x>7||y<0||y>7 || board[x][y]!='\0'){
			throw new InvalidMove();
		}
		int count = 0;
		boolean moveSuccessful = false;
		for(int i=0;i<xDir.length;i++){
			
			int stepX = xDir[i];
			int stepY = yDir[i];
			int currentX = x + stepX;
			int currentY = y + stepY;
			while(currentX>=0&&currentX<=7&&currentY>=0&&currentY<=7){
				if(board[currentX][currentY]=='\0'){
					break;
				}else if(board[currentX][currentY]==symbol){
					if(currentX-stepX == x && currentY-stepY==y){
						break;
					}else{
						moveSuccessful = true;
						board[x][y]=symbol;
						currentX = currentX - stepX;
						currentY = currentY-stepY;
						while(true){
							if(currentX==x&&currentY==y){
								break;
							}
							board[currentX][currentY] = symbol;
							
							count++;
							currentX = currentX - stepX;
							currentY = currentY-stepY;
							
						}
						break;
					}
					
				}else{
					currentX +=stepX;
					currentY +=stepY;
				}
			}
		}
		if(moveSuccessful){
			if(symbol==player1.symbol){
				count1+=count+1;
				count2-=count;
			}else{
				count2+=count+1;
				count1-=count;
			}
		}
		return moveSuccessful;
	}
	public int gameStatus(){
		if(!checkIfMovePossible(player1.symbol)&&!checkIfMovePossible(player2.symbol)){
			return 0;
		}
		return 1;
	}
	public void print(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
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
