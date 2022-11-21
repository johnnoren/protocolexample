package server.protocols;

import server.events.Event;
import server.states.InitialState;
import server.states.State;

public class ServerGameProtocol {

	private State currentState = new InitialState();

	public void transition(Event event) {
		currentState = event.processMe(currentState);
	}

}
