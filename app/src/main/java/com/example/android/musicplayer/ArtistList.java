package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        final ArrayList<Artist> singer = new ArrayList<Artist>();

        singer.add(new Artist("Britney Spears", R.drawable.britney));
        singer.add(new Artist("Arijit Singh", R.drawable.arijit));
        singer.add(new Artist("Sunidhi Chauhan", R.drawable.sunidhi));
        singer.add(new Artist("Tony Kakkar", R.drawable.tony));
        singer.add(new Artist("Neha Kakkar", R.drawable.neha));
        singer.add(new Artist("Jaubin Nautiyal", R.drawable.jaubin));
        singer.add(new Artist("Sonu Nigam", R.drawable.sonu));
        singer.add(new Artist("Shreya Ghoshal", R.drawable.shreya));
        singer.add(new Artist("Maggie Lindemann", R.drawable.magiee));
        singer.add(new Artist("Guru Randhawa", R.drawable.guru));

        ArtistAdapter artistAdapter = new ArtistAdapter(this, singer);
        ListView listView = (ListView) findViewById(R.id.artist_list);
        listView.setAdapter(artistAdapter);


    }
}

