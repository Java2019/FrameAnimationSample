package com.samples.res.frameanimationxml;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity
        implements View.OnClickListener{

    private AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ImageView image = (ImageView)findViewById(R.id.image);
        image.setBackgroundResource(R.drawable.android_anim);
        animation = (AnimationDrawable)image.getBackground();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start:
                animation.start();
                break;
            case R.id.btn_stop:
                animation.stop();
                break;
        }
    }
}
