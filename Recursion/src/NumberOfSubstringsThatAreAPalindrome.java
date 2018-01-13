
public class NumberOfSubstringsThatAreAPalindrome {
	public static int count(String str, int bi){
		int count=1;
		if(bi==str.length()-1){
			return 1;
		}
		int i=bi-1,j=bi+1;

		while(i>=0&&j<=str.length()-1){
			if(str.charAt(i)==str.charAt(j)){
				i--;
				j++;
				count++;
			}
			else
				break;
		}

		

		if(str.charAt(bi)==str.charAt(bi+1)){
			count++;
			int k=bi-1,l=bi+2;
			while(k>=0&&l<=str.length()-1){
				if(str.charAt(i)==str.charAt(j)){
					i--;
					j++;
					count++;
				}
				else
					break;
			}
			return count+count(str, bi+1);
		}
		return count+count(str, bi+1);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abba";
		System.out.println(count(str, 0));

	}

}
