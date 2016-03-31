import java.util.Random;

public class KnuthShuffle {

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
	
	public static void main(String[] args) 
	{
		Integer [] values = {-10, -9, -8, -7, 0, 1, 2, 3, 4, 5, 6, 7, 8, 10};
		knuthShuffle(values);
		System.out.println("------------");
		for(int i = 0; i < values.length; i ++)
			System.out.println(values[i]);
	}

}
