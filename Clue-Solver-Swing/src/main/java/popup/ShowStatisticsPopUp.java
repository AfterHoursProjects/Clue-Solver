package popup;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JFrame;

import main.ClueSolverGUI;
import model.rest.ProbabilityReport;

import org.restlet.data.Reference;
import org.restlet.resource.ClientResource;

import service.ServerService;

public class ShowStatisticsPopUp extends JFrame {
	ClueSolverGUI parent;
	private final FlowLayout layout;

	@Override
	public ClueSolverGUI getParent() {
		return parent;
	}

	public ShowStatisticsPopUp(ClueSolverGUI parent) {
		super("Eliminate Card");
		this.parent = parent;

		this.layout = new FlowLayout();
		setLayout(layout);

		Label percentage = new Label();
		percentage.setText(String.valueOf(getStats().getMostLikelyRoom().getProbability()));
		add(percentage);
	}

	private ProbabilityReport getStats() {
		final Reference reference = new Reference("http://localhost/clue/probability.json");
		reference.setHostPort(ServerService.getPort());

		final ClientResource client = new ClientResource(reference);
		client.setChallengeResponse(ServerService.getChallengeResponse());

		ProbabilityReport report = client.get(ProbabilityReport.class);
		client.release();
		return report;
	}
}
