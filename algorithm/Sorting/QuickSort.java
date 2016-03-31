import java.util.Random;

public class QuickSort 
{

	private static final int CUTOFF = 10;
	
	public static <T> void knuthShuffle(T[] items)
	{
		Random ran = new Random();
		for(int i = 0; i < items.length; i ++)
		{
			int idx = ran.nextInt(i+1);
			swap(items, i, idx);
		}
	}
	
    private static <T> void swap(T[] items, int i, int j)
    {
    	if(i >= 0 && i < items.length && j >= 0 && j < items.length)
    	{
    		T temp = items[i];
    		items[i] = items[j];
    		items[j] = temp;
	    	return;
    	}
    	throw new IndexOutOfBoundsException();
    }
	
    public static void quickSort(Comparable[] values)
    {
    	knuthShuffle(values);
    	split(values, 0, values.length-1);
    }
    
    private static void split(Comparable[] values, int lo, int hi)
    {
    	if(hi <= lo + CUTOFF)
    	{
    		insertionSort(values, lo, hi);
    		return;
    	}
    	int m = medianOf3(values, lo, ((lo+hi)/2) ,hi);
    	swap(values, lo, m);
    	int j = partition(values, lo, hi);
    	split(values, lo, j-1);
    	split(values, j+1, hi);
    }
    
    private static int partition(Comparable[] values, int lo, int hi)
    {
    	int pivot = lo;
    	int i = lo;
    	int j = hi+1;
    	
    	while(true)
    	{
    		while(true)
    		{
    			if(i == hi || greater(values[++i], values[pivot]) || values[i] == values[pivot]) break;
    		}
    		while(true)
    		{
    			if(j == lo || less(values[--j], values[pivot]) || values[j] == values[pivot]) break;
    		}
    		if(i >= j) break;
    		swap(values, i, j);
    	}
    	swap(values, lo, j);
    	return j;
    }
    
    public static int medianOf3(Comparable[] a, int i, int j, int k)
    {
        return (less(a[i], a[j]) ? (less(a[j], a[k]) ? j : less(a[i], a[k]) ? k : i) : (less(a[k], a[j]) ? j : less(a[k], a[i]) ? k : i));
    }
    
    public static boolean less(Comparable l, Comparable r)
    {
    	return l.compareTo(r) < 0;
    }
    
    public static boolean greater(Comparable l, Comparable r)
    {
    	return l.compareTo(r) > 0;
    }
    
    public static void insertionSort(Comparable[] values, int initialIdx, int endIdx) 
    {
    	for(int i = initialIdx; i <= endIdx; i ++)
    	{
    		//System.out.println("i : " + i);
    		for(int j = i; j >= 1 && j <= endIdx; j --)
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
    
	public static void main(String[] args) 
	{
		//Integer [] values = {-10, -9, -8, -7, 0, 1, 2, 3, 4, 5, 6, 7, 8, 10};
		Character [] values = {'K', 'R', 'A', 'T', 'E', 'L', 'E', 'P', 'U', 'I', 'M', 'Q', 'C', 'X', 'O', 'S'};
		quickSort(values);
		System.out.println("------------after sorted array------------");
		for(int i = 0; i < values.length; i ++)
			System.out.println(values[i]);
		
	}

}
