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

    public LatoTextView(Context context) {
        super(context);
        //En este caso 'this' hace referencia al View de tipo TextView
        FontStyle.initStyle(getContext(), this);
    }

    public LatoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.custom_font,
                0, 0);

        try {
            int font = typedArray.getInteger(R.styleable.custom_font_fontType, 0);
            //En este caso 'this' hace referencia al View de tipo TextView
            //Mientras que el getContext() obtiene el contexto general de la aplicacion
            FontStyle.initStyle(getContext(), font, this);
        } finally {
            typedArray.recycle();
        }
    }

}
