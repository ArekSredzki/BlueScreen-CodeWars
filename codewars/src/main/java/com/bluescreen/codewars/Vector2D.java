package com.bluescreen.codewars;
import java.lang.Math.* ;

/**
 * Created by Vaastav on 22/02/14.
 */
public class Vector2D
{
   public float dx,dy;
    public void setVec(float dx, float dy)
    {
        this.dx = dx;
        this.dy = dy;
    }

    public float magnitude()
    {
        return (float) (Math.sqrt(dx*dx + dy*dy));
    }

    public void addVec(Vector2D v)
    {
        dx += v.dx;
        dy += v.dy;
    }

    public void subVec(Vector2D v)
    {
        dx -= v.dx;
        dy -= v.dy;
    }
    public void unitVec()
    {
        float mag = magnitude();
        setVec(dx/mag,dy/mag);
    }
}
