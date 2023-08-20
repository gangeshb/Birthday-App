package com.example.ajay;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class sohail_good extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sohail_good);
        VideoView videoView = (VideoView) findViewById(R.id.sohail_gd);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.gangesh_gd));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}
