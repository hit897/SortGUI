package SortGUI.Model;

public class GUIModel implements Comparable
{
	private double myNumber;
	private boolean frue;
	private String words;
	private GUIModel [][] myArray;
	
	public GUIModel(String words, double myNumber, boolean frue)
	{
		this.myNumber = myNumber;
		this.frue = frue;
		this.words = words;
		
	}

	@Override
	public String toString()
	{
		String info = "";

		info += "Hi, I am an info Object. Some words I like are " + words;
		info += ". I have a number.  It is " + myNumber;
		if (frue)
		{
			info += ". also, I am perfect.";
		}
		else
		{
			info += ". I'm kinda lame, honestly.";
		}

		return info;
	}
	
	/**
	 * Applies transitive property of math. If X is greater than Y, then Y is smaller than X.
	 * We're sorting the Objects.
	 */
	public int compareTo(Object comparedObject)
	{
		int compared = 0;
		
		if(this.myNumber < ((GUIModel) comparedObject).getMyNumber() || (!this.frue && ((GUIModel) comparedObject).isFrue()))
		{
			compared = -1;
		}
		else if(this.myNumber < ((GUIModel) comparedObject).getMyNumber() || (this.frue && !((GUIModel) comparedObject).isFrue()))
		{
			compared = 1;
		}
		
		return 0;
	}
	

	public double getMyNumber()
	{
		return myNumber;
	}

	public boolean isFrue()
	{
		return frue;
	}

	public String getWords()
	{
		return words;
	}

	public void setMyNumber(double myNumber)
	{
		this.myNumber = myNumber;
	}

	public void setFrue(boolean frue)
	{
		this.frue = frue;
	}

	public void setWords(String words)
	{
		this.words = words;
	}
}
