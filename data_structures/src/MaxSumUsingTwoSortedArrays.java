import java.util.ArrayList;
import java.util.HashMap;

public class MaxSumUsingTwoSortedArrays {
	public static int maxSum(int a[], int b[]){
		HashMap<Integer, Integer> forA = new HashMap<>();
		for(int i: a){
			forA.put(i, i);
		}
		ArrayList<Integer> common = new ArrayList<>();
		for(int i:b){
			if(forA.containsKey(i)){
				common.add(i);
			}
		}
		int ans = 0;
		int counta = 0;
		int countb = 0;
		for(int i=0;i<common.size();i++){
			int suma = 0;

			while(a[counta]!=common.get(i)){
				suma+=a[counta];
				counta++;
			}
			counta++;
			int sumb = 0;

			while(b[countb]!=common.get(i)){
				sumb+=a[countb];
				countb++;
			}
			countb++;
			ans+=Integer.max(suma, sumb)+common.get(i);
		}
		int suma=0;
		if(counta<a.length){
			while(counta!=a.length){
				suma+=a[counta];
				counta++;
			}
		}
		int sumb=0;
		if(countb<b.length){
			while(countb!=b.length){
				sumb+=b[countb];
				countb++;
			}
		}
		ans+=Integer.max(suma, sumb);
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
