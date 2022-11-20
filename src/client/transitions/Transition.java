package client.transitions;

import client.states.State;

public interface Transition {
	State getNextState();
}
