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
public class uva10703 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int W = scanner.nextInt(), H = scanner.nextInt(), N = scanner.nextInt();
			if(W==0&&H==0&&H==0)break;
			boolean [][] values = new boolean[W][H];
			for(int k = 0; k < N; k ++){
				int X1 = scanner.nextInt()-1, Y1 = scanner.nextInt()-1, X2 = scanner.nextInt()-1, Y2 = scanner.nextInt()-1;
				int max_x = Math.max(X1, X2), max_y = Math.max(Y1, Y2),min_x = Math.min(X1, X2), min_y = Math.min(Y1, Y2);
				for(int i = min_x; i <= max_x; i ++){
					for(int j = min_y; j <= max_y; j ++){
						values[i][j] = true;
					}
				}
			}
			int ans = 0;
			for(int i = 0; i < H; i ++){
				for(int j = 0; j < W; j ++){
					if(!values[j][i])ans ++;
				}
			}
			if(ans == 0)System.out.println("There is no empty spots.");
			else if(ans == 1) System.out.println("There is one empty spot.");
			else System.out.println("There are "+ans+" empty spots.");
		}
	}
}
