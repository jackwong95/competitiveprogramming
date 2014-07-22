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
public class uva11498 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	while(scanner.hasNext()){
	    	int k = scanner.nextInt();
	    	if(k == 0) break;
	    	int x = scanner.nextInt(), y = scanner.nextInt();
	    	for(int t = 0; t < k; t ++){
	    		int n = scanner.nextInt(), m = scanner.nextInt();
	    		if(x<n && y<m)
	    			System.out.println("NE");
	    		else if(x>n && y<m)
	    			System.out.println("NO");
	    		else if(x>n && y>m)
	    			System.out.println("SO");
	    		else if(x<n && y>m)
	    			System.out.println("SE");
	    		else 
	    			System.out.println("divisa");
	    	}
    	}
    }
}
