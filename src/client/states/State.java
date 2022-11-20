package client.states;

import client.events.Event;

public interface State {

	State transition(Event event);

}