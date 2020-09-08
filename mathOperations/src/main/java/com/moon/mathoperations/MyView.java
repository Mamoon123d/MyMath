package com.moon.mathoperations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

class MyView extends View {
    private static final int shape_size=200;
    private Rect mRectSquare;
    private Paint mPaintSquare;
    private int mShapeColor;
    private int mShapeSize;
    public MyView(Context context) {
        super(context);
        init(null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(null);

    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(null);

    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(null);

    }

    private void init(AttributeSet set) {
     mRectSquare=new Rect();
     mPaintSquare=new Paint(Paint.ANTI_ALIAS_FLAG);
     mPaintSquare.setColor(Color.RED);

     if (set==null)
         return;

     TypedArray typedArray=getContext().obtainStyledAttributes(set,R.styleable.MyView);
     mShapeColor=typedArray.getColor(R.styleable.MyView_shape_color,Color.RED);
        mShapeSize=typedArray.getColor(R.styleable.MyView_shape_size,shape_size);

     typedArray.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mRectSquare.left=50;
        mRectSquare.top=50;
        mRectSquare.right=mRectSquare.left+mShapeSize;
        mRectSquare.bottom=mRectSquare.top+mShapeSize;
        canvas.drawRect(mRectSquare,mPaintSquare);

    }
}
