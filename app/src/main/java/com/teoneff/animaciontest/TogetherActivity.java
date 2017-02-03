package com.teoneff.animaciontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Matute on 02/02/2017.
 */

public class TogetherActivity extends AppCompatActivity implements Animation.AnimationListener {

    ImageView imageView;
    Button btnStart;

    // Animation
    Animation together;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_together);

        imageView = (ImageView) findViewById(R.id.imageView);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load the animation
        together = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);
        // set animation listener
        together.setAnimationListener(this);

        // button click event
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //imageView.setVisibility(View.VISIBLE);
                // start the animation
                imageView.startAnimation(together);
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
        if (animation == together) {
            Toast.makeText(getApplicationContext(), "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

}
