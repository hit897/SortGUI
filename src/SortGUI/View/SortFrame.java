package SortGUI.View;

import javax.swing.JFrame;
import SortGUI.Controller.SortGUIController;

public class SortFrame extends JFrame
{
	private SortPanel basePanel;

	public SortFrame(SortGUIController baseController)
	{
		basePanel = new SortPanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setSize(400, 400);
		this.setResizable(false);
		setVisible(true);
	}

}