import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(100);
		int n = scan.nextInt();
		int[] v = new int[n+1];
		for(int i=1; i<=n; i++) {
			v[i] = rand.nextInt(n);
			System.out.println(v[i]);
		}
		Arrays.sort(v);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = v[b]-v[a];
		System.out.println(c);
	}
}
