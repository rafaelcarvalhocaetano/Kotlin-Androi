package com.studio.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class FlappyBird extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture[] passaros;
    private Texture fundo;
    private Texture canoBaixo;
    private Texture canoTopo;
    private Random numeroRandomico;
    private BitmapFont fonte;

    //Atributos de configuracao
    private int larguraDispositivo;
    private int alturaDispositivo;
    private float variacao = 0;
    private float velocidadeQueda = 0;
    private float posicaoInicialVertical;
    private float posicaoMovimentoCanoHorizontal;
    private float espacoEntreCanos;
    private float deltaTime;
    private float alturaEntreCanosRandomica;
    private int estadoJogo = 0; //jogo não iniciado ou 1 jogo iniciado
    private int pontuacao = 0;
    private boolean marcouPonto;

    @Override
    public void create() {

        batch = new SpriteBatch();
        numeroRandomico = new Random();
        //exibindo pontuação
        fonte = new BitmapFont();
        fonte.setColor(Color.WHITE);
        fonte.getData().setScale(6);

        //Fazendo ele voar
        passaros = new Texture[3];
        passaros[0] = new Texture("passaro1.png");
        passaros[1] = new Texture("passaro2.png");
        passaros[2] = new Texture("passaro3.png");

        //exibindo os canos
        fundo = new Texture("fundo.png");
        canoBaixo = new Texture("cano_baixo_maior.png");
        canoTopo = new Texture("cano_topo_maior.png");

        //largura dos dispositivos altura e largura
        larguraDispositivo = Gdx.graphics.getWidth();
        alturaDispositivo = Gdx.graphics.getHeight();

        posicaoInicialVertical = alturaDispositivo / 2;
        posicaoMovimentoCanoHorizontal = larguraDispositivo;
        //espaço dos canos
        espacoEntreCanos = 200;
    }

    @Override
    public void render() {

        deltaTime = Gdx.graphics.getDeltaTime();
        //variação das asas do bird
        variacao += deltaTime * 10;

        if (variacao > 2) {
            variacao = 0;
        }

        //Verificando se o jogo foi inicializado
        if(estadoJogo == 0){
            //verificando se a tela foi tocada
            if(Gdx.input.justTouched()){

                estadoJogo = 1;

            }
        }else {

            posicaoMovimentoCanoHorizontal -= deltaTime * 300;
            velocidadeQueda++;

            //Fazendo o passaro subir com o toque na tela
            if (Gdx.input.justTouched()) {
                velocidadeQueda = -15;
            }
            //Fazendo ele descer caso não seja tocado na tela
            if (posicaoInicialVertical > 0 || velocidadeQueda < 0) {
                posicaoInicialVertical = posicaoInicialVertical - velocidadeQueda;
            }
            //Verifica se o cano saiu inteiramente da tela
            if (posicaoMovimentoCanoHorizontal < -canoTopo.getWidth()) {

                posicaoMovimentoCanoHorizontal = larguraDispositivo;
                alturaEntreCanosRandomica = numeroRandomico.nextInt(400) - 200;
                marcouPonto = false;

            }
            //verificando pontuação
            if(posicaoMovimentoCanoHorizontal < 120){

                if(!marcouPonto){
                    pontuacao ++;
                    marcouPonto = true;
                }



            }
        }

        batch.begin();
        //largura do dispositivo
        batch.draw(fundo, 0, 0, larguraDispositivo, alturaDispositivo);
        //posicionamento dos canos alto
        batch.draw(canoTopo, posicaoMovimentoCanoHorizontal, alturaDispositivo / 2 + espacoEntreCanos / 2 + alturaEntreCanosRandomica );
        //posicionamento cano baixo
        batch.draw(canoBaixo, posicaoMovimentoCanoHorizontal, alturaDispositivo / 2 - canoBaixo.getHeight() - espacoEntreCanos / 2 + alturaEntreCanosRandomica);
        //Fazendo o passaro se movimentar
        batch.draw(passaros[(int) variacao], 120, posicaoInicialVertical);

        fonte.draw(batch, String.valueOf(pontuacao), larguraDispositivo / 2, alturaDispositivo - 50);
        //finaliza
        batch.end();

    }
}
