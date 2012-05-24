package popup;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.CardButton;
import service.ComponentCreator;

public class EliminateCardPopUp extends JFrame {
	private static final long serialVersionUID = 5538266196656884338L;
	private ComponentCreator componentCreator;

	Logger logger = Logger.getLogger("EliminateCardPopUp");

	private FlowLayout eliminateCardLayout;
	private FlowLayout allCardsLayout;

	private JPanel allCardsPanel;
	private JPanel roomCardsPanel;
	private JPanel suspectCardsPanel;
	private JPanel weaponCardsPanel;

	private CardButton[] roomButtons;
	private CardButton[] suspectButtons;
	private CardButton[] weaponButtons;

	private int roomCardsPanelWidth;
	private int roomCardsPanelHeight;
	private int suspectCardsPanelWidth;
	private int suspectCardsPanelHeight;
	private int weaponCardsPanelWidth;
	private int weaponCardsPanelHeight;
	private int allCardsPanelWidth;
	private int allCardsPanelHeight;

	public EliminateCardPopUp() {
		super("Eliminate Card");

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

		roomCardsPanel = componentCreator.getTitledFlowPanel("Rooms");
		roomCardsPanel.setPreferredSize(new Dimension(roomCardsPanelWidth, roomCardsPanelHeight));
		roomButtons = componentCreator.getButtons("rooms", this);

		for (int i = 0; i < roomButtons.length; i++) {
			roomCardsPanel.add(roomButtons[i]);
		}

		suspectCardsPanel = componentCreator.getTitledFlowPanel("Suspects");
		suspectCardsPanel.setPreferredSize(new Dimension(suspectCardsPanelWidth, suspectCardsPanelHeight));
		suspectButtons = componentCreator.getButtons("suspects", this);

		for (int i = 0; i < suspectButtons.length; i++) {
			suspectCardsPanel.add(suspectButtons[i]);
		}

		weaponCardsPanel = componentCreator.getTitledFlowPanel("Weapons");
		weaponCardsPanel.setPreferredSize(new Dimension(weaponCardsPanelWidth, weaponCardsPanelHeight));
		weaponButtons = componentCreator.getButtons("weapons", this);

		for (int i = 0; i < weaponButtons.length; i++) {
			weaponCardsPanel.add(weaponButtons[i]);
		}

		allCardsPanel = new JPanel();
		allCardsLayout = new FlowLayout();
		allCardsLayout.setAlignOnBaseline(true);
		allCardsPanel.setLayout(allCardsLayout);
		allCardsPanel.setPreferredSize(new Dimension(allCardsPanelWidth, allCardsPanelHeight));
		allCardsPanel.add(roomCardsPanel);
		allCardsPanel.add(suspectCardsPanel);
		allCardsPanel.add(weaponCardsPanel);

		add(allCardsPanel);

	}

	private class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			JButton buttonPressed = new JButton();
			boolean suspectChosen = true;
			boolean weaponChosen = true;
			int i = 0;
			int j = 0;
			int k = 0;

			while (i < roomButtons.length) {
				if (event.getSource() == roomButtons[i]) {
					suspectChosen = false;
					weaponChosen = false;
					buttonPressed = roomButtons[i];
					i = roomButtons.length;
				}

				i++;
			}

			if (suspectChosen) {
				while (j < suspectButtons.length) {
					if (event.getSource() == suspectButtons[j]) {
						weaponChosen = false;
						buttonPressed = suspectButtons[j];
						j = suspectButtons.length;
					}

					j++;
				}
			}

			if (weaponChosen) {
				while (k < weaponButtons.length) {
					if (event.getSource() == weaponButtons[k]) {
						k = weaponButtons.length;
						buttonPressed = weaponButtons[k];
					}

					k++;
				}
			}
		}
	}
}