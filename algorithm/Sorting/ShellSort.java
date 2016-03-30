
public class ShellSort 
{
	
    public static void insertionSort(Comparable[] values, int initialIdx , int h) 
    {
    	for(int i = initialIdx; i < values.length; i += h)
    	{
    		for(int j = i; j >= h && j < values.length; j -= h)
    		{
    			if(greater(values[j], values[j-h]))
    			{
    				break;
    			}
    			swap(values, j, j-h);
    		}
    	}
    }

    public static void hSort(Comparable[] values, int h)
    {
    	for(int i = 0; i < h; i ++)
    	{
    		insertionSort(values, i, h);
    	}
    }

    public static void shellSort(Comparable[] values)
    {
        int h = 1;
        while (h < values.length/3) h = 3*h + 1;
        while(h >= 1)
        {
        	hSort(values, h);
        	h = h/3;
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
		String string = "MOLEEXASPRT";//"SHELLSORTEXAMPLE";
		Character [] values = new Character[string.length()];//{'L', 'E', 'E', 'A', 'M', 'H', 'L', 'E', 'P', 'S', 'O', 'L', 'T', 'S', 'X', 'R'};
		for(int i = 0; i < string.length(); i ++)
			values[i] = string.charAt(i);
		shellSort(values);
		System.out.println("-----------------------");
		for(int i = 0; i < values.length; i ++)
			System.out.println(i + " " + values[i]);
	}

}
