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

public class uva272 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		while(scanner.hasNext()){
			String temp = scanner.nextLine();
			for(int i = 0; i < temp.length(); i ++){
				if(temp.charAt(i)=='"'){
					if(!flag){
						flag = true;
						temp = temp.substring(0, i) +"``" + temp.subSequence(i+1, temp.length());
					}else {
						flag = false;
						temp = temp.substring(0, i) +"''" + temp.subSequence(i+1, temp.length());
					}
				}
			}
			System.out.println(temp);
		}
	}

}
