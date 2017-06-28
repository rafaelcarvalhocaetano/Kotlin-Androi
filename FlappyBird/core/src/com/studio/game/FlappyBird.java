package com.studio.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FlappyBird extends ApplicationAdapter {

	private int contador = 0;

	@Override
	public void create () {
		Gdx.app.log("Create", "Inicializado o jogo");
	}

	@Override
	public void render () {
		cotador ++;
		Gdx.app.log("Render", "Renderizando o jogo"+contador);
	}
	

}
