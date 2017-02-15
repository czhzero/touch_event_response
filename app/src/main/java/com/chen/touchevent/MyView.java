package com.chen.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by chenzhaohua on 15/12/16.
 */
public class MyView extends View {

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("czh", "MyView onTouchEvent excute " + MotionEventHelper.toName(event));
        boolean flag = super.onTouchEvent(event);
        Log.d("czh", "MyView onTouchEvent , return " + flag);
        return flag;
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("czh", "MyView dispatchTouchEvent , excute " + MotionEventHelper.toName(event));
        boolean flag = super.dispatchTouchEvent(event);
        Log.d("czh", "MyView dispatchTouchEvent , return " + flag);
        return flag;
    }

}
