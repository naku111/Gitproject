package lanqiaobei02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 动态规划
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scanner.nextInt();
		int[] dp=new int[n];//状态方程存储每个位置最大上升序列个数
		dp[0]=1;
		int max=1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				dp[i]=1;
				if(a[i]>a[j]) {
					dp[i]=Math.max(dp[j]+1, dp[i]);
					//dp【j】不是随着j的增长而增长的，所以我们要取一个max
					//举例：2 7 1 9
				}
			}
			max=Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
