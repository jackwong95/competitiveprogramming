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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class uva11340 {
 public static void main(String[] args) throws IOException {
	 BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
     int testcases = Integer.parseInt(scanner.readLine());
     StringBuffer sb = new StringBuffer();
     for(int t = 0; t < testcases; t ++){
    	int k = Integer.parseInt(scanner.readLine());
    	//int [] values = new int [280];
    	HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
	    for(int i = 0; i < k; i ++){
	    	StringTokenizer String =new StringTokenizer(scanner.readLine());
	    	char temp = String.nextToken().charAt(0);
	    	//int value = scanner.nextInt();
	    	hm.put(temp, Integer.valueOf(String.nextToken()));
	    	//System.out.println(temp + " " + value);
    	}
	    long sum = 0;
	    int n = Integer.parseInt(scanner.readLine());
	    for(int i = 0; i < n; i ++){
	    	String temp = scanner.readLine();
	    	//System.out.println(temp);
	    	for(int j = 0; j < temp.length(); j ++){
	    		//System.out.print(temp.charAt(j));
	    		if(hm.containsKey(temp.charAt(j)))
	    		sum += hm.get(temp.charAt(j));
	    	}
	    	//System.out.println();
	    }
	    long yy = sum % 100;
	    long xx = sum / 100;
	    String temp = String.valueOf(yy);
	    if(temp.length()<2){
	    	temp="0"+temp;
        }
	    System.out.println(xx+"."+temp+"$");
     }
 }
}