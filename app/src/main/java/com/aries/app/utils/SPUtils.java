package com.aries.app.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @ author ：monsterLin
 * @ date : 2017/1/13
 * @ github : https://github.com/monsterLin
 * @ blog : http://monsterlin.com/
 * @ describe : Sp工具类
 */

public class SPUtils {

    /**
     * 配置信息
     */
    private static final String CONFIG = "CONFIG";

    private static SharedPreferences sp;

    public static void clear() {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        sp.edit().clear().commit();
    }



    public static Context getContext() {
        return AppUtils.getContext();
    }

    /**
     * 上下文
     *
     * @param key      键
     * @param defValue 默认值
     * @return
     */
    public static boolean getBoolean(String key,
                                     boolean defValue) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key, defValue);
    }

    /**
     * 根据key存储一个Boolaen类型的值
     *
     * @param key
     * @param value
     */
    public static void putBoolean(String key, boolean value) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        sp.edit().putBoolean(key, value).commit();
    }

    /**
     * 根据key存储一个String类型的值
     *
     * @param key
     * @param value
     */
    public static void putString(String key, String value) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        sp.edit().putString(key, value).commit();
    }

    /**
     * 根据key获取一个String类型的值
     *
     * @param key
     * @param defValue
     * @return
     */
    public static String getString(String key, String defValue) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        return sp.getString(key, defValue);
    }

    /**
     * 存一个int类型的值
     *
     * @param key
     * @param value
     */
    public static void putInt(String key, int value) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        sp.edit().putInt(key, value).commit();
    }

    public static int getInt(String key, int defValue) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        return sp.getInt(key, defValue);
    }

    public static void putDouble(String key, double value) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        sp.edit().putFloat(key, (float) value).commit();
    }

    public static double getDouble(String key, double defValue) {
        if (sp == null) {
            sp = getContext().getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
        }
        return sp.getFloat(key, (float) defValue);
    }


}
