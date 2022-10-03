package com.rentguruz.app.b2b.carclick.login;

import android.content.res.Resources.Theme;
import android.os.Build;
import android.util.TypedValue;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresApi;

public class AttrUtils {

    private AttrUtils() {}


    /** Returns the given boolean attribute from the theme. */
    public static boolean resolveBoolean(Theme theme, @AttrRes int attrRes) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(attrRes, typedValue, /*resolveRefs=*/true);
        return typedValue.data != 0;
    }


    /** Returns the given color attribute from the theme. */
    public static int resolveColor(Theme theme, @AttrRes int attrRes) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(attrRes, typedValue, /*resolveRefs=*/true);
        return typedValue.data;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public static @ColorInt int resolveColor(
            Theme theme, @AttrRes int attrRes, @ColorRes int defaultColorRes) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(attrRes, typedValue, /*resolveRefs=*/true)) {
            return typedValue.data;
        } else {
            return theme.getResources().getColor(defaultColorRes, theme);
        }
    }

}
