package com.gorrotowi.latofonts;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by gorro on 27/09/15.
 */
public enum FontStyle {
    SINGLETON;

    public static void initStyle(Context ctx, View v) {
        Typeface tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Regular.ttf");
        setTypeface(tp, v);
    }

    public static void initStyle(Context ctx, int font, View v) {
        Typeface tp;
        switch (font) {
            case 0:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Black.ttf");
                setTypeface(tp, v);
                break;
            case 1:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-BlackItalic.ttf");
                setTypeface(tp, v);
                break;
            case 2:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Bold.ttf");
                setTypeface(tp, v);
                break;
            case 3:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-BoldItalic.ttf");
                setTypeface(tp, v);
                break;
            case 4:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Hairline.ttf");
                setTypeface(tp, v);
                break;
            case 5:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-HairlineItalic.ttf");
                setTypeface(tp, v);
                break;
            case 6:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Heavy.ttf");
                setTypeface(tp, v);
                break;
            case 7:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-HeavyItalic.ttf");
                setTypeface(tp, v);
                break;
            case 8:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Italic.ttf");
                setTypeface(tp, v);
                break;
            case 9:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Light.ttf");
                setTypeface(tp, v);
                break;
            case 10:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-LightItalic.ttf");
                setTypeface(tp, v);
                break;
            case 11:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Medium.ttf");
                setTypeface(tp, v);
                break;
            case 12:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-MediumItalic.ttf");
                setTypeface(tp, v);
                break;
            case 13:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Regular.ttf");
                setTypeface(tp, v);
                break;
            case 14:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Semibold.ttf");
                setTypeface(tp, v);
                break;
            case 15:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-SemiboldItalic.ttf");
                setTypeface(tp, v);
                break;
            case 16:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Thin.ttf");
                setTypeface(tp, v);
                break;
            case 17:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-ThinItalic.ttf");
                setTypeface(tp, v);
                break;
            default:
                tp = Typeface.createFromAsset(ctx.getAssets(), "fonts/Lato-Regular.ttf");
                setTypeface(tp, v);
        }
    }
    
    public static void setTypeface(Typeface typeface, View v){
        if (v instanceof TextView) {
            ((TextView) v).setTypeface(typeface);
        } else if (v instanceof EditText) {
            ((EditText) v).setTypeface(typeface);
        } else if (v instanceof Button) {
            ((Button) v).setTypeface(typeface);
        }
    }

}
