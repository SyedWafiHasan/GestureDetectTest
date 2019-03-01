package com.wafihasan.test;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        tv.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                onTouchEvent(event);
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        int action = MotionEventCompat.getActionMasked(event);
        if(action == MotionEvent.ACTION_DOWN)
        {
            Toast.makeText(this, "Down", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(action == MotionEvent.ACTION_UP)
        {
            Toast.makeText(this, "Up", Toast.LENGTH_SHORT).show();
            return true;
        }
        else
            return super.onTouchEvent(event);
    }
}