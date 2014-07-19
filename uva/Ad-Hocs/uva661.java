/*
 	This program is free software: you can redistribute it and/or modify 
 	and is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
	
	If you find this program useful and you want to help the author of this program, 
	donate your money to any local charity or buy a book and give it away, make the world
	a more better place for us to live.
	
	author: Jack
	Email: Jackwongtiongkiat@gmail.com
 */
import java.util.Scanner;
public class uva661 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcase = 1;
		while(scanner.hasNext()){
			String[] str = scanner.nextLine().split(" ");
			int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), k = Integer.parseInt(str[2]);
			if(n==0&&m==0&&k==0)break;
			int [] consumptionRate = new int [n+1];
			int ans = 0, answer = 0;
			boolean [] devices = new boolean [n+1];
			for(int i = 1; i <= n; i ++){
				consumptionRate[i] = Integer.parseInt(scanner.nextLine());
				//System.out.println(consumptionRate[i]);
			}
			for(int i = 0; i < m; i ++){
				int index = Integer.parseInt(scanner.nextLine());
				//System.out.println("Index " + index + " " + n + " " + m + " " + k);
				if(!devices[index]){
					devices[index] = true;
					ans += consumptionRate[index];
				}else {
					devices[index] = false;
					ans -= consumptionRate[index];
				}
				answer = Math.max(ans, answer);
			}
			if(answer>k){
				System.out.println("Sequence "+testcase);
			System.out.println("Fuse was blown.");
			System.out.println();
			}
			else{
			System.out.println("Sequence "+testcase);
			System.out.println("Fuse was not blown.");
			System.out.println("Maximal power consumption was "+answer+" amperes.");
			System.out.println();
			}
			testcase++;
		}
	}

}
