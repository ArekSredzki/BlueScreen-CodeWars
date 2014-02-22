package com.bluescreen.codewars;

import com.bluescreen.framework.Screen;
import com.bluescreen.framework.implementation.AndroidGame;

public class ProjectBlue extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new GameScreen(this);
    }
}