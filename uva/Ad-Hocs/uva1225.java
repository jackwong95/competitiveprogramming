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
import java.util.Arrays;
import java.util.Scanner;
public class uva1225 {
	static int ans0 = 0;
	static int ans1 = 0;
	static int ans2 = 0;
	static int ans3 = 0;
	static int ans4 = 0;
	static int ans5 = 0;
	static int ans6 = 0;
	static int ans7 = 0;
	static int ans8 = 0;
	static int ans9 = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//boolean [] values = new boolean [n];
		//Arrays.fill(values, false);
		for(int i = 0; i < n; i ++){
			int N = scanner.nextInt();
			getString(N, "");
			System.out.println(ans0 + " " + ans1 + " " + ans2 + " " + ans3 + " " + ans4 + " " + ans5 + " " + ans6 + " " + ans7 + " " + ans8 + " " + ans9);
			ans0 = 0;
			ans1 = 0;
			ans2 = 0;
			ans3 = 0;
			ans4 = 0;
			ans5 = 0;
			ans6 = 0;
			ans7 = 0;
			ans8 = 0;
			ans9 = 0;
		}
	}
	private static String getString (int N, String toAppend){
		//System.out.println(N + " " + toAppend);
		toAppend = (N+"") + toAppend;
		ans0 += ((N+"").replaceAll("[^0]", "")).length();
		ans1 += ((N+"").replaceAll("[^1]", "")).length();
		ans2 += ((N+"").replaceAll("[^2]", "")).length();
		ans3 += ((N+"").replaceAll("[^3]", "")).length();
		ans4 += ((N+"").replaceAll("[^4]", "")).length();
		ans5 += ((N+"").replaceAll("[^5]", "")).length();
		ans6 += ((N+"").replaceAll("[^6]", "")).length();
		ans7 += ((N+"").replaceAll("[^7]", "")).length();
		ans8 += ((N+"").replaceAll("[^8]", "")).length();
		ans9 += ((N+"").replaceAll("[^9]", "")).length();
		N--;
		if(N==0)return toAppend;
		else return getString(N, toAppend);
	}
}
