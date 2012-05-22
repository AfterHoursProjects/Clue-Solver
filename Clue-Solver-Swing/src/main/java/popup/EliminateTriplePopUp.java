package popup;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import model.Room;
import model.Suspect;
import model.Triple;
import model.Weapon;

import org.restlet.Client;
import org.restlet.Request;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;

import service.ComponentCreator;
import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

public class EliminateTriplePopUp extends JFrame{
	private ComponentCreator componentCreator;
	
	private FlowLayout eliminateTripleLayout;
	private FlowLayout allRadioButtonsLayout;
	
	private ButtonGroup roomButtonGroup;
	private ButtonGroup suspectButtonGroup;
	private ButtonGroup weaponButtonGroup;
	
	private JRadioButton [] roomRadioButtons;
	private JRadioButton [] suspectRadioButtons;
	private JRadioButton [] weaponRadioButtons;
	
	private JButton submitButton;
	private JButton cancelButton;
	
	private JPanel allRadioButtonsPanel;
	private JPanel roomRadioButtonsPanel;
	private JPanel suspectRadioButtonsPanel;
	private JPanel weaponRadioButtonsPanel;
	private JPanel buttonPanel;

	private RadioButtonHandler handler;
	
	private int roomRadioButtonsPanelWidth;
	private int roomRadioButtonsPanelHeight;
	private int suspectRadioButtonsPanelWidth;
	private int suspectRadioButtonsPanelHeight;
	private int weaponRadioButtonsPanelWidth;
	private int weaponRadioButtonsPanelHeight;
	private int allRadioButtonsPanelWidth;
	private int allRadioButtonsPanelHeight;
	
	private static final Integer port = Integer.valueOf(1234);
	
	public EliminateTriplePopUp(){
		super( "Eliminate Triple" );
		
		componentCreator = new ComponentCreator();
		
		eliminateTripleLayout = new FlowLayout();
		setLayout( eliminateTripleLayout );
		
		roomRadioButtonsPanelWidth = 160;
		roomRadioButtonsPanelHeight = 300;
		suspectRadioButtonsPanelWidth = 160;
		suspectRadioButtonsPanelHeight = 210;
		weaponRadioButtonsPanelWidth = 160;
		weaponRadioButtonsPanelHeight = 210;
		allRadioButtonsPanelWidth = 520;
		allRadioButtonsPanelHeight = 310;
		
		roomRadioButtonsPanel = componentCreator.getTitledFlowPanel( "Rooms" );
		roomRadioButtonsPanel.setPreferredSize( new Dimension( roomRadioButtonsPanelWidth, roomRadioButtonsPanelHeight ) );
		roomButtonGroup = new ButtonGroup();
		roomRadioButtons = componentCreator.getRadioButtons( "rooms" );
		roomRadioButtons[ 0 ].setSelected( true );
		
		for( int i = 0; i < roomRadioButtons.length; i++ ){
			roomButtonGroup.add( roomRadioButtons[ i ] );
			roomRadioButtonsPanel.add( roomRadioButtons[ i ] );
		}// end for
		
		suspectRadioButtonsPanel = componentCreator.getTitledFlowPanel( "Suspects" );
		suspectRadioButtonsPanel.setPreferredSize( new Dimension( suspectRadioButtonsPanelWidth, suspectRadioButtonsPanelHeight ) );
		suspectButtonGroup = new ButtonGroup();
		suspectRadioButtons = componentCreator.getRadioButtons( "suspects" );
		suspectRadioButtons[ 0 ].setSelected( true );
		
		for( int i = 0; i < suspectRadioButtons.length; i++ ){
			suspectButtonGroup.add( suspectRadioButtons[ i ] );
			suspectRadioButtonsPanel.add( suspectRadioButtons[ i ] );
		}// end for

		weaponRadioButtonsPanel = componentCreator.getTitledFlowPanel( "Weapons" );
		weaponRadioButtonsPanel.setPreferredSize( new Dimension( weaponRadioButtonsPanelWidth, weaponRadioButtonsPanelHeight ) );
		weaponButtonGroup = new ButtonGroup();
		weaponRadioButtons = componentCreator.getRadioButtons( "weapons" );
		weaponRadioButtons[ 0 ].setSelected( true );
		
		for( int i = 0; i < weaponRadioButtons.length; i++ ){
			weaponButtonGroup.add( weaponRadioButtons[ i ] );
			weaponRadioButtonsPanel.add( weaponRadioButtons[ i ] );
		}// end for
		
		allRadioButtonsPanel = new JPanel();
		allRadioButtonsLayout = new FlowLayout();
		allRadioButtonsLayout.setAlignOnBaseline( true );
		allRadioButtonsPanel.setLayout( allRadioButtonsLayout );
		allRadioButtonsPanel.setPreferredSize( new Dimension( allRadioButtonsPanelWidth, allRadioButtonsPanelHeight ) );
		allRadioButtonsPanel.add( roomRadioButtonsPanel);
		allRadioButtonsPanel.add( suspectRadioButtonsPanel);
		allRadioButtonsPanel.add( weaponRadioButtonsPanel);
		
		buttonPanel = componentCreator.getFlowPanel();
		submitButton = componentCreator.getRegularButton( " Submit " );
		cancelButton = componentCreator.getRegularButton( " Cancel " );
		buttonPanel.add( submitButton );
		buttonPanel.add( cancelButton );
		
		add( allRadioButtonsPanel);
		add( buttonPanel);
		
		handler = new RadioButtonHandler();
		
		submitButton.addActionListener( handler );
		cancelButton.addActionListener( handler );
		
		for( int i = 0; i < roomRadioButtons.length; i++ ){
			roomRadioButtons[ i ].addActionListener( handler );
		}// end for
		
		for( int i = 0; i < suspectRadioButtons.length; i++ ){
			suspectRadioButtons[ i ].addActionListener( handler );
		}// end for
		
		for( int i = 0; i < weaponRadioButtons.length; i++ ){
			weaponRadioButtons[ i ].addActionListener( handler );
		}// end for
	}// end EliminateTriplePopUp constructor
	
