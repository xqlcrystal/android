package crystal.com.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by xieql2 on 2016/11/10.
 */
public class DrawView extends View {


    public float currentX=40;
    public float currentY=50;

    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p=new Paint();
        p.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,15,p);
    }
}
