import java.io.*;
import java.util.*;

class QU
{
	private int n, componentCount;
	private int [] data;
	public QU(int _n)
	{
		componentCount = _n;
		n = _n;
		data = new int[n];
		for(int i = 0; i < n; i ++)
		{
			data[i] = i;
		}
	}
	
	public void union(int p, int q)
	{
		if(!inBound(p) || !inBound(q)) throw new IndexOutOfBoundsException();
		int rootP = root(p);
		int rootQ = root(q);
		if(rootP == rootQ) return;
		data[rootP] = rootQ;
		componentCount --;
	}
	
	public int find(int p)
	{
		if(!inBound(p)) throw new IndexOutOfBoundsException();
		return root(p);
	}
	
	public boolean connected(int p, int q)
	{
		if(!inBound(p) || !inBound(q)) throw new IndexOutOfBoundsException();
		return root(p) == root(q);
	}
	
	public int getSize()
	{
		return n;
	}
	
	public int getComponentCount()
	{
		return componentCount;
	}
	
	private int root(int p)
	{
		if(!inBound(p)) throw new IndexOutOfBoundsException();
		int idx = p;
		while(idx != data[idx])
		{
			idx = data[idx];
		}
		return idx;
	}
	
	private boolean inBound(int p)
	{
		return p>=0 && p<n;
	}
	
	public void printArray()
	{
		for(int i = 0; i < n; i ++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
}

public class QuickUnion 
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
		QU quickUnion = new QU(n);
		for(int i = 0; i < n; i ++)
		{
			quickUnion.union(input.nextInt(), input.nextInt());
		}
		quickUnion.printArray();
		System.out.println("Execution Time : " + (System.currentTimeMillis() - startTime));
	}

}
