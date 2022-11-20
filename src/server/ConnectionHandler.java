package server;

import server.events.Event;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionHandler {
	private final BlockingQueue<Event> eventQueue = new LinkedBlockingQueue<>();

	protected Event getEvent()

//	WHAT happens if the protocol is waiting for an event but a client takes too long to respond?
	// Need to be able to have a timer put an event in the queue after a while if it is empty.
	// Or limit the wait for an event some other way. This is later implementation, so I shouldn't tell the
	// team about it but it may be good to have thought about it now.

}
