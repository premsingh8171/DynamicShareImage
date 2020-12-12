package com.premsinghdaksha.dynamicshareimageinsmo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.dynamicimageshare.DynamicShareImage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DynamicShareImage dynamicShareImage;
    ArrayList<String> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dynamicShareImage = new DynamicShareImage(MainActivity.this);

        image.add("https://blog.hubspot.com/hubfs/image-file-extensions.jpg");


        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("image__", String.valueOf(image.size()));
                dynamicShareImage.shareImage(image, "send by Er.prem singh");

            }
        });


    }
}