package com.moon.mathoperations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.Observable;
import java.util.Observer;

class myCardView extends CardView  {
    LayoutInflater mInflater;

    public myCardView(@NonNull Context context) {
        super(context);
        mInflater=LayoutInflater.from(context);
        init();
    }

    private void init() {
    View view=mInflater.inflate(R.layout.my_card,this,true);
    }

    public myCardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mInflater=LayoutInflater.from(context);
        init();
    }

    public myCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater=LayoutInflater.from(context);
        init();
    }

   /* @Override
    public void update(Observable o, Object arg) {

    }*/
}
