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
public class uva483 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String temp = scanner.nextLine(), ans = "", append = "";
			for(int i = temp.length()-1; i >= 0; i --){
				append = append.concat(temp.charAt(i)+"");
				if(temp.charAt(i)==' '){
					ans = append + ans;
					append = "";
				}
			}
			if(!append.equals(' '))
				ans = append + " " + ans;
			System.out.println(ans.trim());
		}
	}
}
