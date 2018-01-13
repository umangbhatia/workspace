package dynamicProgramming;

public class EditDistance {
	public static int edit(String s, String t){
		if(s.length()==0){
			return t.length();
		}
		if(t.length()==0){
			return s.length();
		}
		if(s.charAt(0)==t.charAt(0)){
			return edit(s.substring(1), t.substring(1));
		}else{
			return 1+Math.min(edit(s, t.substring(1)), Math.min(edit(s.substring(1), t), edit(s.substring(1), t.substring(1))));
		}
	}
	public static int editR(String s, String t){
		int storage[][]= new int[s.length()+1][t.length()+1];
		for(int i=0;i<storage.length;i++){
			for(int j=0;j<storage[i].length;j++){
				storage[i][j] = -1;
			}
		}
		return editR(s, t, storage);
	}

	private static int editR(String s, String t, int[][] storage) {
		int m = s.length();
		int n = t.length();
		if(m==0){
			storage[m][n] = t.length();
			return storage[m][n];
		}
		if(n==0){
			storage[m][n] = s.length();
			return storage[m][n];
		}
		if(storage[m][n]!=-1){
			return storage[m][n];
		}
		if(s.charAt(0)==t.charAt(0)){
			storage[m][n] = editR(s.substring(1), t.substring(1), storage);
			return storage[m][n];
		}else{
			int option1 = editR(s.substring(1), t.substring(1), storage);
			int option2 = editR(s, t.substring(1), storage);
			int option3 = editR(s.substring(1), t, storage);
			storage[m][n] = 1+Math.min(option1, Math.min(option2, option3));
		}
		return storage[m][n];
	}
	public static int editDistanceI(String s, String t){
		int m=s.length();
		int n=t.length();
		int storage[][] = new int[m+1][n+1];
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s.charAt(m-i)==t.charAt(n-j)){
				storage[i][j] = storage[i-1][j-1];
				}
				else{
					int one = storage[i][j-1];
					int two = storage[i-1][j];
					if(one>two){
						storage[i][j] = 1+two;
					}else{
						storage[i][j] = 1+one;
					}
				}
			}
		}
		return storage[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abrc";
		String t = "dabra";
		System.out.println(editDistanceI(s, t));
		System.out.println(editR(s, t));

	}

}
//int storage[][] = new int[m+1][n+1];
//for(int i=1;i<m;i++){
//	for(int j=1;j<n;j++){
//		if(s.charAt(m-i)==t.charAt(n-j)){
//			storage[i][j] = storage[i-1][j-1];
//		}else{
//			int one = storage[i-1][j];
//			int two = storage[i][j-1];
//			if(one>two){
//				storage[i][j]=one;
//			}else{
//				storage[i][j]=two;
//			}
//		}
//	}
//}