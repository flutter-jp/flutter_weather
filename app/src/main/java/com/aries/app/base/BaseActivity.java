package com.aries.app.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.aries.app.utils.HttpUtil;

/**
 * @ author ：monsterLin
 * @ date : 2017/1/13
 * @ github : https://github.com/monsterLin
 * @ blog : http://monsterlin.com/
 * @ describe :  Activity 基类
 */

public class BaseActivity extends AppCompatActivity {

    private HttpUtil httpUtil;

    public BaseActivity() {
        this.httpUtil = HttpUtil.getInstance(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 跳到另一个页面
     *
     * @param cls
     */
    public void nextActivity(Class cls) {
        nextActivity(cls, null);
    }

    /**
     * 带数据包的跳转
     *
     * @param cls
     * @param bundle
     */
    public void nextActivity(Class cls, Bundle bundle) {
        Intent i = new Intent(this, cls);
        if (bundle != null)
            i.putExtras(bundle);
        startActivity(i);
    }
}
