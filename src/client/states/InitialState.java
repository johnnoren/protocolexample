package client.states;

import client.events.Event;
import client.transitions.Transition;

import java.util.HashMap;

public class InitialState implements State {

	private final HashMap<Event, Transition> transitions = new HashMap<>();

	public InitialState() {
		// TODO add server.transitions to the hashmap.
	}

	public State transition(Event event) {
		return transitions.get(event).getNextState();
	}

}
