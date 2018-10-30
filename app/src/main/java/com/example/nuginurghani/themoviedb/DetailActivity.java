package com.example.nuginurghani.themoviedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


import static com.example.nuginurghani.themoviedb.MainActivity.EXTRA_URL;
import static com.example.nuginurghani.themoviedb.MainActivity.EXTRA_TITLE;
import static com.example.nuginurghani.themoviedb.MainActivity.EXTRA_SYNOPSIS;
import static com.example.nuginurghani.themoviedb.MainActivity.EXTRA_RATING;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String movieTitle = intent.getStringExtra(EXTRA_TITLE);
        String movieSynopsis = intent.getStringExtra(EXTRA_SYNOPSIS);
        String movieRating = intent.getStringExtra(EXTRA_RATING);

        ImageView imageView = findViewById(R.id.imgVD);
        TextView textTitle = findViewById(R.id.tvTitleD);
        TextView textSynopsis = findViewById(R.id.tvSynopsisD);
        TextView textRating = findViewById(R.id.tvRatingD);

        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textTitle.setText(movieTitle);
        textSynopsis.setText(movieSynopsis);
        textRating.setText(movieRating);
    }
}
