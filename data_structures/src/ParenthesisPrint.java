
public class ParenthesisPrint {
	public static void print(int n, int countO, int countC, String toBePrinted){
//		if(countC==0){
//			while(countO!=0){
//				toBePrinted+="(";
//				countO--;
//			}
//			toBePrinted+=")";
//			System.out.println(toBePrinted);
//			return;
//		}
		if(countO==0){
			while(countC!=0){
				toBePrinted+=")";
				countC--;
			}
//			toBePrinted+=")";
			System.out.println(toBePrinted);
			return;
		}
		
		print(n, countO-1, countC, toBePrinted+"(");
		if(countC>countO){
		print(n, countO, countC-1, toBePrinted+")");
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3, 3, 3, "");

	}

}
