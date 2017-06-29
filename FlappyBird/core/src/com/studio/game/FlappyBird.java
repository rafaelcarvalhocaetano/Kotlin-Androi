package com.studio.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FlappyBird extends ApplicationAdapter {

	private Texture[] passaros;
	private SpriteBatch sb;
	private Texture fundo;

	//Atributos de configuração
	private int movimento = 0;
	private int larguraDispositivo;
	private int alturaDispositivo;
	private float variacao = 0;
	private float velocidadeQueda = 0;
	private float posicaoInicialVerticar;


	@Override
	public void create () {
		sb = new SpriteBatch();

		//Fazendo ele voar
		passaros = new Texture[3];
		passaros[0] = new Texture("passaro1.png");
		passaros[1] = new Texture("passaro2.png");
		passaros[2] = new Texture("passaro3.png");

		fundo = new Texture("fundo.png");

		larguraDispositivo = Gdx.graphics.getWidth();
		alturaDispositivo = Gdx.graphics.getHeight();
		posicaoInicialVerticar = alturaDispositivo / 2;

	}

	@Override
	public void render () {

		velocidadeQueda ++;

		//variação das asas do bird
		variacao += Gdx.graphics.getDeltaTime() * 10;
		if(variacao > 2){
			variacao = 0;
		}

		if(posicaoInicialVerticar > 0){
			posicaoInicialVerticar = posicaoInicialVerticar - velocidadeQueda;
		}



		sb.begin();
		sb.draw(fundo, 0, 0, larguraDispositivo, alturaDispositivo);
		sb.draw(passaros[(int) variacao], 30, posicaoInicialVerticar);

		sb.end();
	}
	

}
