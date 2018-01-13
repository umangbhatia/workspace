
public class HanoiTower {
	public static void steps(char source, char helper, char dest, int n){
		if(n==1){
			System.out.println("Move "+n+" from "+source+" to "+dest);
			return;
		}
		steps(source, dest, helper, n-1);
		System.out.println("Move "+n+" from "+source+" to "+dest);
		steps(helper, source, dest, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		steps('a', 'b', 'c', 3);

	}

}
