package SortGUI.Controller;

import SortGUI.View.SortFrame;
import SortGUI.Model.Sort;
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
		/**
		for(int spot : wholeNumbers)
		{
			System.out.print(spot + ", ");
		}
		System.out.println();
		mySorter.selectionSort(wholeNumbers);
		System.out.print(mySorter.sortingTime(mySorter.getSortTime()));
		for(int spot : wholeNumbers)
		{
			System.out.print(spot + ", ");
		}
		*/
		sortInt(wholeNumbers);
		for(int spot : wholeNumbers)
		{
			System.out.print(spot + ", ");
		}
		
	}
	
	public SortGUIController()
	{
		mySorter = new Sort();
		appFrame = new SortFrame(this);
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
	
	public void sortInt(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.wholeNumbers = inputArr;
        int length = inputArr.length;
        quickSortInt(0, length - 1, inputArr);
    }
 
    private void quickSortInt(int lowerIndex, int higherIndex, int [] intArr) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = intArr[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays.
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (intArr[i] < pivot) {
                i++;
            }
            while (intArr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbersInt(i, j, intArr);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSortInt(lowerIndex, j, intArr);
        if (i < higherIndex)
            quickSortInt(i, higherIndex, intArr);
    }
 
    private void exchangeNumbersInt(int i, int j, int [] intArr) {
        int temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }
     
public void sortDouble(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.wholeNumbers = inputArr;
        int length = inputArr.length;
        quickSortInt(0, length - 1, inputArr);
    }
 
    private void quickSortDouble(int lowerIndex, int higherIndex, Double [] DoubleArr) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        Double pivot = DoubleArr[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays.
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (DoubleArr[i] < pivot) {
                i++;
            }
            while (DoubleArr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbersDouble(i, j, DoubleArr);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSortDouble(lowerIndex, j, DoubleArr);
        if (i < higherIndex)
            quickSortDouble(i, higherIndex, DoubleArr);
    }
 
    private void exchangeNumbersDouble(int i, int j, Double [] DoubleArr) {
        Double temp = DoubleArr[i];
        DoubleArr[i] = DoubleArr[j];
        DoubleArr[j] = temp;
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
}
