package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ClientResource;

import popup.EliminateCardPopUp;
import service.ServerService;

public class CardButton extends JButton {

	private static final long serialVersionUID = -1781960193283468886L;
	private final Card card;

	public CardButton(final Card card, final EliminateCardPopUp parent) {
		super(card.getName());
		this.card = card;
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				final Reference reference = new Reference("http://localhost/clue/cards");
				reference.setHostPort(ServerService.getPort());

				final ClientResource client = new ClientResource(reference);
				client.setChallengeResponse(ServerService.getChallengeResponse());

				client.put(new JacksonRepresentation<Card>(card));

				client.release();
				parent.getParent().updateRemainingTriples();
				parent.getParent().updateMostLikelyTriple();
				parent.dispose();
			}
		});
	}

	public Card getCard() {
		return card;
	}
}
