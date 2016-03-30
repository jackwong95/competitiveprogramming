
public class main 
{
	
	public static int BS(int target, int [] values)
	{
		int lo = 0, hi = values.length, mid = (lo + hi) / 2;
		int midItem = values[mid];
		
		do
		{
			if(target > midItem)
				lo = mid;
			else if(target < midItem)
				hi = mid;
			else 
				return mid;
			
			mid = (hi + lo)/2;
			midItem = values[mid];
			
		}while (midItem !=  target);
		
		return -1;
	}
	
    public static void main(String[] args) 
    {
    	int values [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    	System.out.println(BS(1, values));
    }

}