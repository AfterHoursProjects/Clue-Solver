package popup;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.ClueSolverGUI;
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

	ClueSolverGUI parent;

	public ClueSolverGUI getParent() {
		return parent;
	}

	public EliminateCardPopUp(ClueSolverGUI parent) {
		super("Eliminate Card");

		this.parent = parent;
		componentCreator = new ComponentCreator();

		eliminateCardLayout = new FlowLayout();
		setLayout(eliminateCardLayout);

		roomCardsPanelWidth = 160;
		roomCardsPanelHeight = 305;
		suspectCardsPanelWidth = 160;
		suspectCardsPanelHeight = 245;
		weaponCardsPanelWidth = 160;
		weaponCardsPanelHeight = 245;
		allCardsPanelWidth = 520;
		allCardsPanelHeight = 360;

		roomCardsPanel = componentCreator.getTitledFlowPanel("Rooms");
		roomCardsPanel.setPreferredSize(new Dimension(roomCardsPanelWidth, roomCardsPanelHeight));
		roomButtons = componentCreator.getButtons("rooms", this);

		for (CardButton roomButton : roomButtons) {
			roomCardsPanel.add(roomButton);
		}

		suspectCardsPanel = componentCreator.getTitledFlowPanel("Suspects");
		suspectCardsPanel.setPreferredSize(new Dimension(suspectCardsPanelWidth, suspectCardsPanelHeight));
		suspectButtons = componentCreator.getButtons("suspects", this);

		for (CardButton suspectButton : suspectButtons) {
			suspectCardsPanel.add(suspectButton);
		}

		weaponCardsPanel = componentCreator.getTitledFlowPanel("Weapons");
		weaponCardsPanel.setPreferredSize(new Dimension(weaponCardsPanelWidth, weaponCardsPanelHeight));
		weaponButtons = componentCreator.getButtons("weapons", this);

		for (CardButton weaponButton : weaponButtons) {
			weaponCardsPanel.add(weaponButton);
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

}