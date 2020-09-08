package com.moon.mymaths;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.moon.myview.myCustomView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        myCustomView MyView=(myCustomView)fragmentManager.findFragmentById(R.id.fragment);
        MyView.changeText("hi");
    }
}