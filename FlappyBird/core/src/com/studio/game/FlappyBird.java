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
	private Texture canoAlto;
	private Texture canoBaixo;

	//Atributos de configuração
	private int movimento = 0;
	private int larguraDispositivo;
	private int alturaDispositivo;
	private float variacao = 0;
	private float velocidadeQueda = 0;
	private float posicaoInicialVerticar;
	private float movimentoCanoHorizontal = larguraDispositivo;
	private float espacoCanos;
	private float deltaTime;


	@Override
	public void create () {
		sb = new SpriteBatch();

		//Fazendo ele voar
		passaros = new Texture[3];
		passaros[0] = new Texture("passaro1.png");
		passaros[1] = new Texture("passaro2.png");
		passaros[2] = new Texture("passaro3.png");

		//Exibindo imagens dos canos
		canoBaixo = new Texture("cano_baixo.png");
		canoAlto = new Texture("cano_topo.png");
		//Imagem de fundo
		fundo = new Texture("fundo.png");
		//pegando altura e largura da tela do dispositivo
		larguraDispositivo = Gdx.graphics.getWidth();
		alturaDispositivo = Gdx.grphics.getHeight();

		posicaoInicialVerticar = alturaDispositivo / 2;
		movimentoCanoHorizontal = larguraDispositivo - 100;

		//espaço entre os canos
		espacoCanos = 300;

	}

	@Override
	public void render () {

		deltaTime = Gdx.graphics.getDeltaTime();
		//variação das asas do bird
		variacao += deltaTime * 10;

		movimentoCanoHorizontal -= deltaTime * 200;
		velocidadeQueda ++;


		if(variacao > 2){
			variacao = 0;
		}
		//Fazendo o passaro subir com o toque na tela
		if(Gdx.input.justTouched()){
			velocidadeQueda = -10;
		}
		//Fazendo ele descer caso não seja tocado na tela
		if(posicaoInicialVerticar > 0 || velocidadeQueda < 0){
			posicaoInicialVerticar = posicaoInicialVerticar - velocidadeQueda;
		}
		//fazendo o cano percorer a tela de modo real
		if(movimentoCanoHorizontal < -canoAlto.getWidth()){
			movimentoCanoHorizontal = larguraDispositivo;
		}



		sb.begin();
		//largura do dispositivo
		sb.draw(fundo, 0, 0, larguraDispositivo, alturaDispositivo);
		//Fazendo o passaro se movimentar
		sb.draw(passaros[(int) variacao], 30, posicaoInicialVerticar);

		//posicionamento dos canos alto
		sb.draw(canoAlto, movimentoCanoHorizontal,alturaDispositivo / 2 + espacoCanos / 2);
		//posicionamento cano baixo
		sb.draw(canoBaixo, movimentoCanoHorizontal, alturaDispositivo / 2 - canoBaixo.getHeight());


		sb.end();
	}
	

}
