package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ApostekSumElements{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =  s.nextInt();                
		s.nextLine();
		int[] arr = new int[n];
		int res = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (int i =0; i < n; i++) {
			int last = i;
			int result =0;
			for (int j = 0; j < n; j++) {
				last += j;
				if (last >= n){
					break;
				}
				int sum =0;
				for (int k = 0; k <= j; k++) {
					if(last+k > n-1) {
						sum=0;
						break;
					}
					sum += arr[last+k];
				}
				result += sum;
			}
			if (result > res){
				res = result;
			}
		}
		
		System.out.println(res);
	}

}
