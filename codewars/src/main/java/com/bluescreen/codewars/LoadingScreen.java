package com.bluescreen.codewars;

/**
 * Created by areksredzki on 2/22/2014.
 */

import com.bluescreen.framework.Game;
import com.bluescreen.framework.Graphics;
import com.bluescreen.framework.Graphics.ImageFormat;
import com.bluescreen.framework.Screen;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        //Graphics g = game.getGraphics();
        //Assets.menu = g.newImage("menu.png", ImageFormat.RGB565);

        game.setScreen(new MainMenuScreen(game));

    }

    @Override
    public void paint(float deltaTime) {
        //Graphics g = game.getGraphics();
        //g.drawImage(Assets.splash, 0, 0);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }
}