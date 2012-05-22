package service;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ComponentCreator {
	
	private int comboBoxWidth = 200;
	private int comboBoxHeight = 25;
	private int eliminateWidth = 150;
	private int eliminateHeight = 150;
	private int eliminateCardWidth = 150;
	private int eliminateCardHeight = 25;
	private int eliminateTripleWidth = 150;
	private int eliminateTripleHeight = 25;
	private int regularButtonWidth = 100;
	private int regularButtonHeight = 25;
	
	private String [] rooms = {"kitchen", "study", "conservatory", "hall", "dining room", "billiard room", "lounge", "library", "ballroom"};
	private String [] suspects = {"mustard", "scarlet", "plum", "green", "white", "peacock"};
	private String [] weapons = {"candlestick", "wrench", "rope", "revolver", "knife", "leadpipe"};
	
	private ComponentManipulator componentManipulator = new ComponentManipulator();
	
	public ComponentCreator(){
	}// end ComponentCreator constructor
	
	public JButton getEliminateButton( String buttonTitle ){
		JButton button = new JButton( buttonTitle );
		button.setPreferredSize(new Dimension( eliminateWidth, eliminateHeight ) );
		
		return button;
	}// end getEliminateButton
	
	public JButton getEliminateCardButton( String buttonTitle ){
		JButton button = new JButton( buttonTitle );
		button.setPreferredSize(new Dimension( eliminateCardWidth, eliminateCardHeight ) );
		
		return button;
	}// end getEliminateCardButton
	
	public JButton getRegularButton( String buttonTitle ){
		JButton button = new JButton( buttonTitle );
		button.setPreferredSize( new Dimension( regularButtonWidth, regularButtonHeight ) );
		
		return button;
	}// end getRegularButton
	
	public JButton[] getButtons( String buttonType ){
		String [] buttonTitles;
		
		if( buttonType.equals( "rooms" ) )
			buttonTitles = rooms;
		else if( buttonType.equals( "suspects" ) )
			buttonTitles = suspects;
		else if( buttonType.equals( "weapons" ) )
			buttonTitles = weapons;
		else{
			JOptionPane.showMessageDialog(null, "Invalid Card Type!" );
			buttonTitles = new String[ 1 ];
		}// end else
			
		JButton [] buttons = new JButton[ buttonTitles.length ];
		
		for( int i = 0; i < buttonTitles.length; i++ ){
			buttons[ i ] = new JButton( componentManipulator.uppercaseFirstLetters( buttonTitles[ i ] ) );
			buttons[ i ].setPreferredSize( new Dimension( eliminateCardWidth, eliminateCardHeight ) );
		}// end for
		
		return buttons;
	}// end getButtons
	
	public JRadioButton[] getRadioButtons( String radioButtonType ){
		String [] buttonTitles;
		
		if( radioButtonType.equals( "rooms" ) )
			buttonTitles = rooms;
		else if( radioButtonType.equals( "suspects" ) )
			buttonTitles = suspects;
		else if( radioButtonType.equals( "weapons" ) )
			buttonTitles = weapons;
		else{
			JOptionPane.showMessageDialog(null, "Invalid Card Type!" );
			buttonTitles = new String[ 1 ];
		}// end else
			
		JRadioButton [] radiobuttons = new JRadioButton[ buttonTitles.length ];
		
		for( int i = 0; i < radiobuttons.length; i++ ){
			radiobuttons[ i ] = new JRadioButton( componentManipulator.uppercaseFirstLetters( buttonTitles[ i ] ) );
			radiobuttons[ i ].setPreferredSize( new Dimension( eliminateTripleWidth, eliminateTripleHeight ) );
		}// end for
		
		return radiobuttons;
	}// end getRadioButtons
	
	public JComboBox getComboBox(){
		JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize( new Dimension( comboBoxWidth, comboBoxHeight ) );
		
		return comboBox;
	}// end getComboBox
	
	public JPanel getFlowPanel(){
		JPanel panel = new JPanel();
		FlowLayout layout = new FlowLayout();
		panel.setLayout( layout );
		
		return panel;
	}// end getFlowPanel
	
	public JPanel getTitledFlowPanel( String panelTitle ){
		JPanel panel = new JPanel();
		FlowLayout layout = new FlowLayout();
		panel.setLayout( layout );
		panel.setBorder(BorderFactory.createTitledBorder( panelTitle ) );
		
		return panel;
	}// end getTitleFlowPanel
	
	public JPanel getBorderPanel(){
		JPanel panel = new JPanel();
		BorderLayout layout = new BorderLayout();
		panel.setLayout(layout);
		
		return panel;
	}// end getBorderPanel
}// end ComponentCreator class