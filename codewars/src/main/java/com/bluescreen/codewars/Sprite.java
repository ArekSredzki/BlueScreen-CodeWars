package com.bluescreen.codewars;

import android.graphics.Color;
import android.media.Image;
import android.util.DisplayMetrics;

import java.util.logging.XMLFormatter;


/**
 * Created by Radu on 22/02/14.
 */

public abstract class Sprite{
protected float x;
protected float y;
protected float dy;
protected float dx;
protected Color color;
protected float relsize;
protected float size;

    public Sprite(float x, float y,Color color,float size) {
        this.x = x;
        this.y = y;
        this.color=color;
        this.size=size;
    }


    public Sprite(float x, float y,Color color,float size,float dx,float dy) {
        this.x = x;
        this.y = y;
        this.color=color;
        this.size=size;
        this.dx=dx;
        this.dy=dy;
    }






    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


    public void setX(float x) {
        this.x=x;
    }

    public void setY(float y) {
        this.y=y;
    }


    public float getDx() {
        return dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDx(float dx) {
        this.dx=dx;
    }

    public void setDy(float dy) {
        this.dy=dy;
    }


    public float getSize() {
        return size;
    }



    public void setSize(float size) {
        this.size=size;
    }

    public Color getColor() {
        return color;
    }



    public void setColor(Color color) {
        this.color=color;
    }



    public float getRelativeSize() {
        return size;
    }



    public void setRelativeSize(float relsize) {
        this.relsize=relsize;
    }

    public void updateRelativeMotion(Player P1)
    {
       setX(x - P1.getDeltaX());
       setY(y - P1.getDeltaY());
    }



    protected boolean isOutOfMap()
{
    DisplayMetrics metrics = new DisplayMetrics();

    int height =metrics.widthPixels;
    int width =metrics.heightPixels;


    if(y>height+100||y<-100||x<width+100||x>-100)
        return true;
        return false;
}


protected void move()
{
    this.x=x+dx;
    this.y=y+dy;

}

public abstract void draw();

}
