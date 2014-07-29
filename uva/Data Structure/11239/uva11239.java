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

public class uva11239 {
	public static void main(String[] args) throws IOException {
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer builder = new StringBuffer("");
		String input, title = "";
		HashMap<String, String> map = new HashMap<>();
		TreeMap<String, Integer> values = new TreeMap<>();
		ArrayList<String> banList = new ArrayList<>();
		while(!(input = scanner.readLine()).equals("0")){
			if(!input.isEmpty())
				if(input.equals("1")){
					for(String keys : map.keySet()){
						values.put(map.get(keys), (values.get(map.get(keys))+1));
						//System.out.println("Key : " + keys + " Value : " + map.get(keys));
					}
					List<Map.Entry> a = new ArrayList<Map.Entry>(values.entrySet());
					Collections.sort(a,
					         new Comparator() {
					             public int compare(Object o1, Object o2) {
					                 Map.Entry e1 = (Map.Entry) o1;
					                 Map.Entry e2 = (Map.Entry) o2;
					                 return ((Comparable) e2.getValue()).compareTo(e1.getValue());
					             }
					         });
					for(Map.Entry e : a){
						System.out.println(e.getKey() + " " + e.getValue());
					}
					title = "";
					map.clear();
					values.clear();
					banList.clear();
				}else if(Character.isUpperCase(input.charAt(0))){
					title = input;
					values.put(title, 0);
					//System.out.println("New Group " + title);
				}else {
					if((map.get(input)==null)&&(!banList.contains(input))){
						map.put(input, title);
						//System.out.println("Added " + input);
					}else if (map.get(input)!=null && (!map.get(input).equals(title))) {
							banList.add(input);
							//System.out.println("Banned and removed from " + input + " " + map.get(input));
							map.remove(input);
					} 
				}
		}
	}

}
