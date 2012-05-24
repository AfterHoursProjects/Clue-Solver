package service;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;

public class ServerService {

	private static final int PORT = 1234;

	public static ChallengeResponse getChallengeResponse() {
		final ChallengeResponse response = new ChallengeResponse(ChallengeScheme.HTTP_BASIC);
		response.setIdentifier("bobby");
		response.setSecret("abc");
		return response;
	}

	public static int getPort() {
		return PORT;
	}
}
