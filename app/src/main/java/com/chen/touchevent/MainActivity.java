package com.chen.touchevent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("czh", "MyView TouchListener's onTouch excute " + MotionEventHelper.toName(event));
                return false;
            }

        });

        ViewGroup viewg = (ViewGroup) findViewById(R.id.viewgroup);
        viewg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("czh", "MyViewGroup TouchListener's onTouch excute " + MotionEventHelper.toName(event));
                return false;
            }
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("czh", "MainActivity dispatchTouchEvent excute " + MotionEventHelper.toName(ev));
        boolean flag = super.dispatchTouchEvent(ev);
        Log.d("czh", "MainActivity dispatchTouchEvent return " + flag);
        return flag;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("czh", "MainActivity onTouchEvent excute " + MotionEventHelper.toName(event));
        boolean flag = super.onTouchEvent(event);
        Log.d("czh", "MainActivity onTouchEvent return " + flag);
        return flag;
    }


}
