package crystal.com.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout main=(RelativeLayout)findViewById(R.id.root);
        final DrawView drawView=new DrawView(this);

        drawView.setMinimumHeight(500);
        drawView.setMinimumWidth(300);
        drawView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                drawView.currentX=motionEvent.getX();
                drawView.currentY=motionEvent.getY();
                drawView.invalidate();

                return true;
            }
        });
        main.addView(drawView);
    }
}
