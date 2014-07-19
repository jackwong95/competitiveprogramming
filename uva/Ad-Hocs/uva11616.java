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
public class uva11616 {
	static String[] letters = { "I", "II", "III", "IV", "V", "IX", "X", "XL", "L",
            "XC", "C", "CD", "D", "CM", "M" };
    static int[] values = { 1, 2, 3, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900,
            1000 };
    static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer s = new StringBuffer("");
        for (int i = 0; i < letters.length; i++)
            map.put(letters[i], values[i]);
		while(true){
			String temp = scanner.readLine();
			if(temp==null)break;
			if(temp.replaceAll("[0-9]", "").isEmpty()){
				s.append(toString(Integer.parseInt(temp))+"\n");
			}else {
			s.append(toNumber(temp)+"\n");
			}
		}
		System.out.print(s);
	}
	private static String toString (int temp){
		String s = "";
			for(int i = letters.length - 1; i >= 0; i --){
				while(temp >= values[i]){
					s+=(letters[i]);
					temp -= values[i];
				}
			}
			return s;
	}
	private static int toNumber (String temp){
		int total = 0;
		for (int i = 0; i < temp.length(); i++) {
			if (i + 1 < temp.length()) {
				if (map.containsKey(temp.substring(i, i + 2))) {
					total += map.get(temp.substring(i, i + 2));
                    i++;
                } else
                	total += map.get(temp.substring(i, i + 1));
			}else {
				total += map.get(temp.substring(i, i+1));
			}
		}
		return total;
	}
	/*private static void toNumber (String temp){
			int total = 0;
			while(temp.length()!=0){
				if(temp.startsWith("CM")){
					total += 900;
					temp = temp.substring(2);
				}
				if(temp.startsWith("CD")){
					total += 400;
					temp = temp.substring(2);
				}
				if(temp.startsWith("M")){
					total += 1000;
					temp = temp.substring(1);
				}
				if(temp.startsWith("XC")){
					total += 90;
					temp = temp.substring(2);
				}
				if(temp.startsWith("XL")){
					total += 40;
					temp = temp.substring(2);
				}
				if(temp.startsWith("X")){
					total += 10;
					temp = temp.substring(1);
				}	
				if(temp.startsWith("IX")){
					total += 9;
					temp = temp.substring(2);
				}
				if(temp.startsWith("IV")){
					total += 4;
					temp = temp.substring(2);
				}
				if(temp.startsWith("D")){
					total += 500;
					temp = temp.substring(1);
				}
				if(temp.startsWith("L")){
					total += 50;
					temp = temp.substring(1);
				}
				if(temp.startsWith("V")){
					total += 5;
					temp = temp.substring(1);
				}				
				if(temp.startsWith("I")){
					total += 1;
					temp = temp.substring(1);
				}
			}
			System.out.println(total);
	}*/
}
