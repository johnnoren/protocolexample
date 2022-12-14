package server.events;

import server.states.State;

public class ClientOneDisconnected implements Event {

	@Override
	public State processMe(State state) {
		return state.process(this);
	}

}
