package com.bluescreen.codewars;

import android.graphics.Color;
import android.media.Image;
import android.util.DisplayMetrics;
import android.content.Context;

import com.bluescreen.framework.Graphics;

/**
 * Created by Radu on 22/02/14.
 */

public abstract class Sprite{
protected int x;
protected int y;
protected int dy;
protected int dx;
protected Color color;
protected int relsize;
protected int size;

    public Sprite(int x, int y,Color color,int size) {
        this.x = x;
        this.y = y;
        this.color=color;
        this.size=size;
    }


    public Sprite(int x, int y,Color color,int size,int dx,int dy) {
        this.x = x;
        this.y = y;
        this.color=color;
        this.size=size;
        this.dx=dx;
        this.dy=dy;
    }






    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setX(int x) {
        this.x=x;
    }

    public void setY(int y) {
        this.y=y;
    }


    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDx(int dx) {
        this.dx=dx;
    }

    public void setDy(int dy) {
        this.dy=dy;
    }


    public int getSize() {
        return size;
    }



    public void setSize(int size) {
        this.size=size;
    }

    public Color getColor() {
        return color;
    }



    public void setColor(Color color) {
        this.color=color;
    }



    public int getRelativeSize() {
        return size;
    }



    public void setRelativeSize(int relsize) {
        this.relsize=relsize;
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

public void draw(Graphics g) {
    g.drawCircle(x, y, relsize);
}

}
