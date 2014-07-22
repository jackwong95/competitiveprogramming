/*
 	This program is free software: you can redistribute it and/or modify 
 	and is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
	
	If you find this program useful and you want to help the author of this program, 
	donate your money to any local charity or buy a book and give it away, make the world
	a place for us to live.
	
	author: Jack
	Email: Jackwongtiongkiat@gmail.com
 */
import java.util.Scanner;


public class uva11547 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i ++){
			int ans = scanner.nextInt();
			ans = ans * 567;
			ans = ans / 9;
			ans += 7492;
			ans = ans * 235;
			ans = ans / 47;
			ans -= 498;
			System.out.println(String.valueOf(ans).charAt(String.valueOf(ans).length()-2));
			//System.out.println(ans);		
		}
	}

}
