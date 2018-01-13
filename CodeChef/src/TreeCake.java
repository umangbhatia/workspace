import java.util.Scanner;

public class TreeCake {
	public static int number(int h){
		if(h==1||h==2||h==3){
			return 1%(1000000007);
		}else{
			return number(h-1)+number(h-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int ans = number(h);
		System.out.println(ans);

	}

}
