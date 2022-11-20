package server.states;

import server.events.Event;
import server.transitions.Transition;

import java.util.HashMap;

public class EndState implements State {

	public State transition(Event event) {
		throw new RuntimeException("State received event even though game is over.");
	}

}
