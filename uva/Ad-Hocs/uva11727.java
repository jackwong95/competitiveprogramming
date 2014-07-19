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
import java.util.Arrays;
import java.util.Scanner;
public class uva11727 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i ++){
			int [] values = new int [3];
			for(int j = 0; j < 3; j ++)
				values[j] = scanner.nextInt();
			Arrays.sort(values);
			System.out.println("Case "+(i+1)+": "+values[1]);
			
		}
	}

}
