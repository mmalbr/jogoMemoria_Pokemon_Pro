package com.meafocus.memoriapk02pro.events.engine;

import com.meafocus.memoriapk02pro.events.AbstractEvent;
import com.meafocus.memoriapk02pro.events.EventObserver;
import com.meafocus.memoriapk02pro.model.GameState;

/**
 * When the 'back to menu' was pressed.
 */
public class GameWonEvent extends AbstractEvent {

	public static final String TYPE = GameWonEvent.class.getName();

	public GameState gameState;

	
	public GameWonEvent(GameState gameState) {
		this.gameState = gameState;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
