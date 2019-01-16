public class fcfs
{
	private int[] p;
	private int index;
	private int start;
	
	public fcfs(int index)
	{
		index--;
		p = new int[index];
		setindex(index);
	}
	
	public int WaitingTimeAvg()
	{
		int sum = getstart();
		for( int i = 0 ; i <= getindex()-2 ; i++ )
		{
			sum += sum + getp(i);
		}
		return sum / getindex();
	}
	
	public void setstart(int start)
	{
		this.start = start;
	}
	public int getstart()
	{
		return start;
	}
	public void setp(int index, int p)
	{
		this.p[index] = p;
	}
	public int getp(int index)
	{
		return p[index];
	}
	public void setindex(int index)
	{
		this.index = index;
	}
	public int getindex()
	{
		return index;
	}
}