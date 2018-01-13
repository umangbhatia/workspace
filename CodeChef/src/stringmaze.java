
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        int rows, cols;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))  ;
        rows = Integer.parseInt(br.readLine());
        cols = Integer.parseInt(br.readLine()) ;
        char[][] grid  = new char[rows][cols];
        for(int i=0;i<rows;i++){
            grid[i] = br.readLine().toCharArray();
        }
        int no = Integer.parseInt(br.readLine());
        String [] strings = new String[no];
        for(int i=0;i<no;i++){
            strings[i] = br.readLine();
        }
        for(int c=0;c<no;c++){
            System.out.println(findWordInAGrid(grid, rows, cols, strings[c]));
        }
    }
    
    //you may add more methods here
    
    public static Boolean findWordInAGrid(char [][] grid, int rows, int cols, String string) {
        //add code to this function to solve the problem
        //don't write code in this editor
        //your code will not be saved across submissions
       int x = -1;
       int y=-1;
       int xp=-1;
       int yp=-1;
        for(int i=0;i<string.length();i++){
        	char check = string.charAt(i);
        	for(int j=0;j<rows;j++){
        		for(int k=0;k<cols;k++){
        			if(grid[j][k]==check){
        				x=j;y=k;
        				if(i!=1){
        					if(Math.abs(x-xp)>1||Math.abs(y-yp)>1){
        						return false;
        					}
        				}
        				
        			}
        		}
        	}
        	if(x==xp&&y==yp){
        		return false;
        	}else{
        		xp = x;
				yp = y;
        	}
        }
        return true;
    }
}
