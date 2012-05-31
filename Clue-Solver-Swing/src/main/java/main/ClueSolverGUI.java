package main;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Triple;
import model.TripleList;

import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.resource.ClientResource;

import popup.EliminateCardPopUp;
import popup.EliminateTriplePopUp;
import service.ComponentCreator;
import service.ServerService;

public class ClueSolverGUI extends JFrame {
	private static final long serialVersionUID = -6289692480071914521L;
	private ComponentCreator componentCreator;
	private BorderLayout clueSolverLayout;

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
		super("Clue Solver");

		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle maxBounds = graphicsEnvironment.getMaximumWindowBounds();
		screenWidth = (int) maxBounds.getWidth();
		screenHeight = (int) maxBounds.getHeight();

		eliminateCardPopUpWidth = 550;
		eliminateCardPopUpHeight = 400;
		eliminateTriplePopUpWidth = 550;
		eliminateTriplePopUpHeight = 400;

		componentCreator = new ComponentCreator();

		clueSolverLayout = new BorderLayout();
		setLayout(clueSolverLayout);

		remainingPanel = componentCreator.getFlowPanel();
		remainingLabel = new JLabel("Possible Combinations Remaining: " + count);
		remainingComboBox = componentCreator.getComboBox();
		remainingPanel.add(remainingComboBox);

		buttonPanel = componentCreator.getFlowPanel();
		// TODO: create classes for these and remove using a string to get the right button
		eliminateCardButton = componentCreator.getEliminateButton(" ELIMINATE CARD ");
		eliminateTripleButton = componentCreator.getEliminateButton(" ELIMINATE TRIPLE ");
		buttonPanel.add(eliminateCardButton);
		buttonPanel.add(eliminateTripleButton);

		add(remainingPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);

		// TODO: remove button handler and move logic to classes created for buttons.
		handler = new ButtonHandler(this);
		eliminateCardButton.addActionListener(handler);
		eliminateTripleButton.addActionListener(handler);
		this.updateRemainingTriples();
	}

	private class ButtonHandler implements ActionListener {
		ClueSolverGUI parent;

		public ButtonHandler(ClueSolverGUI parent) {
			this.parent = parent;
		}

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == eliminateCardButton) {
				EliminateCardPopUp eliminateCardPopUp = new EliminateCardPopUp(parent);
				eliminateCardPopUp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				eliminateCardPopUp.setSize(eliminateCardPopUpWidth, eliminateCardPopUpHeight);
				eliminateCardPopUp.setLocation((screenWidth / 2) - (eliminateCardPopUpWidth / 2), (screenHeight / 2)
						- (eliminateCardPopUpHeight / 2));
				eliminateCardPopUp.setAlwaysOnTop(true);
				eliminateCardPopUp.setResizable(false);
				eliminateCardPopUp.setVisible(true);
			}

			if (event.getSource() == eliminateTripleButton) {
				EliminateTriplePopUp eliminateTriplePopUp = new EliminateTriplePopUp(parent);
				eliminateTriplePopUp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				eliminateTriplePopUp.setSize(eliminateTriplePopUpWidth, eliminateTriplePopUpHeight);
				eliminateTriplePopUp.setLocation((screenWidth / 2) - (eliminateTriplePopUpWidth / 2),
						(screenHeight / 2) - (eliminateTriplePopUpHeight / 2));
				eliminateTriplePopUp.setAlwaysOnTop(true);
				eliminateTriplePopUp.setResizable(false);
				eliminateTriplePopUp.setVisible(true);
			}
		}
	}

	//TODO: Find a better way than removing all then re-adding them
	public void updateRemainingTriples() {
		this.remainingComboBox.removeAllItems();
		for (Triple triple : getRemainingTriples()) {
			this.remainingComboBox.addItem(triple);
		}
	}

	private List<Triple> getRemainingTriples() {
		final Reference reference = new Reference("http://localhost/clue/triples/remaining.json");
		reference.setHostPort(ServerService.getPort());

		final ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(ServerService.getChallengeResponse());

		final TripleList response = resource.get(TripleList.class);
		resource.release();

		return response;
	}
	
}