import java.util.Scanner;

class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		while(true){
			num = s.nextInt();
			if(num!=42){
				System.out.println(num);
			}else{
				break;
			}
		}

	}

}
