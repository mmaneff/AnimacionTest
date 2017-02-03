package com.teoneff.animaciontest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/*
* http://www.androidhive.info/2013/06/android-working-with-xml-animations/
* */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView, imageView2;
    TextView textView;
    Button btnGirar, btnMover, btnAmpliar, btnTransparencia, btnContraer, btnScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        textView = (TextView) findViewById(R.id.textView);
        btnGirar = (Button) findViewById(R.id.btnGirar);
        btnMover = (Button) findViewById(R.id.btnMover);
        btnAmpliar = (Button) findViewById(R.id.btnAmpliar);
        btnTransparencia = (Button) findViewById(R.id.btnTransparencia);
        btnContraer = (Button) findViewById(R.id.btnContraer);
        btnScale = (Button) findViewById(R.id.btnScale);

        btnGirar.setOnClickListener(this);
        btnMover.setOnClickListener(this);
        btnAmpliar.setOnClickListener(this);
        btnTransparencia.setOnClickListener(this);
        btnContraer.setOnClickListener(this);
        btnScale.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGirar:
                Animation giro;
                giro = AnimationUtils.loadAnimation(this, R.anim.girar);
                giro.reset();
                imageView.startAnimation(giro);
                textView.startAnimation(giro);
                break;
            case R.id.btnMover:
                Animation mover;
                mover = AnimationUtils.loadAnimation(this, R.anim.mover);
                mover.reset();
                imageView.startAnimation(mover);
                textView.startAnimation(mover);
                break;
            case R.id.btnAmpliar:
                Animation ampliar;
                ampliar = AnimationUtils.loadAnimation(this, R.anim.ampliar);
                //ampliar.reset();
                imageView.startAnimation(ampliar);
                imageView2.startAnimation(ampliar);
                textView.startAnimation(ampliar);
                break;
            case R.id.btnContraer:
                Animation contraer;
                contraer = AnimationUtils.loadAnimation(this, R.anim.contraer);
                //ampliar.reset();
                imageView.startAnimation(contraer);
                imageView2.startAnimation(contraer);
                textView.startAnimation(contraer);
                break;
            case R.id.btnTransparencia:
                Animation transparencia;
                transparencia = AnimationUtils.loadAnimation(this, R.anim.transparencia);
                transparencia.reset();
                imageView.startAnimation(transparencia);
                textView.startAnimation(transparencia);
                break;
            case R.id.btnScale:
                Animation scale;
                scale = AnimationUtils.loadAnimation(this, R.anim.scale2);
                //ampliar.reset();
                imageView.startAnimation(scale);
                imageView2.startAnimation(scale);
                textView.startAnimation(scale);
                break;
            default:
                break;

        }
    }

}
