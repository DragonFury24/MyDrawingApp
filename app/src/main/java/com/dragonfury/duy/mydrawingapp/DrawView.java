package com.dragonfury.duy.mydrawingapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by 1383504 on 11/10/2016.
 */
public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint nam = new Paint();
        canvas.drawColor(Color.YELLOW);
        canvas.drawCircle(100,200,30,nam);
        canvas.drawCircle(450,200,30,nam);
        nam.setTextSize(100);
        nam.setColor(Color.RED);
        canvas.drawText("Hi Nam!",100,100,nam);
        RectF nammy = new RectF(0,300,getWidth(),1000);
        canvas.drawRect(nammy,nam);
        nam.setColor(Color.BLUE);
        canvas.drawOval(nammy,nam);
    }
}
