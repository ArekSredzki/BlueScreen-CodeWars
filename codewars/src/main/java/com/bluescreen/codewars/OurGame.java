package com.bluescreen.codewars;

import com.bluescreen.framework.Screen;
import com.bluescreen.framework.implementation.AndroidGame;

public class OurGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new SplashLoadingScreen(this);
    }
}