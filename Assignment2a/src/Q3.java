import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		t_sal = basic + hra + da + allow � pf
//				where : hra = 20% of basic
//				da = 50% of basic
//				allow = 1700 if grade = �A�
//				allow = 1500 if grade = �B�
//				allow = 1300 if grade = �C�
//				pf = 11% of basic.

		System.out.println("Enter basic salary");
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		System.out.println("Enter grade");
		String grade = s.next();
		double hra, da, allow, t_sal, pf;
		hra = 0.2*basic;
		pf=.11*basic;
		da=.5*basic; 
		if(grade=="A" || grade=="a"){
			allow = 1700;
			t_sal = basic + hra + da;
			t_sal = allow - pf + t_sal;
			System.out.println("total salary is: "+t_sal);
		}
		if(grade=="B" || grade=="b"){
			allow = 1500;
			t_sal = basic + hra + da;
			t_sal = allow - pf + t_sal;
			System.out.println("total salary is: "+t_sal);
		}
		if(grade=="C" || grade=="c"){
			allow = 1700;
			t_sal = basic + hra + da;
			t_sal = allow - pf + t_sal;
			System.out.println("total salary is: "+t_sal);
		}
	}

}
