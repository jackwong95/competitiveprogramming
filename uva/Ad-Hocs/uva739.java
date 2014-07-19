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
import java.util.HashMap;
import java.util.Scanner;
public class uva739 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		HashMap<Character, Integer> value = new HashMap<>();
		value.put('B', 1);
		value.put('P', 1);
		value.put('F', 1);
		value.put('V', 1);
		
		value.put('C', 2);
		value.put('S', 2);
		value.put('K', 2);
		value.put('G', 2);
		value.put('J', 2);
		value.put('Q', 2);
		value.put('X', 2);
		value.put('Z', 2);
		
		value.put('D', 3);
		value.put('T', 3);
		
		value.put('L', 4);
		
		value.put('M', 5);
		value.put('N', 5);
		
		value.put('R', 6);
		//System.out.println("                    ".length());
		//
		boolean first = false;
		while(scanner.hasNext()){
			if(!first){
				System.out.println("         NAME                     SOUNDEX CODE");
				first = true;
			}
			String temp = scanner.nextLine();
			String FirstCharacter = (temp.charAt(0)+"");
			int count = 0; 
			for(int i = 1; i < temp.length(); i ++){
				if(!(value.get(temp.charAt(i-1))==value.get(temp.charAt(i))) && !(value.get(temp.charAt(i))==null)){
					if(count==3)break;
					count ++;
					FirstCharacter = FirstCharacter + value.get(temp.charAt(i));
				}
			}
			
			if(FirstCharacter.length()==1) FirstCharacter = (FirstCharacter + "000");
			else if(FirstCharacter.length()==2) FirstCharacter = (FirstCharacter + "00");
			else if(FirstCharacter.length()==3) FirstCharacter = (FirstCharacter + "0");
			else FirstCharacter = (FirstCharacter.substring(0, 4));
			String emptySpaces = new String(new char[25-temp.length()]).replace("\0", " ");
			System.out.println("         "+temp+emptySpaces+FirstCharacter);
		}
		System.out.println("                   END OF OUTPUT");
	}

}
