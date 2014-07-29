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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class uva11308 {
	public static void main(String[] args) throws IOException {
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer builder = new StringBuffer("");
		int N = Integer.parseInt(scanner.readLine());
		for(int u = 0; u < N; u ++){
			String foodCategory = scanner.readLine();
			//System.out.println(foodCategory);
			String [] temps = scanner.readLine().split(" ");
			int ingredients = Integer.parseInt(temps[0]), recipes = Integer.parseInt(temps[1]), budget = Integer.parseInt(temps[2]);
			//System.out.println(temps[0] + " " + temps[1] + " " + temps[2]);
			HashMap<String, Integer> price = new HashMap<>();
			TreeMap<String, Integer> flag = new TreeMap<>();
			for(int i = 0; i < ingredients; i ++){
				String [] temp = scanner.readLine().split(" ");
				price.put(temp[0], Integer.parseInt(temp[1]));
				//System.out.println(temp[0] + " " + temp[1]);
			}
			System.out.println(foodCategory.toUpperCase());
			boolean isTrue = false;
			for(int i = 0; i < recipes; i ++){
				String recipeName = scanner.readLine();
				//System.out.println(recipeName);
				int ingredientsNeeded = Integer.parseInt(scanner.readLine()), accumulate = 0;
				//System.out.println(ingredientsNeeded);
				for(int j = 0; j < ingredientsNeeded; j ++){
					String [] temp = scanner.readLine().split(" ");
					//System.out.println(temp[0] + " " + temp[1]);
					accumulate += (price.get(temp[0])*Integer.parseInt(temp[1]));
				}
				if(accumulate<=budget){
					flag.put(recipeName, accumulate);
					isTrue = true;
				}
				//System.out.println("Accumulated : " + accumulate);
			}
			if(isTrue){
				List<Map.Entry> a = new ArrayList<Map.Entry>(flag.entrySet());
				Collections.sort(a,
				         new Comparator() {
				             public int compare(Object o1, Object o2) {
				                 Map.Entry e1 = (Map.Entry) o1;
				                 Map.Entry e2 = (Map.Entry) o2;
				                 return ((Comparable) e1.getValue()).compareTo(e2.getValue());
				             }
				         });
				for(Map.Entry e : a){
					System.out.println(e.getKey());
				}
				flag.clear();
			}else {
				System.out.println("Too expensive!");
			}
			System.out.println();
		}
	}

}
