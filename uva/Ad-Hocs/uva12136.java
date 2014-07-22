/*
 	This program is free software: you can redistribute it and/or modify 
 	and is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
	
	If you find this program useful and you want to help the author of this program, 
	donate your money to any local charity or buy a book and give it away, make the world
	a better place for us to live.
	
	author: Jack
	Email: Jackwongtiongkiat@gmail.com
	
 */
import java.util.Scanner;
public class uva12136 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), cases = 1;
		scanner.nextLine();
		for(int i = 0; i < n; i ++){
			String temp = scanner.nextLine();
			String temp1 = scanner.nextLine();
			int initialStart = Math.min(toHour(temp),toHourEnd(temp)),initialEnd = Math.max(toHour(temp),toHourEnd(temp));
			int finalStart = Math.min(toHour(temp1),toHourEnd(temp1)),finalEnd =  Math.max(toHour(temp1),toHourEnd(temp1));
			if(initialEnd < finalStart || initialStart > finalEnd){
				System.out.println("Case "+cases+": Hits Meeting");
				cases++;
			}else {
				System.out.println("Case "+cases+": Mrs Meeting");
				cases++;
			}
			
		}
	}
	private static int toHour (String input){
		return(Integer.valueOf(input.substring(0, 2))*60) + (Integer.valueOf(input.substring(3, 5)));
	}
	private static int toHourEnd (String input){
		return(Integer.valueOf(input.substring(6, 8))*60) + (Integer.valueOf(input.substring(9, 11)));
	}
}
