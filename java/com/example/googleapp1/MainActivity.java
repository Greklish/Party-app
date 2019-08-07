package com.example.googleapp1;

import android.media.Image;
import android.media.ImageReader;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer saxSound = MediaPlayer.create(this, R.raw.sax_guy);

        final Button customButton = findViewById(R.id.button);

        Switch switchEnable = findViewById(R.id.switch_enable);

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saxSound.start();
            }
        });

        switchEnable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    customButton.setEnabled(true);
                } else{
                    customButton.setEnabled(false);
                }
            }
        });



    }
}
