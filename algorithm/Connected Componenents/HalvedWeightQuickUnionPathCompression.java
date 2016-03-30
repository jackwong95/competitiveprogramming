import java.io.*;
import java.util.*;

class WQU
{
	private int n, componentCount;
	private int [] data;
	private int [] size;
	
	public WQU(int _n)
	{
		componentCount = _n;
		n = _n;
		data = new int[n];
		size = new int[n];
		for(int i = 0; i < n; i ++)
		{
			size[i] = 1;
			data[i] = i;
		}
	}
	
	public void union(int p, int q)
	{
		if(!inBound(p) || !inBound(q)) throw new IndexOutOfBoundsException();
		int rootP = root(p);
		int rootQ = root(q);
		if(rootP == rootQ) return;
		if(size[rootQ] > size[rootP])
		{
			data[rootP] = rootQ;
			size[rootQ] += size[rootP];
		}
		else
		{
			data[rootQ] = rootP;
			size[rootP] += size[rootQ];
		}
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
			data[idx] = data[data[idx]];
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

public class WeightedQuickUnion 
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
		WQU weightedQuickUnion = new WQU(n);
		for(int i = 0; i < n; i ++)
		{
			weightedQuickUnion.union(input.nextInt(), input.nextInt());
		}
		weightedQuickUnion.printArray();
		System.out.println("Execution Time : " + (System.currentTimeMillis() - startTime));
	}

}
