package com.meafocus.memoriapk02pro.fragments;

import androidx.fragment.app.Fragment;

import com.meafocus.memoriapk02pro.events.EventObserver;
import com.meafocus.memoriapk02pro.events.engine.FlipDownCardsEvent;
import com.meafocus.memoriapk02pro.events.engine.GameWonEvent;
import com.meafocus.memoriapk02pro.events.engine.HidePairCardsEvent;
import com.meafocus.memoriapk02pro.events.ui.BackGameEvent;
import com.meafocus.memoriapk02pro.events.ui.FlipCardEvent;
import com.meafocus.memoriapk02pro.events.ui.NextGameEvent;
import com.meafocus.memoriapk02pro.events.ui.ResetBackgroundEvent;
import com.meafocus.memoriapk02pro.events.ui.ThemeSelectedEvent;
import com.meafocus.memoriapk02pro.events.ui.DifficultySelectedEvent;
import com.meafocus.memoriapk02pro.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
