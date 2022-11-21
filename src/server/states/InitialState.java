package server.states;

import server.events.ClientOneDisconnected;
import server.events.ClientTwoDisconnected;

public class InitialState implements State {

	@Override
	public State process(ClientOneDisconnected clientOneDisconnected) {
		// TODO Do stuff.
		// TODO Return the next state.
		return null;
	}

	@Override
	public State process(ClientTwoDisconnected clientTwoDisconnected) {
		// TODO Do stuff.
		// TODO Return the next state.
		return null;
	}

}
