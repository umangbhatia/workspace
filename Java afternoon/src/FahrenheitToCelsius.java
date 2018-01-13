import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void table(int minVal, int maxVal, int step){
		int fahrenheitVal=minVal;
		int maxFahrenheit=maxVal;
		while(fahrenheitVal<=maxFahrenheit){
			int celsius=(int)((5.0/9)*(fahrenheitVal-32));
			System.out.println(fahrenheitVal+" "+celsius);
			fahrenheitVal=fahrenheitVal+step;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter minimum value");
		int min= s.nextInt();
		System.out.println("Enter maximum value");
		int max= s.nextInt();
		System.out.println("Enter step value");
		int step=s.nextInt();
		table(min, max, step);

	}

}
