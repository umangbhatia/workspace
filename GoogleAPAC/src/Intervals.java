import java.util.HashMap;
import java.util.Scanner;

public class Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long t = s.nextInt();
		for(long j=0;j<t;j++){
			int n = s.nextInt();
			
			long l = s.nextInt();
			long r=s.nextInt();
			long a=s.nextInt();
			long b=s.nextInt();
			long c1=s.nextInt();
			long c2=s.nextInt();
			long m=s.nextInt();
			long arr[][] = new long[n][2];
			arr[0][0]=l;
			arr[0][1]=r;
			long xp = l;
			long yp = r;
			for(int i=1;i<n;i++){
				long x = (a*xp + b*yp + c1)%m;
				long y = (a*yp + b*xp + c2)%m;
				l = Long.min(x, y);
				r = Long.max(x, y);
				xp =x;
				yp=y;
				arr[i][0]=l;
				arr[i][1]=r;
			}
			System.out.println("Case #"+(j+1)+": "+ans(arr));


		}
	}

	private static long ans(long[][] arr) {
		HashMap<Long, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			for(long j=arr[i][0];j<=arr[i][1];j++){
				if(map.containsKey(j)){
					int value = map.get(j);
					map.put(j, value+1);
				}else{
					map.put(j, 1);
				}
			}
		}
		int size = map.size();
		int out[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int x=0;
			for(long j=arr[i][0];j<=arr[i][1];j++){
				
				int value = map.get(j);
				if(value==1){
					x++;
				}
			}
			out[i] = size-x;
		}
		int min = out[0];
		for(int i=1;i<out.length;i++){
			if(out[i]<min){
				min = out[i];
			}
		}
		return min;
	}

}
