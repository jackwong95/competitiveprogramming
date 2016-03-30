
public class InsertionSort 
{
	
    public static void insertionSort(Comparable[] values) 
    {
    	for(int i = 1; i < values.length; i ++)
    	{
    		//System.out.println("i : " + i);
    		for(int j = i; j >= 1 && j < values.length; j --)
    		{
    			if(greater(values[j], values[j-1]))
    			{
    				break;
    			}
    			swap(values, j, j-1);
    			//System.out.println("j : " + j);
    		}
    	}
    }
	
    private static void swap(Comparable[] values, int i, int j)
    {
    	if(i >= 0 && i < values.length && j >= 0 && j < values.length)
    	{
    		Comparable temp = values[i];
	    	values[i] = values[j];
	    	values[j] = temp;
	    	return;
    	}
    	throw new IndexOutOfBoundsException();
    }
    
    private static boolean greater(Comparable v, Comparable w) 
    {
        return v.compareTo(w) > 0;
    }
	
	public static void main(String[] args) 
	{
		Integer [] values = {10, 9, 3, 5, 4, 6, 8, -34, 4, 74, 59, -54, 543, -34, 29, 594, 38, 1, 4, 34};
		insertionSort(values);
		for(int i = 0; i < values.length; i ++)
			System.out.println(values[i]);
	}

}
