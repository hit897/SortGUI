package SortGUI.Controller;

import SortGUI.View.SortFrame;

public class SortGUIController
{

	private SortFrame appFrame;
	private int [] wholeNumbers;
	private double [] realNumbers;
	private String [] wordage;
	
	public void start()
	{
		fillTheArrays();
	}
	
	private void fillTheArrays()
	{
		randomIntArray();
		randomDoubleArray();
	}
	
	private void randomIntArray()
	{
		wholeNumbers = new int [20];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int) (Math.random() * 23432);
		}
	}
	
	private void randomDoubleArray()
	{
		realNumbers = new double [20];
		for(int spot = 0; spot < realNumbers.length; spot++)
		{
			realNumbers[spot] = Math.random() * 9000;
			if(spot % 7 >3 && spot % 9 < 3)
			{
				realNumbers[spot] *= -1.000;
			}
		}
	}
		
	public SortFrame getAppFrame()
	{
		return appFrame;
	}

	public int[] getWholeNumbers()
	{
		return wholeNumbers;
	}

	public double[] getRealNumbers()
	{
		return realNumbers;
	}

	public String[] getWordage()
	{
		return wordage;
	}

	public void setAppFrame(SortFrame appFrame)
	{
		this.appFrame = appFrame;
	}

	public void setWholeNumbers(int[] wholeNumbers)
	{
		this.wholeNumbers = wholeNumbers;
	}

	public void setRealNumbers(double[] realNumbers)
	{
		this.realNumbers = realNumbers;
	}

	public void setWordage(String[] wordage)
	{
		this.wordage = wordage;
	}

}
