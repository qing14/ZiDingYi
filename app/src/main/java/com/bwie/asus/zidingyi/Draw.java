package com.bwie.asus.zidingyi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Draw extends View {
    //画笔
    Paint mPaint;

    public Draw(Context context) {
        super(context);
    }

    public Draw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //画笔
        brush();

    }

    private void brush() {
        mPaint=new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setTextSize(20);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(50,50,50,600,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawLine(47,600,600,600,mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawRect(80,150,120,600,mPaint);
        canvas.drawRect(150,130,190,600,mPaint);
        canvas.drawRect(220,180,260,600,mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawText("第一天",70,620,mPaint);
        canvas.drawText("第二天",140,620,mPaint);
        canvas.drawText("第三天",210,620,mPaint);
    }
}
