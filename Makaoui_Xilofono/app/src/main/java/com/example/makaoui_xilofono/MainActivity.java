package com.example.makaoui_xilofono;


import android.media.MediaPlayer;
import android.app.Activity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0F;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;
    private int mCCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void mCCSoundOnClick(View v){
        MediaPlayer.create(this, R.raw.note1_c).start();
    }
    public void mDCSoundOnClick(View v){
        MediaPlayer.create(this, R.raw.note2_d).start();
    }
    public void mECSoundOnClick(View v){
        MediaPlayer.create(this, R.raw.note3_e).start();
    }
    public void mFCSoundOnClick(View v){
        MediaPlayer.create(this, R.raw.note4_f).start();
    }
    public void mGCSoundOnClick(View v){
        MediaPlayer.create(this, R.raw.note5_g).start();
    }
    public void mACSoundOnClick(View v){
        MediaPlayer.create(this, R.raw.note6_a).start();
    }
    public void mBCSoundOnClick(View v){
        MediaPlayer.create(this, R.raw.note7_b).start();
    }

}