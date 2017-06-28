package com.studio.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FlappyBird extends ApplicationAdapter {

	private Texture passaro;
	private SpriteBatch sb;
	private int movimento = 0;
	private Texture fundo;

	@Override
	public void create () {
		sb = new SpriteBatch();
		passaro = new Texture("passaro1.png");
		fundo = new Texture("fundo.png");

	}

	@Override
	public void render () {

		movimento ++;
		sb.begin();
		sb.draw(fundo, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		sb.draw(passaro, movimento, 400);

		sb.end();
	}
	

}
