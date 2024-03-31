package demo05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("绕圈：");
		
		Queue<Integer> queue=new LinkedList<>();
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		int res=0;
		while(!queue.isEmpty()) {
			int k=queue.poll();
			res++;
			if(res==m) {
				System.out.print(k+" ");
				res=0;
			}
			else {
				queue.add(k);
			}
		}
		
	}
}
