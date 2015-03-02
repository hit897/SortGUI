package SortGUI.Controller;

import SortGUI.View.SortFrame;

public class SortGUIController
{
	/**
	 * This is the Frame.
	 */
	private SortFrame appFrame;
	/**
	 * This is a whole number int array.
	 */
	private int [] wholeNumbers;
	/**
	 * This is a Double Array.
	 */
	private double [] realNumbers;
	/**
	 * This makes a String Array.
	 */
	private String [] wordage;
	
	public void start()
	{
		fillTheArrays();
	}
	
	/**
	 * This calls the array fillers.
	 */
	private void fillTheArrays()
	{
		randomIntArray();
		randomDoubleArray();
	}
	
	/**
	 * This sets random Values to the Int Array. 
	 */
	private void randomIntArray()
	{
		wholeNumbers = new int [20];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int) (Math.random() * 23432);
		}
	}
	
	/**
	 * This sets random Values to the Double Array.
	 */
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
	
	
	// GETTERS AND SETTERS
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
