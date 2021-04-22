package edu.aku.hassannaqvi.basiccanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View
{
    Paint paint = null;
    public MyView(Context context)
    {
        super(context);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int x = getWidth();
        int y = getHeight();
        int radius;
        radius = (int) ((x/2)*0.8);


        canvas.drawCircle(x/2, y/2, radius, paint);

    }
}
