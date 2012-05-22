package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import popup.EliminateCardPopUp;
import popup.EliminateTriplePopUp;
import service.ComponentCreator;
import service.ComponentManipulator;

public class ClueSolverGUI extends JFrame {

	private ComponentCreator componentCreator;
	private ComponentManipulator componentManipulator;

	private BorderLayout clueSolverLayout;
	private FlowLayout buttonLayout;
	
	private JButton eliminateCardButton;
	private JButton eliminateTripleButton;
	
	private JLabel remainingLabel;
	
	private JComboBox remainingComboBox;
	
	private JPanel buttonPanel;
	private JPanel remainingPanel;
	
	private ButtonHandler handler;
	
	private int screenWidth;
	private int screenHeight;
	private int eliminateCardPopUpWidth;
	private int eliminateCardPopUpHeight;
	private int eliminateTriplePopUpWidth;
	private int eliminateTriplePopUpHeight;
	private int count;

	public ClueSolverGUI() {
		super( "Clue Solver" );

		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle maxBounds = graphicsEnvironment.getMaximumWindowBounds();
		screenWidth = ( int )maxBounds.getWidth();
		screenHeight = ( int )maxBounds.getHeight();
		
		eliminateCardPopUpWidth = 550;
		eliminateCardPopUpHeight = 400;
		eliminateTriplePopUpWidth = 550;
		eliminateTriplePopUpHeight = 400;
		
		componentCreator = new ComponentCreator();	
		
		clueSolverLayout = new BorderLayout();
		setLayout( clueSolverLayout );
		
		remainingPanel = componentCreator.getFlowPanel();
		remainingLabel = new JLabel("Possible Combinations Remaining: " + count );
		remainingComboBox = componentCreator.getComboBox();
		remainingPanel.add( remainingComboBox );
		
		buttonPanel = componentCreator.getFlowPanel();
		eliminateCardButton = componentCreator.getEliminateButton( " ELIMINATE CARD " );
		eliminateTripleButton = componentCreator.getEliminateButton( " ELIMINATE TRIPLE " );
		buttonPanel.add( eliminateCardButton );
		buttonPanel.add( eliminateTripleButton );
		
		add( remainingPanel, BorderLayout.NORTH );
		add( buttonPanel, BorderLayout.CENTER );
		
		handler = new ButtonHandler();
		eliminateCardButton.addActionListener( handler );
		eliminateTripleButton.addActionListener( handler );
	}// end ClueSolverGUI constructor
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed( ActionEvent event ){
			if( event.getSource() == eliminateCardButton ){
				EliminateCardPopUp eliminateCardPopUp = new EliminateCardPopUp();
				eliminateCardPopUp.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				eliminateCardPopUp.setSize( eliminateCardPopUpWidth, eliminateCardPopUpHeight );
				eliminateCardPopUp.setLocation(  ( screenWidth / 2 ) - ( eliminateCardPopUpWidth / 2 ), ( screenHeight / 2 ) - ( eliminateCardPopUpHeight / 2 ) );
				eliminateCardPopUp.setAlwaysOnTop( true );
				eliminateCardPopUp.setResizable( false );
				eliminateCardPopUp.setVisible( true );
			}// end if
			
			if( event.getSource() == eliminateTripleButton ){
				EliminateTriplePopUp eliminateTriplePopUp = new EliminateTriplePopUp();
				eliminateTriplePopUp.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				eliminateTriplePopUp.setSize( eliminateTriplePopUpWidth, eliminateTriplePopUpHeight );
				eliminateTriplePopUp.setLocation(  ( screenWidth / 2 ) - ( eliminateTriplePopUpWidth / 2 ), ( screenHeight / 2 ) - ( eliminateTriplePopUpHeight / 2 ) );
				eliminateTriplePopUp.setAlwaysOnTop( true );
				eliminateTriplePopUp.setResizable( false );
				eliminateTriplePopUp.setVisible( true );
			}// end if
		}// end actionPerformed
	}// end ButtonHandler
}// end ClueSolverGUI class