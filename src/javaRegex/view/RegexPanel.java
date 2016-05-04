package javaRegex.view;

import javaRegex.controller.*;
import javax.swing.*;
import java.awt.*;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextField regexTextField;
	private JTextArea regexTextArea;
	
	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		regexTextArea = new JTextArea("");
		regexTextField = new JTextField("Type here:");
		
		//====Calling the methods====
		setUpPane();
		setUpPanel();
		setUpLayout();
		setUpListeners();
	}
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(regexTextArea);
		this.add(regexTextField);
	}
	
	private void setUpPane()
	{
		
	}
	
	private void setUpLayout()
	{
		
	}
	
	private void setUpListeners()
	{
		
	}
	
	
}
