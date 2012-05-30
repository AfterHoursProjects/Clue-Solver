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

import main.ClueSolverGUI;
import model.Room;
import model.Suspect;
import model.Triple;
import model.Weapon;

import org.restlet.Client;
import org.restlet.Request;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;

import service.ComponentCreator;
import service.ServerService;

import com.google.common.collect.Iterables;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

public class EliminateTriplePopUp extends JFrame {
	private class RadioButtonHandler implements ActionListener {

		ClueSolverGUI parent;

		RadioButtonHandler(ClueSolverGUI parent) {
			this.parent = parent;
		}

		@Override
		public void actionPerformed(ActionEvent event) {
			JRadioButton roomRadioButton = null;
			JRadioButton suspectRadioButton = null;
			JRadioButton weaponRadioButton = null;

			if (event.getSource() == submitButton) {
				for (JRadioButton room : roomRadioButtons) {
					if (room.isSelected()) {
						roomRadioButton = room;
					}
				}

				for (JRadioButton weapon : weaponRadioButtons) {
					if (weapon.isSelected()) {
						weaponRadioButton = weapon;
					}
				}

				for (JRadioButton suspect : suspectRadioButtons) {
					if (suspect.isSelected()) {
						suspectRadioButton = suspect;
					}
				}

				final Client client = new Client(Protocol.HTTP);
				final Reference reference = new Reference("http://localhost/clue/triples");
				reference.setHostPort(ServerService.getPort());
				final Request request = new Request(Method.PUT, reference);
				request.setChallengeResponse(ServerService.getChallengeResponse());

				final Weapon weapon = WeaponEnum.valueOf(weaponRadioButton.getText()).getWeapon();
				final Suspect suspect = SuspectEnum.valueOf(suspectRadioButton.getText()).getSuspect();
				final Room room = RoomEnum.valueOf(roomRadioButton.getText()).getRoom();

				request.setEntity(new JacksonRepresentation<Triple>(new Triple(room, suspect, weapon)));
				System.out.println(request.getEntityAsText());
				client.handle(request);

				parent.updateRemainingTriples();
			}

			if (event.getSource() == cancelButton) {

			}
		}
	}

	private static final long serialVersionUID = -1646585226250634393L;

	private ComponentCreator componentCreator;
	private FlowLayout eliminateTripleLayout;

	private FlowLayout allRadioButtonsLayout;
	private ButtonGroup roomButtonGroup;
	private ButtonGroup suspectButtonGroup;

	private ButtonGroup weaponButtonGroup;
	private Iterable<JRadioButton> roomRadioButtons;
	private Iterable<JRadioButton> suspectRadioButtons;
	private Iterable<JRadioButton> weaponRadioButtons;

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

	public EliminateTriplePopUp(ClueSolverGUI parent) {
		super("Eliminate Triple");

		componentCreator = new ComponentCreator();

		eliminateTripleLayout = new FlowLayout();
		setLayout(eliminateTripleLayout);

		roomRadioButtonsPanelWidth = 160;
		roomRadioButtonsPanelHeight = 300;
		suspectRadioButtonsPanelWidth = 160;
		suspectRadioButtonsPanelHeight = 210;
		weaponRadioButtonsPanelWidth = 160;
		weaponRadioButtonsPanelHeight = 210;
		allRadioButtonsPanelWidth = 520;
		allRadioButtonsPanelHeight = 310;

		roomRadioButtonsPanel = componentCreator.getTitledFlowPanel("Rooms");
		roomRadioButtonsPanel.setPreferredSize(new Dimension(roomRadioButtonsPanelWidth, roomRadioButtonsPanelHeight));
		roomButtonGroup = new ButtonGroup();
		roomRadioButtons = componentCreator.getRadioButtons("rooms");
		Iterables.getFirst(roomRadioButtons, null).setSelected(true);

		for (JRadioButton roomRadioButton : roomRadioButtons) {
			roomButtonGroup.add(roomRadioButton);
			roomRadioButtonsPanel.add(roomRadioButton);
		}

		suspectRadioButtonsPanel = componentCreator.getTitledFlowPanel("Suspects");
		suspectRadioButtonsPanel.setPreferredSize(new Dimension(suspectRadioButtonsPanelWidth,
				suspectRadioButtonsPanelHeight));
		suspectButtonGroup = new ButtonGroup();
		suspectRadioButtons = componentCreator.getRadioButtons("suspects");
		Iterables.getFirst(suspectRadioButtons, null).setSelected(true);

		for (JRadioButton suspectRadioButton : suspectRadioButtons) {
			suspectButtonGroup.add(suspectRadioButton);
			suspectRadioButtonsPanel.add(suspectRadioButton);
		}

		weaponRadioButtonsPanel = componentCreator.getTitledFlowPanel("Weapons");
		weaponRadioButtonsPanel.setPreferredSize(new Dimension(weaponRadioButtonsPanelWidth,
				weaponRadioButtonsPanelHeight));
		weaponButtonGroup = new ButtonGroup();
		weaponRadioButtons = componentCreator.getRadioButtons("weapons");
		Iterables.getFirst(weaponRadioButtons, null).setSelected(true);

		for (JRadioButton weaponRadioButton : weaponRadioButtons) {
			weaponButtonGroup.add(weaponRadioButton);
			weaponRadioButtonsPanel.add(weaponRadioButton);
		}

		allRadioButtonsPanel = new JPanel();
		allRadioButtonsLayout = new FlowLayout();
		allRadioButtonsLayout.setAlignOnBaseline(true);
		allRadioButtonsPanel.setLayout(allRadioButtonsLayout);
		allRadioButtonsPanel.setPreferredSize(new Dimension(allRadioButtonsPanelWidth, allRadioButtonsPanelHeight));
		allRadioButtonsPanel.add(roomRadioButtonsPanel);
		allRadioButtonsPanel.add(suspectRadioButtonsPanel);
		allRadioButtonsPanel.add(weaponRadioButtonsPanel);

		buttonPanel = componentCreator.getFlowPanel();
		submitButton = componentCreator.getRegularButton(" Submit ", this);
		cancelButton = componentCreator.getRegularButton(" Cancel ", this);
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		add(allRadioButtonsPanel);
		add(buttonPanel);

		handler = new RadioButtonHandler(parent);

		submitButton.addActionListener(handler);
		cancelButton.addActionListener(handler);

		for (JRadioButton button : Iterables.concat(roomRadioButtons, suspectRadioButtons, weaponRadioButtons)) {
			button.addActionListener(handler);
		}
	}
}