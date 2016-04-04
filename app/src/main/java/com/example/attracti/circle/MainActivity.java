package com.example.attracti.circle;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    CanvasView mCanvasView;
    //setup buttons
    Button mKick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//example, the kick drum button
        mKick = (Button) findViewById(R.id.kick);
      //  mCanvasView = (CanvasView) findViewById(R.id.canvasView1);
        mCanvasView = new CanvasView(getApplicationContext());
        LinearLayout container = (LinearLayout) findViewById(R.id.conteiner);
        container.addView(mCanvasView);

        mKick.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mCanvasView.drawCircle();

            }
        });
    }
}