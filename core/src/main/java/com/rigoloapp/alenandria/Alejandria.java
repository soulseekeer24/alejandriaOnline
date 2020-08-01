package com.rigoloapp.alenandria;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Alejandria extends Game {
	@Override
	public void create() {
		setScreen(new FirstScreen());
	}
}