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

public class CrossFadeActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView txtView1, txtView2;
    Animation animFadeIn, animFadeOut;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossfade);

        txtView1 = (TextView) findViewById(R.id.txtView1);
        txtView2 = (TextView) findViewById(R.id.txtView2);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load animations
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

        // set animation listener
        // set animation listeners
        animFadeIn.setAnimationListener(this);
        animFadeOut.setAnimationListener(this);

        // button click event
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Make fade in elements Visible first
                txtView2.setVisibility(View.VISIBLE);
                // start fade in animation
                txtView2.startAnimation(animFadeIn);
                // start fade out animation
                txtView1.startAnimation(animFadeOut);
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
        if (animation == animFadeIn) {
            Toast.makeText(getApplicationContext(), "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }


}
