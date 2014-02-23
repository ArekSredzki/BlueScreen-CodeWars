package com.bluescreen.codewars;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.graphics.Color;
import android.view.View;
import java.util.Random;
import com.bluescreen.framework.Graphics;

/**
 * Created by Vaastav on 22/02/14.
 */
public class Background
{
    Vector2D speed;
    Point[] CircleCentres;
    float size;
    int coefficient;
    int colour ;
    View view;
    DisplayMetrics metrics = new DisplayMetrics();
    Background()
    {
        coefficient = random_num(5);
        speed.setVec(coefficient*2,coefficient*3);
        size = coefficient*10;
        int i = random_num(8);
        for(int j=0;j<i;++j)
        {
            CircleCentres[i].x = random_num(metrics.widthPixels);
            CircleCentres[i].y = random_num(metrics.heightPixels);
        }
        int l = random_num(128);
        colour = Color.argb(135, 0, 0, l);
        view.setBackgroundColor(Color.argb(135,0,0,l));
    }
    public void update(float x,float y)
    {
        speed.setVec(coefficient*-x,coefficient*-y);
        for(int i=0;i<CircleCentres.length;++i)
        {
            CircleCentres[i].x -= (int) x;
            CircleCentres[i].y -= (int) y;
        }


    }
    public void render_background(Graphics g)
    {
        g.drawRect(-5, -5, metrics.widthPixels + 5, metrics.heightPixels + 5, colour);
        for(int i=0;i<CircleCentres.length;++i)
        {
            g.drawCircle(CircleCentres[i].x,CircleCentres[i].y,size/2,colour);
        }

    }
    public int random_num(int n)
    {
        Random randomGenerator = new Random();
        int i = randomGenerator.nextInt(n) + 1;
        return i;
    }

}
