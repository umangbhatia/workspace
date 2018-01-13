package dynamicProgramming;

public class LargestCommonSubstring {
	public static int lcs(String s, String t){
		if(s.length()==0||t.length()==0){
			return 0;
		}
		if(s.charAt(0)==t.charAt(0)){
			return 1 + lcs(s.substring(1), t.substring(1));
		}else{
			return Math.max(lcs(s, t.substring(1)), lcs(s.substring(1), t));
		}
	}
	

	public static String lcsString(String s, String t){
		
		if(s.length()==0||t.length()==0){
			return null;
		}
		if(s.charAt(0)==t.charAt(0)){
			return s.charAt(0) + lcsString(s.substring(1), t.substring(1));
		}else{
			if(lcsString(s, t.substring(1)).length()>lcsString(s.substring(1), t).length()){
				return lcsString(s, t.substring(1));
			}else{
				return lcsString(s.substring(1), t);
			}
		}
	}
	public static String lcsStringI(String s, String t){
		String storage[][] = new String[s.length()+1][t.length()+1];
		int m = s.length();
		int n = t.length();
		for(int i=0;i<s.length();i++){
			storage[i][0] = "";
		}
		for(int i=0;i<t.length();i++){
			storage[0][i] = "";
		}
		for(int i=1;i<s.length();i++){
			for(int j=1;j<t.length();j++){
				if(s.charAt(m-i)==s.charAt(n-j)){
					storage[i][j]=s.charAt(m-i)+storage[i-1][j-1];
				}else{
					String option1 = storage[i][j-1];
					String option2 = storage[i-1][j];
					if(option1.length()>option2.length()){
						storage[i][j]=option1;
					}else{
						storage[i][j]=option2;
					}
				}
			}
		}
		return storage[m][n];
	}
	public static String lcsStringR(String s, String t){
		String storage[][] = new String[s.length()+1][t.length()+1];
		return lcsStringR(s,t, storage);
	}
	private static String lcsStringR(String s, String t, String[][] storage) {
		int m = s.length();
		int n = t.length();
		if(m==0||n==0){
			storage[m][n] = "";
			return storage[m][n];
		}
		if(storage[m][n]!=null){
			return storage[m][n];
		}
		if(s.charAt(0)==t.charAt(0)){
			storage[m][n] = s.charAt(0)+ lcsStringR(s.substring(1), t.substring(1), storage);
			return storage[m][n];
		}else{
			String option1 = lcsStringR(s.substring(1), t, storage);
			String option2 = lcsStringR(s, t.substring(1), storage);
			if(option1.length()>option2.length()){
				storage[m][n] = option1;
			}else{
				storage[m][n] = option2;
			}
		}
		
		return storage[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
