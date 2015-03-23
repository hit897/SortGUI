package SortGUI.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		displayArea = new JTextArea(10, 30);
		textPane = new JScrollPane(displayArea);

		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupLayout()
	{

	}

	private void setupPanel()
	{

	}

	private void setupListeners()
	{
				sortButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						String rawArray = "";
						for(int number : baseController.getWholeNumbers())
						{
							rawArray += number + " ";
						}
						baseController.getMySorter().selectionSort(baseController.getWholeNumbers());
						rawArray += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
						for(int number : baseController.getWholeNumbers())
						{
							rawArray += number + " ";
						}
						displayArea.setText(rawArray);
					}
				});
	}

	private void setupPane()
	{

	}

}
