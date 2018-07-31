package com.hugo.showpicture;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;



public class CustomView extends View {

    Paint paint = new Paint();
    private final Bitmap bitmap;


    public CustomView(Context context,
                      @Nullable AttributeSet attrs) {
        super(context, attrs);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.taylor);
    }


    @Override protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0, 0, paint);
        }
    }
}
