package com.bluescreen.framework;

/**
 * Created by areksredzki on 2/22/2014.
 */

import com.bluescreen.framework.Graphics.ImageFormat;

public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}