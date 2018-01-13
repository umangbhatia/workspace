import java.util.Scanner;
public class NumberKeyboard {
	public static String[] combinations(int n){
		if(n==0){
			String output[]={""};
			return output;
		}
		int r=n%10;
		String smalloutput[]= combinations(n/10);
		if(n==7 || n==9){
			String output[]= new String[smalloutput.length*4];
			if(n==7){
				for(int i=0;i<output.length/4;i++){
					output[i]="p"+smalloutput[i];
				}
				for(int i=0;i<output.length/4;i++){
					output[i+smalloutput.length]="q"+smalloutput[i];
				}
				for(int i=0;i<output.length/4;i++){
					output[i+2*smalloutput.length]="r"+smalloutput[i];
				}
				for(int i=0;i<output.length/4;i++){
					output[i+3*smalloutput.length]="s"+smalloutput[i];
				}
				return output;
				
			}if(n==9){
				for(int i=0;i<output.length/4;i++){
					output[i]="w"+smalloutput[i];
				}
				for(int i=0;i<output.length/4;i++){
					output[i+smalloutput.length]="x"+smalloutput[i];
				}
				for(int i=0;i<output.length/4;i++){
					output[i+2*smalloutput.length]="y"+smalloutput[i];
				}
				for(int i=0;i<output.length/4;i++){
					output[i+3*smalloutput.length]="z"+smalloutput[i];
				}
				return output;
			}
		} 
		else{
		String output[]= new String[smalloutput.length*3];
		if(r==2){
			for(int i=0;i<output.length/3;i++){
				output[i]="a"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+smalloutput.length]="b"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+2*smalloutput.length]="c"+smalloutput[i];
			}
			return output;
		}
		if(r==3){
			for(int i=0;i<output.length/3;i++){
				output[i]="d"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+smalloutput.length]="e"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+2*smalloutput.length]="f"+smalloutput[i];
			}
			return output;
		}if(r==4){
			for(int i=0;i<output.length/3;i++){
				output[i]="g"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+smalloutput.length]="h"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+2*smalloutput.length]="i"+smalloutput[i];
			}
			return output;
		}if(r==5){
			for(int i=0;i<output.length/3;i++){
				output[i]="j"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+smalloutput.length]="k"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+2*smalloutput.length]="l"+smalloutput[i];
			}
			return output;
		}
		if(r==6){
			for(int i=0;i<output.length/3;i++){
				output[i]="m"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+smalloutput.length]="n"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+2*smalloutput.length]="o"+smalloutput[i];
			}
			return output;
		}if(r==8){
			for(int i=0;i<output.length/3;i++){
				output[i]="t"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+smalloutput.length]="u"+smalloutput[i];
			}
			for(int i=0;i<output.length/3;i++){
				output[i+2*smalloutput.length]="v"+smalloutput[i];
			}
			return output;
		}
		}
		String output[]={};
		return output;
		
		
	}
	public static void printArr(String arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0, i=1,r;
		while(1<=n){
			r=n%10;
			
			n=n/10;
			sum = r + 10*sum;
		}
		String output[]=combinations(sum);
		printArr(output);
		

	}
	
}
