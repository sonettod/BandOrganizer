package com.example.bandorganizer.models;

import android.media.MediaRecorder;

public class Record extends MediaRecorder {
        public String recname;

    public Record (String recname){
        this.setAudioSource(MediaRecorder.AudioSource.MIC);
        this.setOutputFormat(OutputFormat.DEFAULT);
        this.setAudioEncoder(AudioEncoder.DEFAULT);
        this.setOutputFile(recname);
    }
}
