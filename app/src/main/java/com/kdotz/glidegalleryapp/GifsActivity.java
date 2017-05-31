package com.kdotz.glidegalleryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by kdotz on 5/30/2017.
 */

public class GifsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifs);

        ImageView gifImageView = (ImageView) findViewById(R.id.iv_gif);

        Glide.with(this)
                .load("https://media1.giphy.com/media/26AHG5KGFxSkUWw1i/giphy.gif")
                .asGif()
                .placeholder(R.drawable.ic_cloud_off_red)
                .error(R.drawable.ic_cloud_off_red)
                .into(gifImageView);
    }

}