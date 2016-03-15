//WARNING: THIS WILL ONLY WORK ASSUMING THE VALUE YOU'RE LOOKING FOR(TARGET) IS IN THE GIVEN ARRAY.

public class main 
{
	
	public static int BST(int target, int [] values)
	{
		int lo = 0, hi = values.length, mid = (lo + hi) / 2;
		int midItem = values[mid];
		
		do
		{
			if(target > midItem)
				lo = mid;
			else if(target < midItem)
				hi = mid;

			mid = (hi + lo)/2;
			midItem = values[mid];
			
			if(midItem == target) return mid;
			
		}while (midItem !=  target);
		
		return -1;
	}
	
    public static void main(String[] args) 
    {
    	int values [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    	System.out.println(BST(1, values));
    	System.out.println(BST(2, values));
    	System.out.println(BST(3, values));
    	System.out.println(BST(4, values));
    	System.out.println(BST(5, values));
    	System.out.println(BST(6, values));
    	System.out.println(BST(7, values));
    	System.out.println(BST(8, values));
    	System.out.println(BST(9, values));
    	System.out.println(BST(10, values));
    	System.out.println(BST(11, values));
    	System.out.println(BST(12, values));
    	System.out.println(BST(13, values));
    	System.out.println(BST(14, values));
    	System.out.println(BST(15, values));
    	System.out.println(BST(16, values));
    	System.out.println(BST(17, values));
    	System.out.println(BST(18, values));
    	System.out.println(BST(19, values));
    	System.out.println(BST(20, values));
    }

}