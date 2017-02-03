package com.teoneff.animaciontest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Matute on 02/02/2017.
 */

public class OpcionesActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn,
            btnZoomOut, btnRotate, btnMove, btnSlideUp, btnSlideDown,
            btnBounce, btnSequencial, btnTogether, btnOtrasAnimaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
        btnCrossFade = (Button) findViewById(R.id.btnCrossFade);
        btnBlink = (Button) findViewById(R.id.btnBlink);
        btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
        btnRotate = (Button) findViewById(R.id.btnRotate);
        btnMove = (Button) findViewById(R.id.btnMove);
        btnSlideUp = (Button) findViewById(R.id.btnSlideUp);
        btnSlideDown = (Button) findViewById(R.id.btnSlideDown);
        btnBounce = (Button) findViewById(R.id.btnBounce);
        btnSequencial = (Button) findViewById(R.id.btnSequencial);
        btnTogether = (Button) findViewById(R.id.btnTogether);
        btnOtrasAnimaciones = (Button) findViewById(R.id.btnOtrasAnimaciones);

        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnCrossFade.setOnClickListener(this);
        btnBlink.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnMove.setOnClickListener(this);
        btnSlideUp.setOnClickListener(this);
        btnSlideDown.setOnClickListener(this);
        btnBounce.setOnClickListener(this);
        btnSequencial.setOnClickListener(this);
        btnTogether.setOnClickListener(this);
        btnOtrasAnimaciones.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFadeIn:
                showFadeIn();
                break;
            case R.id.btnFadeOut:
                showFadeOut();
                break;
            case R.id.btnCrossFade:
                showCrossFade();
                break;
            case R.id.btnBlink:
                showBlink();
                break;
            case R.id.btnZoomIn:
                showZoomIn();
                break;
            case R.id.btnZoomOut:
                showZoomOut();
                break;
            case R.id.btnRotate:
                showRotate();
                break;
            case R.id.btnMove:
                showMove();
                break;
            case R.id.btnSlideUp:
                showSlideUp();
                break;
            case R.id.btnSlideDown:
                showSlideDown();
                break;
            case R.id.btnBounce:
                showBounce();
                break;
            case R.id.btnSequencial:
                showSequencial();
                break;
            case R.id.btnTogether:
                showTogether();
                break;
            default:
                break;

        }
    }

    private void showFadeIn() {
        Intent intent = new Intent(OpcionesActivity.this, FadeInActivity.class);
        startActivity(intent);
    }

    private void showFadeOut() {
        Intent intent = new Intent(OpcionesActivity.this, FadeOutActivity.class);
        startActivity(intent);
    }

    private void showCrossFade() {
        Intent intent = new Intent(OpcionesActivity.this, CrossFadeActivity.class);
        startActivity(intent);
    }

    private void showBlink() {
        Intent intent = new Intent(OpcionesActivity.this, BlinkActivity.class);
        startActivity(intent);
    }

    private void showZoomIn() {
        Intent intent = new Intent(OpcionesActivity.this, ZoomInActivity.class);
        startActivity(intent);
    }

    private void showZoomOut() {
        Intent intent = new Intent(OpcionesActivity.this, ZoomOutActivity.class);
        startActivity(intent);
    }

    private void showRotate() {
        Intent intent = new Intent(OpcionesActivity.this, RotateActivity.class);
        startActivity(intent);
    }

    private void showMove() {
        Intent intent = new Intent(OpcionesActivity.this, MoveActivity.class);
        startActivity(intent);
    }

    private void showSlideUp() {
        Intent intent = new Intent(OpcionesActivity.this, SlideUpActivity.class);
        startActivity(intent);
    }

    private void showSlideDown() {
        Intent intent = new Intent(OpcionesActivity.this, SlideDownActivity.class);
        startActivity(intent);
    }

    private void showBounce() {
        Intent intent = new Intent(OpcionesActivity.this, BounceActivity.class);
        startActivity(intent);
    }

    private void showSequencial() {
        Intent intent = new Intent(OpcionesActivity.this, SequencialActivity.class);
        startActivity(intent);
    }

    private void showTogether() {
        Intent intent = new Intent(OpcionesActivity.this, TogetherActivity.class);
        startActivity(intent);
    }


}
