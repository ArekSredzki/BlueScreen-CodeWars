package com.bluescreen.codewars;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import com.bluescreen.framework.Graphics;
import com.bluescreen.framework.implementation.AndroidGraphics;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import 	android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

import java.io.InputStream;


/**
 * Created by Radu & Razvan Nesiu on 22/02/14.
 */
public class Amibae extends Sprite {



public Amibae(int x, int y,Color color,int size)
{
    super(x,y,color,size);
}

    public Amibae(int x, int y,Color color,int size,int dx,int dy)
    {
        super(x,y,color,size,dx,dy);
    }


    @Override
    public void draw(Context myContext,Image image)
    {



    }








}
