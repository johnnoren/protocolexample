package server;

import server.events.Event;
import server.states.EndState;
import server.states.InitialState;
import server.states.State;

import java.util.concurrent.BlockingQueue;

public class ServerGameProtocol implements Runnable {

	private final BlockingQueue<Event> eventQueue;
	private final Thread<ConnectionHandler> connectionHandlerThread;

	public ServerGameProtocol(Thread<ConnectionHandler> connectionHandlerThread,
			BlockingQueue<Event> eventQueue) {
		this.connectionHandlerThread = connectionHandlerThread;
		this.eventQueue = eventQueue;
	}

	@Override
	public void run() {

		// Set the current state and the end state.
		State currentState = new InitialState();
		State endState = new EndState();

		// Transition between server.states until the end state is reached.
		while (!currentState.equals(endState)) {
			currentState = currentState.transition(getEvent());
		}

		// Stop the connection handler since the game is over.
		connectionHandlerThread.
		connectionHandlerThread.interrupt();
	}

	private Event getEvent() {
		try {
			return eventQueue.take();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
