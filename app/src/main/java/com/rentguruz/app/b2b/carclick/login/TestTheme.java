package com.rentguruz.app.b2b.carclick.login;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;

public class TestTheme {

    public Context context;

    public TestTheme(Context context) {
        this.context = context;
    }

    public void changeTheme(ActivityInfo activityInfo){
        final int theme = activityInfo.getThemeResource();

        final Resources.Theme themeObj = context.getResources().newTheme();
        themeObj.applyStyle(theme, true);
        TypedArray ta = null;
        try {

        } catch (Throwable thr) {

        } finally {
            if (ta != null) {
                ta.recycle();
            }
        }
    }


}
