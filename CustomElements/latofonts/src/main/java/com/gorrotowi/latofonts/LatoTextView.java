package com.gorrotowi.latofonts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by gorro on 27/09/15.
 */
public class LatoTextView extends TextView {

    Typeface tp;

    public LatoTextView(Context context) {
        super(context);
        initStyle();
    }

    public LatoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.custom_font,
                0, 0);

        try {
            int font = typedArray.getInteger(R.styleable.custom_font_fontType, 0);
            initStyle(font);
        } finally {
            typedArray.recycle();
        }
    }

    private void initStyle() {
        this.isInEditMode();
        tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Bold.ttf");
        this.setTypeface(tp);
    }

    private void initStyle(int font) {
        switch (font) {
            case 0:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Black.ttf");
                this.setTypeface(tp);
                break;
            case 1:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-BlackItalic.ttf");
                this.setTypeface(tp);
                break;
            case 2:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Bold.ttf");
                this.setTypeface(tp);
                break;
            case 3:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-BoldItalic.ttf");
                this.setTypeface(tp);
                break;
            case 4:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Hairline.ttf");
                this.setTypeface(tp);
                break;
            case 5:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-HairlineItalic.ttf");
                this.setTypeface(tp);
                break;
            case 6:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Heavy.ttf");
                this.setTypeface(tp);
                break;
            case 7:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-HeavyItalic.ttf");
                this.setTypeface(tp);
                break;
            case 8:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Italic.ttf");
                this.setTypeface(tp);
                break;
            case 9:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Light.ttf");
                this.setTypeface(tp);
                break;
            case 10:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-LightItalic.ttf");
                this.setTypeface(tp);
                break;
            case 11:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Medium.ttf");
                this.setTypeface(tp);
                break;
            case 12:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-MediumItalic.ttf");
                this.setTypeface(tp);
                break;
            case 13:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Regular.ttf");
                this.setTypeface(tp);
                break;
            case 14:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Semibold.ttf");
                this.setTypeface(tp);
                break;
            case 15:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-SemiboldItalic.ttf");
                this.setTypeface(tp);
                break;
            case 16:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Thin.ttf");
                this.setTypeface(tp);
                break;
            case 17:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-ThinItalic.ttf");
                this.setTypeface(tp);
                break;
            default:
                tp = Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Regular.ttf");
                this.setTypeface(tp);
        }

    }

}
