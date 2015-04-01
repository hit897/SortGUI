package SortGUI.Controller;

import SortGUI.View.SortFrame;
import SortGUI.Model.Sort;

import java.util.*;

/**
 * 
 * @author bhic8572
 * @Version 1.54 It runs but there's nothing in the frame or panel.
 */
public class SortGUIController
{
	/**
	 * This is the Frame.
	 */
	private SortFrame appFrame;
	/**
	 * This is a whole number int array.
	 */
	private Sort mySorter;
	private int[] wholeNumbers;
	/**
	 * This is a Double Array.
	 */
	private double[] realNumbers;
	/**
	 * This makes a String Array.
	 */
	private String[] wordage;

	private ArrayList<Integer> listOfArrays;

	public void start()
	{
		fillTheArrays();
		fillTheArrayList(listOfArrays);
		/**
		 * for(int spot : wholeNumbers) { System.out.print(spot + ", "); }
		 * System.out.println(); mySorter.selectionSort(wholeNumbers);
		 * System.out.print(mySorter.sortingTime(mySorter.getSortTime()));
		 * for(int spot : wholeNumbers) { System.out.print(spot + ", "); }
		 */
		sortInt(wholeNumbers);
		for (int spot : wholeNumbers)
		{
			System.out.print(spot + ", ");
		}
		System.out.println("");
		sortDouble(realNumbers);
		for (double spot : realNumbers)
		{
			System.out.print(spot + ", ");
		}
		System.out.println("");
		System.out.println(getMySorter().selectionSort(listOfArrays));
		System.out.println("Boop!");
		
	}

	public SortGUIController()
	{
		mySorter = new Sort();
		appFrame = new SortFrame(this);
		listOfArrays = new ArrayList<Integer>();
	}

	/**
	 * This calls the array fillers.
	 */
	private void fillTheArrays()
	{
		randomIntArray();
		randomDoubleArray();
	}

	private void fillTheArrayList(ArrayList<Integer> listOfArrays)
	{
		for (int spot = 0; spot < wholeNumbers.length; spot++)
		{
			listOfArrays.add(wholeNumbers[spot]);
			System.out.println(listOfArrays);
		}
	}
	

	
	public void sortTheArrayList(ArrayList<Integer> inputArr)
	{
		this.listOfArrays = inputArr;
		int length = inputArr.size();
		quickSortTheArrayList(0, length - 1, inputArr);
	}

	private void quickSortTheArrayList(int lowerIndex, int higherIndex, ArrayList<Integer> intArr)
	{

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		Integer pivot = intArr.get(lowerIndex + (higherIndex - lowerIndex) / 2);
		// Divide into two arrays.
		while (i <= j)
		{

			while (intArr.get(i) < pivot)
			{
				i++;
			}
			while (intArr.get(j) > pivot)
			{
				j--;
			}
			if (i <= j)
			{
				exchangeNumbersTheArrayList(i, j, intArr);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSortTheArrayList(lowerIndex, j, intArr);
		if (i < higherIndex)
			quickSortTheArrayList(i, higherIndex, intArr);
	}

	private void exchangeNumbersTheArrayList(int first, int second, ArrayList<Integer> listOfArrays)
	{
		int temp = listOfArrays.get(first);
		listOfArrays.set(first, listOfArrays.get(second));
		listOfArrays.set(second, temp);
	}
	/**
	 * This sets random Values to the Int Array.
	 */
	private void randomIntArray()
	{
		wholeNumbers = new int[20];
		for (int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int) (Math.random() * 23432);
		}
	}

	/**
	 * This sets random Values to the Double Array.
	 */
	private void randomDoubleArray()
	{
		realNumbers = new double[20];
		for (int spot = 0; spot < realNumbers.length; spot++)
		{
			realNumbers[spot] = Math.random() * 9000;
			if (spot % 7 > 3 && spot % 9 < 3)
			{
				realNumbers[spot] *= -1.000;
			}
		}
	}

	public void sortInt(int[] inputArr)
	{

		if (inputArr == null || inputArr.length == 0)
		{
			return;
		}
		this.wholeNumbers = inputArr;
		int length = inputArr.length;
		quickSortInt(0, length - 1, inputArr);
	}

	private void quickSortInt(int lowerIndex, int higherIndex, int[] intArr)
	{

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = intArr[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays.
		while (i <= j)
		{
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (intArr[i] < pivot)
			{
				i++;
			}
			while (intArr[j] > pivot)
			{
				j--;
			}
			if (i <= j)
			{
				exchangeNumbersInt(i, j, intArr);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSortInt(lowerIndex, j, intArr);
		if (i < higherIndex)
			quickSortInt(i		, higherIndex, intArr);
	}

	private void exchangeNumbersInt(int i, int j, int[] intArr)
	{
		int temp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = temp;
	}

	public void sortDouble(double[] realNumbers)
	{

		if (realNumbers == null || realNumbers.length == 0)
		{
			return;
		}
		this.realNumbers = realNumbers;
		int length = realNumbers.length;
		quickSortDouble(0, length - 1, realNumbers);
	}

	private void quickSortDouble(int lowerIndex, int higherIndex, double[] realNumbers)
	{

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		Double pivot = realNumbers[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays.
		while (i <= j)
		{
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (realNumbers[i] < pivot)
			{
				i++;
			}
			while (realNumbers[j] > pivot)
			{
				j--;
			}
			if (i <= j)
			{
				exchangeNumbersDouble(i, j, realNumbers);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSortDouble(lowerIndex, j, realNumbers);
		if (i < higherIndex)
			quickSortDouble(i, higherIndex, realNumbers);
	}

	private void exchangeNumbersDouble(int i, int j, double[] realNumbers)
	{
		Double temp = realNumbers[i];
		realNumbers[i] = realNumbers[j];
		realNumbers[j] = temp;
	}

	public void sortString(int[] inputArr)
	{

		if (inputArr == null || inputArr.length == 0)
		{
			return;
		}
		this.wholeNumbers = inputArr;
		int length = inputArr.length;
		quickSortInt(0, length - 1, inputArr);
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

	public Sort getMySorter()
	{
		return mySorter;
	}

	public ArrayList<Integer> getListOfArrays()
	{
		return listOfArrays;
	}

	public void setListOfArrays(ArrayList<Integer> listOfArrays)
	{
		this.listOfArrays = listOfArrays;
	}

}
