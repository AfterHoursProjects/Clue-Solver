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
import popup.ShowStatisticsPopUp;
import service.ComponentCreator;
import service.ServerService;

public class ClueSolverGUI extends JFrame {
	private static final long serialVersionUID = -6289692480071914521L;
	private final ComponentCreator componentCreator;
	private final BorderLayout clueSolverLayout;

	private final JButton eliminateCardButton;
	private final JButton eliminateTripleButton;

	private final JLabel remainingLabel;

	private final JComboBox remainingComboBox;

	private final JPanel buttonPanel;
	private final JPanel remainingPanel;

	private final ButtonHandler handler;

	private final int screenWidth;
	private final int screenHeight;
	private final int eliminateCardPopUpWidth;
	private final int eliminateCardPopUpHeight;
	private final int eliminateTriplePopUpWidth;
	private final int eliminateTriplePopUpHeight;
	private int count;
	private final JButton button;

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
		button = new JButton("View Probability");
		buttonPanel.add(eliminateCardButton);
		buttonPanel.add(eliminateTripleButton);
		buttonPanel.add(button);

		add(remainingPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);

		// TODO: remove button handler and move logic to classes created for buttons.
		handler = new ButtonHandler(this);
		eliminateCardButton.addActionListener(handler);
		eliminateTripleButton.addActionListener(handler);
		button.addActionListener(handler);
		this.updateRemainingTriples();
	}

	private class ButtonHandler implements ActionListener {
		ClueSolverGUI parent;

		public ButtonHandler(ClueSolverGUI parent) {
			this.parent = parent;
		}

		@Override
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

			if (event.getSource() == button) {
				ShowStatisticsPopUp popup = new ShowStatisticsPopUp(parent);
				popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				popup.setSize(eliminateTriplePopUpWidth, eliminateTriplePopUpHeight);
				popup.setLocation((screenWidth / 2) - (eliminateTriplePopUpWidth / 2), (screenHeight / 2)
						- (eliminateTriplePopUpHeight / 2));
				popup.setAlwaysOnTop(true);
				popup.setResizable(false);
				popup.setVisible(true);
			}
		}
	}

	// TODO: Find a better way than removing all then re-adding them
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