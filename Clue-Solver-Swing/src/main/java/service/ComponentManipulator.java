package service;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ComponentManipulator {
	
	public ComponentManipulator(){
	}// end ComponentManipulator constructor
	
	public String uppercaseFirstLetters( String str ){
	    boolean prevWasWhiteSp = true;
	    
	    if( null != str ){
		    char[] chars = str.toCharArray();
		    
		    for ( int i = 0; i < chars.length; i++ ){
		        if ( Character.isLetter( chars[ i ] ) ){
		            if ( prevWasWhiteSp ){
		                chars[ i ] = Character.toUpperCase( chars[ i ] );    
		            }// end if
		            
		            prevWasWhiteSp = false;
		        }// end if
		        else{
		            prevWasWhiteSp = Character.isWhitespace( chars[ i ] );
		        }// end else
		    }// end for
		    
		    return new String(chars);
	    }// end if
	    
	    return "";
	}// end uppercaseFirstLetters
}// end ComponentManipulator class