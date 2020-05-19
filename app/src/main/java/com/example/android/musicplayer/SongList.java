package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Criminal", "Criminal", "Britney Spears", R.drawable.criminal));
        songs.add(new Song("Stay Little Longer", "Half GirlFriend", "Arijit Singh", R.drawable.stay));
        songs.add(new Song("Pretty Girl", "Pretty Girl", "Maggie Lindemann", R.drawable.pretty));
        songs.add(new Song("Illegal Weapon", "Illegal Weapon 2.0", "Garry Sandhu & Jasmine Sandlas", R.drawable.illegal));
        songs.add(new Song("Namo Namo", "Kedarnath", "Amit Trivedi", R.drawable.namo));
        songs.add(new Song("Believer", "Dragons", "Imagine Dragons", R.drawable.beliver));
        songs.add(new Song("sun Le Zara", "1921", "Arnab Dutta", R.drawable.sunle));
        songs.add(new Song("Dilbaro", "Raazi", "Vibha Saraf", R.drawable.dil));
        songs.add(new Song("Thodi Jagah", "Marjaaavaan", "Arijit Singh", R.drawable.thodi));
        songs.add(new Song("Bekhayali", "Kabir Singh", "Sachet Tandon", R.drawable.kabir));


        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.music_list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(SongList.this, NowPlaySong.class);

                Song songTrack = songs.get(position);

                Bundle bundle = new Bundle();
                bundle.putString("song_name", songTrack.getSongName());
                bundle.putString("movie_name", songTrack.getMovieName());
                bundle.putString("artist_name", songTrack.getArtistName());
                bundle.putInt("album_cover", songTrack.getImageResourceId());

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}

