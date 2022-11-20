package server.transitions;

import server.states.State;

public interface Transition {
	State getNextState();
}
