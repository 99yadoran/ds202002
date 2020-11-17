import java.util.Scanner;

class Queue {
	private int[] q;
	private int front = 0;
	private int back = -1;

	Queue() {
	}
	Queue(int num) {
		q = new int[num];
	}
	public void push(int x) {
		q[++back] = x;
	}
	public int size() {
		return back - front + 1;
	}
	public boolean isEmpty() {
		if (size() == 0)
			return true;
		else
			return false;
	}
	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			return q[front++];
		}
	}
	public int front() {
		if (isEmpty()) {
			return -1;
		} else {
			return q[front];
		}
	}
	public int back() {
		if (isEmpty()) {
			return -1;
		} else {
			return q[back];
		}
	}
}

public class Problem2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Queue q = new Queue(num);
		for (int i = 0; i < num; i++) {
			String x = sc.next();
			switch(x) {
				case "push":
					int y = sc.nextInt();
					q.push(y);
					break;
				case "pop":
					System.out.println(q.pop());
					break;
				case "empty":
					if (q.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					System.out.println(q.front());
					break;
				case "back":
					System.out.println(q.back());
					break;
				case "size":
					System.out.println(q.size());
					break;
			}
		}
	}
}