import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Name");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Enter number of subjects");
		int n = s.nextInt();
		int i=1;
		int highest=0, secHighest=0;
		while(i<=n){
			System.out.println("Enter marks of subject "+i);
			int marks = s.nextInt();
			i=i+1;
			if(marks>=highest){
				highest=marks;
			}
			if(marks>=secHighest && marks<=highest){
				secHighest=marks;
			}
		}
		double avg=(highest+secHighest)/2.0;
		System.out.println(name+"'s average of top two subjects is: "+avg);

	}

}
