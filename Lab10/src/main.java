import java.util.Scanner;
public class main {
	static int histo(int[] v, int a, int b) {
		if(a>b) return 0;
		int min = a;
		for(int i=a; i<=b; i++) {
			if(v[min]>v[i])
				min=i;
		}
		return Math.max(v[min]*(b-a+1),Math.max(histo(v,a,min-1),histo(v,min+1,b)));
	}
	static int histo(int[] v, int n) {
		return histo(v,0,n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i=0; i<n; i++) {
			v[i]=sc.nextInt();
		}
		int r = histo(v,n);
		System.out.println(r);
	}
}
