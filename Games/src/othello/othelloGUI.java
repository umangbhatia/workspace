package othello;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class othelloGUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	int count1 = 2;
	int count2 = 2;
	public Players player1 = takeInput(1);
	public Players player2 = takeInput(2);
	boolean player1move = true;
	int[] xDir = {-1,-1,-1,0,1,1,1,0};
	int yDir[] = {-1,0,1,1,1,0,-1,-1};



	JButton button[] = new JButton[65];
	JPanel[] row = new JPanel[9];
	JLabel[] label = new JLabel[4];
	Font font = new Font("Times new Roman", Font.BOLD, 14);


	public othelloGUI() {
		// TODO Auto-generated constructor stub
		super("Othello");
		//	        setDesign();
		setSize(800, 350);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(9,9);
		setLayout(grid);



		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,1,1);
		for(int i = 0; i < 9; i++)
			row[i] = new JPanel();
		row[0].setLayout(f1);
		for(int i = 1; i < 9; i++)
			row[i].setLayout(f2);

		for(int i = 1; i < 65; i++) {
			button[i] = new JButton();
			button[i].setBackground(Color.green);
			button[i].addActionListener(this);
		}
		button[28].setBackground(Color.white);
		button[29].setBackground(Color.black);
		button[36].setBackground(Color.black);
		button[37].setBackground(Color.white);

		button[0] = new JButton();
		button[0].setText("New Game!");
		button[0].setBackground(Color.white);
		button[0].setFont(font);
		button[0].addActionListener(this);
		for(int i=0;i<4;i++){
			label[i] = new JLabel();
			label[i].setSize(80, 40);
		}
		label[0].setText("Player1: ");
		label[1].setText("White: ");
		label[2].setText("Player2: " );
		label[3].setText("Black: ");


		for(int i = 1; i < 65; i++)
			button[i].setSize(40, 40);
		button[0].setSize(80, 30);

		row[0].add(button[0]);
		add(row[0]);

		for(int i = 1; i < 9; i++)
			row[1].add(button[i]);
		add(row[1]);

		for(int i = 9; i < 17; i++)
			row[2].add(button[i]);
		add(row[2]);

		for(int i = 17; i < 25; i++)
			row[3].add(button[i]);
		add(row[3]);


		for(int i = 25; i < 33; i++)
			row[4].add(button[i]);
		add(row[4]);
		for(int i = 33; i < 41; i++)
			row[5].add(button[i]);
		add(row[5]);
		for(int i = 41; i < 49; i++)
			row[6].add(button[i]);
		add(row[6]);
		for(int i = 49; i < 57; i++)
			row[7].add(button[i]);
		add(row[7]);
		for(int i = 57; i < 65; i++)
			row[8].add(button[i]);
		add(row[8]);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		othelloGUI o = new othelloGUI();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==button[0]){
			for(int i = 1; i < 65; i++) {
				button[i].setBackground(Color.green);
			}
			button[28].setBackground(Color.white);
			button[29].setBackground(Color.black);
			button[36].setBackground(Color.black);
			button[37].setBackground(Color.white);
			count1=2;
			count2=2;
			

		}else{
			boolean done=false;

				int i=1;
				for(;i<65;i++){
					if(ae.getSource()==button[i]){
						break;
					}
				}
				int x=i/8;
				int y=i%8;
				if(y==0){
					y=8;
					x--;
				}
				boolean check = false;
				if(player1move){
					check = checkIfMovePossible(player1);
					if(check){
						try {
							done=move(x, y, player1);
							if(done)
								player1move = false;
						} catch (InvalidMove e) {
							// TODO Auto-generated catch block
							//						e.printStackTrace();
						}
					}else{
						player1move=false;
					}

				}else{
					check = checkIfMovePossible(player2);
					if(check){
						try {

							done = move(x, y, player2);
							if(done){
								player1move=true;
							}

						} catch (InvalidMove e) {
							// TODO Auto-generated catch block
							//						e.printStackTrace();

						}
					}
					else{
						player1move=true;
					}

				}
				boolean check1 = checkIfMovePossible(player1);
				boolean check2 = checkIfMovePossible(player2);
				if(!check1&&!check2){
					if(count1>count2){
						System.out.println(player1.name+" wins!");
					}
					else if(count1<count2){
						System.out.println(player2.name+" wins!");
					}else{
						System.out.println("It's a draw!");
					}
					
				}

		}

	}


	public boolean checkIfMovePossible(Players player ){
		for(int i=0;i<8;i++){
			for(int j=1;j<9;j++){
				if(button[i*8+j].getBackground()==Color.green){
					for(int k=0;k<xDir.length;k++){

						int stepX = xDir[k];
						int stepY = yDir[k];
						int currentX = i + stepX;
						int currentY = j + stepY;

						while(currentX>=0&&currentX<=7&&currentY>=1&&currentY<=8){
							if(button[currentX*8+currentY].getBackground()==Color.green){
								break;
							}else if(button[currentX*8+currentY].getBackground()==player.c){
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

	public boolean move(int x, int y, Players player) throws InvalidMove{
		if(x<0||x>7||y<1||y>8 || button[x*8+y].getBackground()!=Color.green){
			throw new InvalidMove();
		}
		int count = 0;
		boolean moveSuccessful = false;
		for(int i=0;i<xDir.length;i++){

			int stepX = xDir[i];
			int stepY = yDir[i];
			int currentX = x + stepX;
			int currentY = y + stepY;

			while(currentX>=0&&currentX<=7&&currentY>=1&&currentY<=8){
				if(button[currentX*8+currentY].getBackground()==Color.green){
					break;
				}else if(button[currentX*8+currentY].getBackground()==player.c){
					if(currentX-stepX == x && currentY-stepY==y){
						break;
					}else{
						moveSuccessful = true;
						button[x*8+y].setBackground(player.c);
						currentX = currentX - stepX;
						currentY = currentY-stepY;
						while(true){
							if(currentX==x&&currentY==y){
								break;
							}
							button[currentX*8+currentY].setBackground(player.c);

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
			if(player == player1){
				count1+=count+1;
				count2-=count;
			}else{
				count2+=count+1;
				count1-=count;
			}
		}
		return moveSuccessful;
	}
	private static Players takeInput(int i) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Players player1 = new Players();
		System.out.println("Enter player "+i+" name");
		player1.name = s.nextLine();
		System.out.println("Enter symbol");
		player1.symbol = s.next().charAt(0);
		if(i==1){
			player1.c = Color.BLACK;
		}else{
			player1.c = Color.white;
		}
		return player1;
	}

}
