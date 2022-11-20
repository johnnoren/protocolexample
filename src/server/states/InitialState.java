package server.states;

import server.events.ClientOneDisconnected;
import server.events.Event;
import server.transitions.Transition;

import java.util.HashMap;

public class InitialState implements State {

	public State transition(ClientOneDisconnected clientOneDisconnected) {
		return new EndState();
	}

	@Override
	public State transition(Event event) {
		return null;
	}

}
