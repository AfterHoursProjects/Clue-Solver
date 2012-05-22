package popup;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import service.ComponentCreator;
import service.ComponentManipulator;

public class EliminateCardPopUp extends JFrame{
	private ComponentCreator componentCreator;
	private ComponentManipulator componentManipulator;
	
	private FlowLayout eliminateCardLayout;
	private FlowLayout allCardsLayout;
	
	private JPanel allCardsPanel;
	private JPanel roomCardsPanel;
	private JPanel suspectCardsPanel;
	private JPanel weaponCardsPanel;
	
	private JLabel roomsLabel;
	private JLabel suspectsLabel;
	private JLabel weaponsLabel;
	
	private JButton [] roomButtons;
	private JButton [] suspectButtons;
	private JButton [] weaponButtons;
	
	private ButtonHandler handler;
	
	private int roomCardsPanelWidth;
	private int roomCardsPanelHeight;
	private int suspectCardsPanelWidth;
	private int suspectCardsPanelHeight;
	private int weaponCardsPanelWidth;
	private int weaponCardsPanelHeight;
	private int allCardsPanelWidth;
	private int allCardsPanelHeight;
	
	public EliminateCardPopUp(){
		super( "Eliminate Card" );
		
		componentCreator = new ComponentCreator();
		
		eliminateCardLayout = new FlowLayout();
		setLayout(eliminateCardLayout);
		
		
		roomCardsPanelWidth = 160;
		roomCardsPanelHeight = 305;
		suspectCardsPanelWidth = 160;
		suspectCardsPanelHeight = 215;
		weaponCardsPanelWidth = 160;
		weaponCardsPanelHeight = 215;
		allCardsPanelWidth = 520;
		allCardsPanelHeight = 360;
		
		roomCardsPanel = componentCreator.getTitledFlowPanel( "Rooms" );
		roomCardsPanel.setPreferredSize( new Dimension( roomCardsPanelWidth, roomCardsPanelHeight ) );
		roomButtons = componentCreator.getButtons( "rooms" );
		
		for( int i = 0; i < roomButtons.length; i++ ){
			roomCardsPanel.add( roomButtons[ i ] );
		}// end for
		
		suspectCardsPanel = componentCreator.getTitledFlowPanel( "Suspects" );
		suspectCardsPanel.setPreferredSize( new Dimension( suspectCardsPanelWidth, suspectCardsPanelHeight ) );
		suspectButtons = componentCreator.getButtons( "suspects" );
		
		for( int i = 0; i < suspectButtons.length; i++ ){
			suspectCardsPanel.add( suspectButtons[ i ] );
		}// end for
		
		weaponCardsPanel = componentCreator.getTitledFlowPanel( "Weapons" );
		weaponCardsPanel.setPreferredSize( new Dimension( weaponCardsPanelWidth, weaponCardsPanelHeight ) );
		weaponButtons = componentCreator.getButtons( "weapons" );
		
		for( int i = 0; i < weaponButtons.length; i++ ){
			weaponCardsPanel.add( weaponButtons[ i ] );
		}// end for
		
		allCardsPanel = new JPanel();
		allCardsLayout = new FlowLayout();
		allCardsLayout.setAlignOnBaseline( true );
		allCardsPanel.setLayout( allCardsLayout );
		allCardsPanel.setPreferredSize( new Dimension( allCardsPanelWidth, allCardsPanelHeight ) );
		allCardsPanel.add( roomCardsPanel);
		allCardsPanel.add( suspectCardsPanel);
		allCardsPanel.add( weaponCardsPanel);
		
		add(allCardsPanel);
		
		handler = new ButtonHandler();
		
		for( int i = 0; i < roomButtons.length; i++ ){
			roomButtons[ i ].addActionListener( handler );
		}// end for
		
		for( int i = 0; i < suspectButtons.length; i++ ){
			suspectButtons[ i ].addActionListener( handler );
		}// end for
		
		for( int i = 0; i < weaponButtons.length; i++ ){
			weaponButtons[ i ].addActionListener( handler );
		}// end for
	}// end EliminateCard constructor
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed( ActionEvent event ){
			JButton buttonPressed;
			boolean suspectChosen = true;
			boolean weaponChosen = true;
			int i = 0;
			int j = 0;
			int k = 0;
			
			while( i < roomButtons.length ){
				if( event.getSource() == roomButtons[ i ] ){
					suspectChosen = false;
					weaponChosen = false;
					i = roomButtons.length;
					buttonPressed = roomButtons[ i ];
				}// end if
				
				i++;
			}// end while
			
			if( suspectChosen ){
				while( j < suspectButtons.length ){
					if( event.getSource() == suspectButtons[ j ] ){
						weaponChosen = false;
						j = suspectButtons.length;
						buttonPressed = suspectButtons[ j ];
					}// end if
					
					j++;
				}// end while
			}// end if
			
			if( weaponChosen ){
				while( k < weaponButtons.length ){
					if( event.getSource() == weaponButtons[ k ] ){
						j = weaponButtons.length;
						buttonPressed = weaponButtons[ k ];
					}// end if
					
					k++;
				}// end while
			}// end if
			
			
		}// end actionPerformed
	}// end ButtonListener
}// end EliminateCard class