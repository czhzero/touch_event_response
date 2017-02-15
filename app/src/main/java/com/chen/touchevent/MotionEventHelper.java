package com.chen.touchevent;

import android.view.MotionEvent;

/**
 * Created by chenzhaohua on 17/2/15.
 */

public class MotionEventHelper {

    public static String toName(MotionEvent e) {

        String name = "default";

        switch (e.getAction()) {
            case 0:
                name = "ACTION_DOWN";
                break;
            case 1:
                name = "ACTION_UP";
                break;
            case 2:
                name = "ACTION_MOVE";
                break;
            case 3:
                name = "ACTION_CANCEL";
                break;
        }

        return name;
    }

}
