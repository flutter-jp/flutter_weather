package com.aries.app.utils;

import android.content.Context;

/**
 * @ author ：monsterLin
 * @ date : 2017/1/13
 * @ github : https://github.com/monsterLin
 * @ blog : http://monsterlin.com/
 */

public class AppUtils {

    private static Context mContext;

    /**
     * 初始化
     */
    public static void init(Context context) {
        mContext = context;
    }

    /**
     * 上下文
     *
     * @return
     */
    public static Context getContext() {
        return mContext;
    }

}
