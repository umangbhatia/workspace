import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Solution {
    // you may add more methods here

    public static int maxDiameterSum(int nodes, int[] tree) {
    	if(tree.length==0){
    		return tree[0];
    	}
    	int max = Integer.MIN_VALUE;
        int[] subTree = new int[tree.length/2];
        for(int i=0;i<subTree.length;i++){
        	subTree[i] = tree[i];
        }
        for(int i=tree.length/2;i<tree.length;i++){
        	if(tree[i]>max){
        		max = tree[i];
        	}
        }
        int smallmax = maxDiameterSum(nodes/2, subTree);
        
        
    }

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        
        for(int i=0;i<cases;i++){
            int nodes = Integer.parseInt(br.readLine());            
            
            String[] temp = br.readLine().split(" ");
            int[] tempArr = new int[temp.length];
            
            for(int j=0;j<temp.length;j++)
                tempArr[j]= Integer.parseInt(temp[j]);
            
            int answer = maxDiameterSum(nodes, tempArr);
            System.out.println(answer);
        }
    }
}
