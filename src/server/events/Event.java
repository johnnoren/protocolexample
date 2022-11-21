package server.events;

import server.states.State;

public interface Event {

	State processMe(State state);

}
