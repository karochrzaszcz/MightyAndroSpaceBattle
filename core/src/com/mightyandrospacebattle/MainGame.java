package com.mightyandrospacebattle;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends ApplicationAdapter {
    //	SpriteBatch batch;
    //	Texture img;
    public static int HEIGHT;
    public static int WIDTH;
    public static OrthographicCamera cam;

    @Override
    public void create() {
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();
        cam = new OrthographicCamera(WIDTH,HEIGHT);
        cam.translate(WIDTH/2,HEIGHT/2);
        cam.update();
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
    }

    @Override
    public void dispose() {
//		batch.dispose();
//		img.dispose();
    }
}
