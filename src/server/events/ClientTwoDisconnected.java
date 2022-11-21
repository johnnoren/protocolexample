package server.events;

import server.states.State;

public class ClientTwoDisconnected implements Event {

	@Override
	public State processMe(State state) {
		return state.process(this);
	}

}
