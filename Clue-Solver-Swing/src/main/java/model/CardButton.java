package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ClientResource;

import service.ServerService;

public class CardButton extends JButton {

	private static final long serialVersionUID = -1781960193283468886L;
	private Card card;

	public CardButton(final Card card, final JFrame parent) {
		super(card.name);
		this.card = card;
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				final Reference reference = new Reference("http://localhost/clue/cards");
				reference.setHostPort(ServerService.getPort());

				final ClientResource client = new ClientResource(reference);
				client.setChallengeResponse(ServerService.getChallengeResponse());

				client.put(new JacksonRepresentation<Card>(card));

				parent.dispose();
			}
		});
	}

	public Card getCard() {
		return card;
	}
}
