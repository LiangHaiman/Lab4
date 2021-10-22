package lab4;

import java.util.Scanner;

public class Test7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[101];
		int n = -1;
		Scanner input = new Scanner(System.in);
		do {
			n = input.nextInt();
			list[n]++;
		}while(n!=0);
			for (int i = 1; i < 101;i++){
	            if (list[i] == 0){continue;}
	            else if (list[i] == 1){
	                System.out.println(i + " occurs " + list[i] + " time");
	            } else
	                System.out.println(i + " occurs " + list[i] + " times");
	        }
	}

}
