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
public class uva10921 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	while(scan.hasNext()){
    	System.out.println(scan.nextLine().replaceAll("A", "2").replaceAll("B", "2").replaceAll("C", "2")
    			.replaceAll("D", "3").replaceAll("E", "3").replaceAll("F", "3")
    			.replaceAll("G", "4").replaceAll("H", "4").replaceAll("I", "4")
    			.replaceAll("J", "5").replaceAll("K", "5").replaceAll("L", "5")
    			.replaceAll("M", "6").replaceAll("N", "6").replaceAll("O", "6")
    			.replaceAll("P", "7").replaceAll("Q", "7").replaceAll("R", "7").replaceAll("S", "7")
    			.replaceAll("T", "8").replaceAll("U", "8").replaceAll("V", "8")
    			.replaceAll("X", "9").replaceAll("W", "9").replaceAll("Y", "9").replaceAll("Z", "9")
    			);	
    	}
    }
}
