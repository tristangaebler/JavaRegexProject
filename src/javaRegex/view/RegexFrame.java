package javaRegex.view;

import javaRegex.controller.*;
import javax.swing.*;
import java.awt.*;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel basePanel;
	
	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController;
		basePanel = new RegexPanel(baseController);
		setUpFrame();
	}
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(800, 800);
		this.setBackground(Color.CYAN);
		this.setTitle("Regex Window");
		this.setResizable(true);
		this.setVisible(true);
		
	}
	
	public RegexController getBaseController()
	{
		return baseController;
	}
}