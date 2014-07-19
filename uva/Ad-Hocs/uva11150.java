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
public class uva11150 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int N = scanner.nextInt();
			System.out.println(Math.max(getCola(N, 0), Math.max(getCola(N, 1), getCola(N, 2))));
		}
	}
	private static int getCola(int n, int i) {
		//System.out.println("----------------Start--------------- " + i);
		int ans = 0, emptyBottle = i;
		ans += n;
		n += i;
		//System.out.println(ans + " " + n + " " + emptyBottle);
		while(n >= 3){
			emptyBottle = n % 3;
			n = n/3 + (emptyBottle);
			ans += (n-emptyBottle);
			//System.out.println(ans + " " + n + " " + emptyBottle);
		}
		//System.out.println(ans + " " + n + " " + emptyBottle);
		if(n >= i)
			return ans;
		else return 0;
	}
}
