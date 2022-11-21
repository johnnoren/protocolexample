package server.states;

import server.events.ClientOneDisconnected;
import server.events.ClientTwoDisconnected;

public interface State {

	State process(ClientOneDisconnected clientOneDisconnected);

	State process(ClientTwoDisconnected clientTwoDisconnected);

}
