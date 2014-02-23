package com.bluescreen.framework.implementation;

/**
 * Created by areksredzki on 2/22/2014.
 */

import java.util.List;

import android.view.View.OnTouchListener;

import com.bluescreen.framework.Input.TouchEvent;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}