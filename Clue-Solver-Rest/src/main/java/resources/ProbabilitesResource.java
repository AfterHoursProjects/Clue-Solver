package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import main.ClueGameFactory;
import model.rest.ProbabilityReport;
import service.ClueSessionService;
import service.probability.ProbabilityCalculator;
import service.probability.ProbabilityCalculatorImpl;

@Path("probability")
public class ProbabilitesResource {
	@Context
	SecurityContext security;
	private final ProbabilityCalculator calculator = new ProbabilityCalculatorImpl();

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public ProbabilityReport getProbabilities() {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());
		return calculator.generateProbabilityReport(game.getPossibilities());
	}
}
