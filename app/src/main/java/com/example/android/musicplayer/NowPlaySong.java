package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlaySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_play_song);

        final ImageButton play = findViewById(R.id.play_btn);
        final ImageButton pause = findViewById(R.id.pause_btn);

        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play.setVisibility(View.INVISIBLE);
                pause.setVisibility(View.VISIBLE);
                Toast.makeText(NowPlaySong.this, "Song is played", Toast.LENGTH_LONG).show();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pause.setVisibility(View.INVISIBLE);
                play.setVisibility(View.VISIBLE);
                Toast.makeText(NowPlaySong.this, "Song is paused", Toast.LENGTH_LONG).show();
            }
        });


        Intent intent = getIntent();
        String songName = intent.getStringExtra("song_name");
        String movieName = intent.getStringExtra("movie_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumCover = intent.getIntExtra("album_cover", R.drawable.album_placeholder);

        ImageView albumCoverImageView = findViewById(R.id.album);
        albumCoverImageView.setImageResource(albumCover);

        TextView songNameTextView = findViewById(R.id.SongName);
        songNameTextView.setText(songName);

        TextView movieNameTextView = findViewById(R.id.MovieName);
        movieNameTextView.setText(movieName);

        TextView artistNameTextView = findViewById(R.id.ArtistName);
        artistNameTextView.setText(artistName);


    }
}
