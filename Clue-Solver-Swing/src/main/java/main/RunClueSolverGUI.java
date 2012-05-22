package main;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class RunClueSolverGUI {
	
	public static void main( String [] args ){
		int clueSolverWidth = 400;
		int clueSolverHeight = 250;
		int screenWidth = 0;
		int screenHeight = 0;
		
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle maxBounds = graphicsEnvironment.getMaximumWindowBounds();
		screenWidth = ( int )maxBounds.getWidth();
		screenHeight = ( int )maxBounds.getHeight();
		
		ClueSolverGUI clueSolverGUI = new ClueSolverGUI();
		clueSolverGUI.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		clueSolverGUI.setSize( clueSolverWidth, clueSolverHeight );
		clueSolverGUI.setLocation(  ( screenWidth / 2 ) - clueSolverWidth, ( screenHeight / 2 ) - clueSolverHeight );
		clueSolverGUI.setAlwaysOnTop( true );
		clueSolverGUI.setResizable( false );
		clueSolverGUI.setVisible( true );
	}// end main
}// end RunClueSolverGUI