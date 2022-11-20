package server.states;

import server.events.Event;

public interface State {

	State transition(Event event);

}