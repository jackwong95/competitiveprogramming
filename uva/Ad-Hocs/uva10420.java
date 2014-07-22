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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class uva10420 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, HashSet<String>> map = new HashMap<String,HashSet<String>>();
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < n; i ++){
			String temp = scanner.nextLine();
			String country = temp.substring(0, temp.indexOf(' '));
			String name = temp.substring(temp.indexOf(' ')+1, temp.length());
			if(!map.containsKey(country)){
				HashSet tempSet = new HashSet();
				tempSet.add(name);
				map.put(country, tempSet);
			}else {
				HashSet tempSet = map.get(country);
				tempSet.add(name);
				map.put(country, tempSet);
			}
		}
		List sortedKeys=new ArrayList(map.keySet());
		Collections.sort(sortedKeys);
		for(int i = 0; i < sortedKeys.size(); i ++){
			System.out.println(sortedKeys.get(i)+ " " +map.get(sortedKeys.get(i)).size());
			
		}
		//System.out.println(sortedKeys);
	}

}
