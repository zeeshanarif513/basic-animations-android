package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnfadeIn,btnfadeOut,btnblink,btnZoomIn,btnZoomOut,btnRotate,btnMove, btnSlideUp, btnSlideDown ,btnBounce, btnSequential;
    TextView tvfadeIn,tvfadeOut,tvblink,tvZoomIn,tvZoomOut,tvRotate,tvMove,tvSlideUp, tvSlideDown, tvBounce, tvSequential;
    Animation fadeIn,fadeOut,blink,zoomIn,zoomOut,rotate,move,slideUp, slideDown, bounce ,sequential;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        btnfadeIn = (Button) findViewById(R.id.btnfadein);
        btnfadeOut = (Button) findViewById(R.id.btnfadeout);
        btnblink = (Button) findViewById(R.id.btnblink);
        btnZoomIn = (Button) findViewById(R.id.btnzoomin);
        btnZoomOut = (Button) findViewById(R.id.btnzoomout);
        btnRotate = (Button) findViewById(R.id.btnrotate);
        btnMove = (Button) findViewById(R.id.btnmove);
        btnSlideUp = (Button) findViewById(R.id.btnslideup);
        btnSlideDown = (Button) findViewById(R.id.btnslidedown);
        btnBounce = (Button) findViewById(R.id.btnbounce);
        btnSequential = (Button) findViewById(R.id.btnsequential);




        tvfadeIn = (TextView) findViewById(R.id.tvfadein);
        tvfadeOut = (TextView) findViewById(R.id.tvfadeout);
        tvblink = (TextView) findViewById(R.id.tvblink);
        tvZoomIn = (TextView) findViewById(R.id.tvzoomin);
        tvZoomOut = (TextView) findViewById(R.id.tvzoomout);
        tvRotate = (TextView) findViewById(R.id.tvrotate);
        tvMove = (TextView) findViewById(R.id.tvmove);
        tvSlideUp = (TextView) findViewById(R.id.tvslideup);
        tvSlideDown = (TextView) findViewById(R.id.tvslidedown);
        tvBounce = (TextView) findViewById(R.id.tvbounce);
        tvSequential = (TextView) findViewById(R.id.tvsequential);


        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        blink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        zoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        zoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        slideUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        slideDown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        sequential = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);



        btnfadeIn.setOnClickListener(this);
        btnfadeOut.setOnClickListener(this);
        btnblink.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnMove.setOnClickListener(this);
        btnSlideUp.setOnClickListener(this);
        btnSlideDown.setOnClickListener(this);
        btnBounce.setOnClickListener(this);
        btnSequential.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnfadein:
                tvfadeIn.setVisibility(View.VISIBLE);
                tvfadeIn.startAnimation(fadeIn);
                break;
            case R.id.btnfadeout:
                tvfadeOut.setVisibility(View.VISIBLE);
                tvfadeOut.startAnimation(fadeOut);
                break;
            case R.id.btnblink:
                tvblink.setVisibility(View.VISIBLE);
                tvblink.startAnimation(blink);
                break;
            case R.id.btnzoomin:
                tvZoomIn.setVisibility(View.VISIBLE);
                tvZoomIn.startAnimation(zoomIn);
                break;
            case R.id.btnzoomout:
                tvZoomOut.setVisibility(View.VISIBLE);
                tvZoomOut.startAnimation(zoomOut);
                break;
            case R.id.btnrotate:
                tvRotate.setVisibility(View.VISIBLE);
                tvRotate.startAnimation(rotate);
                break;
            case R.id.btnmove:
                tvMove.setVisibility(View.VISIBLE);
                tvMove.startAnimation(move);
                break;
            case R.id.btnslideup:
                tvSlideUp.setVisibility(View.VISIBLE);
                tvSlideUp.startAnimation(slideUp);
                break;
            case R.id.btnslidedown:
                tvSlideDown.setVisibility(View.VISIBLE);
                tvSlideDown.startAnimation(slideDown);
                break;
            case R.id.btnbounce:
                tvBounce.setVisibility(View.VISIBLE);
                tvBounce.startAnimation(bounce);
                break;
            case R.id.btnsequential:
                tvSequential.setVisibility(View.VISIBLE);
                tvSequential.startAnimation(sequential);
        }
    }
}
