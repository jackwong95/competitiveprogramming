import java.io.*;
import java.util.*;

class QF
{
	private int n, componentCount;
	private int [] data;
	public QF(int _n)
	{
		componentCount = _n;
		n = _n;
		data = new int[n];
		for(int i = 0; i < n; i ++)
		{
			data[i] = (i+1);
		}
	}
	
	public void union(int p, int q)
	{
		if(!inBound(p) || !inBound(q)) throw new IndexOutOfBoundsException();
		for(int i = 0; i < n; i ++)
		{
			if(data[i]==data[q]) data[i] = data[p];
		}
		componentCount --;
	}
	
	public int find(int p)
	{
		if(!inBound(p)) throw new IndexOutOfBoundsException();
		return data[p];
	}
	
	public boolean connected(int p, int q)
	{
		if(!inBound(p) || !inBound(q)) throw new IndexOutOfBoundsException();
		return data[p] == data[q];
	}
	
	public int getSize()
	{
		return n;
	}
	
	public int getComponentCount()
	{
		return componentCount;
	}
	
	private boolean inBound(int p)
	{
		return p>=0 && p<n;
	}
	
}

public class QuickFind 
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		long startTime = System.currentTimeMillis();
		Scanner input = null;
		try
		{
			input = new Scanner(new File("input.txt"));
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		int n = input.nextInt();
		QF quickFind = new QF(n);
		for(int i = 0; i < n; i ++)
		{
			quickFind.union(input.nextInt(), input.nextInt());
		}
		System.out.println("Execution Time : " + (System.currentTimeMillis() - startTime));
	}

}
