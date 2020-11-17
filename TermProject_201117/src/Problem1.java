import java.util.Random;
import java.util.Scanner;
public class Problem1 {
	public static int[] queue;
	public static int[] stack;
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		queue = new int[n];
		for(int i=0; i<n; i++) {
			queue[i] =r.nextInt(10000);
		}
		stack = new int[queue.length];
		sort(0,queue.length-1);
		print(queue);
	}
	public static void sort(int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			sort(start,mid);
			sort(mid+1,end);
			int p = start;
			int q = mid+1;
			int s = p;
			while(p<=mid || q<=end) {
				if(q>end || (p<=mid && queue[p]<queue[q])) {
					stack[s++]=queue[p++];
				} else {
					stack[s++]=queue[q++];
				}
			}
			for(int i=start; i<=end;i++) {
				queue[i]=stack[i];
			}
		}
	}
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

}
