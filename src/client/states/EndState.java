package client.states;

import client.events.Event;

public class EndState implements State {

	public State transition(Event event) {
		throw new RuntimeException("State received event even though game is over.");
	}

}
