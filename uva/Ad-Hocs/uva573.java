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
import java.util.Scanner;
public class uva573 {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	while(true){
        	int H = scan.nextInt(), U = scan.nextInt()
                	,D = scan.nextInt(), F = scan.nextInt();
        	if(H==0&&U==0&&D==0&&F==0)break;
        	F = F * U;
        	U = U * 100;
        	H = H * 100;
        	D = D * 100;
        	//System.out.println(H + " " + U + " " + D + " " + F);
        	int initialHeight = 0, distanceClimbed = 0,
                	afterClimbed = 0, afterSliding = 0,
                    	day = 1;
        	while(true){
        		//System.out.print(day + " ");
            	initialHeight = afterSliding;
        		//System.out.print(initialHeight + " ");
        		////snail climb when sun is up
        		distanceClimbed = distanceClimbed + U;
        		//System.out.print(distanceClimbed + " ");
        		afterClimbed = initialHeight + distanceClimbed;
        		//System.out.print(afterClimbed + " ");
            	////snail slide at night
        		afterSliding = afterClimbed - D;
        		//System.out.print(afterSliding + " ");
            	////snail lost fatigue the day after night
        		if((U-F) >= 0) U = U - F;
        		if(afterClimbed>H || afterSliding>H){System.out.println("success on day "+day); break;}
        		if(afterSliding < 0){System.out.println("failure on day "+day); break;}
        		day ++;
        		//reset some values
        		distanceClimbed = 0; 
        		afterClimbed = 0;
        		
        	}
        	
    	}
	}
}
