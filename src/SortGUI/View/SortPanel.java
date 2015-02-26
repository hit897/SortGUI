package SortGUI.View;

import javax.swing.*;

import SortGUI.Controller.SortGUIController;

public class SortPanel
{
	private SortGUIController baseController;
	private JScrollPane textPane;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField inputField;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	
	public SortPanel(SortGUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		sortButton = new JButton("sort");
		searchButton = new JButton("Search");
		inputField = new JTextField(25);
		displayArea = new JTextArea(10,30);
		textPane = new JScrollPane(displayArea);
		
		setupPane();
		
	}

	private void setupPane()
	{
		
	}
	
}
