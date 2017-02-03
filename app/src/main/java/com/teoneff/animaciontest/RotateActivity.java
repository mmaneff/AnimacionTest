package com.teoneff.animaciontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by emaneff on 03/02/2017.
 */

public class RotateActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView txtMessage;
    Button btnStart;

    // Animation
    Animation rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        txtMessage = (TextView) findViewById(R.id.txtMessage);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load the animation
        rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);

        // set animation listener
        rotate.setAnimationListener(this);

        // button click event
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);

                // start the animation
                txtMessage.startAnimation(rotate);
            }
        });
    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
// Take any action after completing the animation
        // check for fade in animation
        if (animation == rotate) {
            Toast.makeText(getApplicationContext(), "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }


}