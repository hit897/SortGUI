package SortGUI.Model;

public class Sort
{
	
	
	private long startTime;
	private long endTime;
	private long sortTime;
	
	public long getSortTime()
	{
		return sortTime;
		
	}
	
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort += "Days: " + sortTime/(1000*60*60*24) + "/n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) % 24 + "/n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60 + "/n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 + "/n";
		timeToSort += "Milliseconds: " + sortTime % 1000 + "/n";
		
		return timeToSort;
	}
	
	public GUIModel [] selectionSort(GUIModel[] unsortedStuff)
	{
		GUIModel maximum;
		int maximumPosition;
		startTime= System.currentTimeMillis();
		for(int position = 0; position < unsortedStuff.length; position++)
		{
			maximumPosition = position;
			maximum = unsortedStuff[position];
			for(int next = position +1; next < unsortedStuff.length; next++)
			{
				if(unsortedStuff[next].compareTo(maximum) < 0)
				{
					maximum = unsortedStuff[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(unsortedStuff, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return unsortedStuff;
	}
		
	public double[] selectionSort(double [] toBeSorted)
	{
		double minimum;
		int maximumPosition;
		startTime= System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			maximumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(toBeSorted, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public String[] selectionSort(String [] toBeSorted)
	{
		String minimum;
		int maximumPosition;
		startTime= System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			maximumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next].compareTo(minimum) > 0)
				{
					minimum = toBeSorted[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(toBeSorted, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public int[] selectionSort(int [] toBeSorted)
	{
		int minimum;
		int minimumPosition;
		startTime= System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
			endTime = System.currentTimeMillis();
			
			sortTime = endTime - startTime;
			
			return toBeSorted;
		}
			
		
		return toBeSorted;
	}
	
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap(GUIModel [] array, int position, int change)
	{
		GUIModel temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap(double[] array, int position, int change)
	{
		double temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap(String[] array, int position, int change)
	{
		String temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
}
