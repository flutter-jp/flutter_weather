package com.aries.app.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @ author ：monsterLin
 * @ date : 2017/1/13
 * @ github : https://github.com/monsterLin
 * @ blog : http://monsterlin.com/
 * @ describe : Toast工具类
 */

public class ToastUtils {

    private static Toast mToast;

    /**
     * 打印Toast
     * @param context  上下文对象
     * @param msg  文本信息
     */
    public static void showToast(Context context, String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(msg);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }
}
