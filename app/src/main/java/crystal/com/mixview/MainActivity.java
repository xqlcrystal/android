package crystal.com.mixview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    int[] images=new int[]{
            R.drawable.ajax,
            R.drawable.html,
            R.drawable.javaee,
            R.drawable.java,
            R.drawable.swift
    };
    int currentImage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout main=(RelativeLayout) findViewById(R.id.root);
        final ImageView imageView=new ImageView(this);
        main.addView(imageView);
        imageView.setImageResource(images[0]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentImage>=4){
                    currentImage=-1;
                }
                imageView.setImageResource(images[++currentImage]);
            }
        });

    }
}
