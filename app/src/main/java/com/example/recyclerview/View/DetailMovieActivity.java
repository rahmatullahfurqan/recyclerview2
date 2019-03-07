package com.example.recyclerview.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;

public class DetailMovieActivity extends AppCompatActivity {
    TextView tvName,tvOverview;
    ImageView ivMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvName = findViewById(R.id.tv_judul);
        tvOverview = findViewById(R.id.tv_overview);
        ivMovie = findViewById(R.id.iv_movie);

        String name = getIntent().getStringExtra("name");
        String overview = getIntent().getStringExtra("overview");
        int gambar = getIntent().getIntExtra("gambar",0);

        tvName.setText(name);
        tvOverview.setText(overview);
        ivMovie.setImageResource(gambar);
    }
}