	private class RadioButtonHandler implements ActionListener{
		
		public void actionPerformed( ActionEvent event ){
			int i = 0;
			int j = 0;
			int k = 0;
			JRadioButton roomRadioButton;
			JRadioButton suspectRadioButton;
			JRadioButton weaponRadioButton;
			
			if( event.getSource() == submitButton ){
				while( i < roomRadioButtons.length ){
					if( roomRadioButtons[ i ].isSelected() ){
						roomRadioButton = roomRadioButtons[ i ];
						i = roomRadioButtons.length;
					}// end if
					
					i++;
				}// end while
				
				while( j < suspectRadioButtons.length ){
					if( suspectRadioButtons[ j ].isSelected() ){
						suspectRadioButton = suspectRadioButtons[ j ];
						j = suspectRadioButtons.length;
					}// end if
					
					j++;
				}// end while
				
				while( k < weaponRadioButtons.length ){
					if( weaponRadioButtons[ k ].isSelected() ){
						weaponRadioButton = weaponRadioButtons[ k ];
						k = weaponRadioButtons.length;
					}// end if
					
					k++;
				}// end while
				
				final Client client = new Client(Protocol.HTTP);
				final Reference reference = new Reference("http://localhost/clue/triples");
				reference.setHostPort(port);
				final Request request = new Request(Method.PUT, reference);
				request.setChallengeResponse(getChallengeResponse());

				final Weapon weapon = WeaponEnum.CANDLESTICK.getWeapon();
				final Suspect suspect = SuspectEnum.PEACOCK.getSuspect();
				final Room room = RoomEnum.BILLIARDROOM.getRoom();

				request.setEntity(new JacksonRepresentation<Triple>(new Triple(room, suspect, weapon)));
				System.out.println(request.getEntityAsText());
				client.handle(request);
			}//  end if
			
			if( event.getSource() == cancelButton ){
				
			}// end if
		}// end actionPerformed
	}// end RadioButtonHandler
	
	private ChallengeResponse getChallengeResponse() {
		final ChallengeResponse response = new ChallengeResponse(ChallengeScheme.HTTP_BASIC);
		response.setIdentifier("matt");
		response.setSecret("abc");
		return response;
	}
}// end EliminateTriplePopUp class