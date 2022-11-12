package com.programacionandroid.reproductorvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView miVideo = findViewById(R.id.videoRep);

        String dirVideo = "android.resource://" + getPackageName() + "/" + R.raw.video;

        Uri uri = Uri.parse(dirVideo);

        miVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        miVideo.setMediaController(mediaController);
        mediaController.setAnchorView(miVideo);

    }
}