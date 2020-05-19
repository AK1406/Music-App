package com.example.android.musicplayer;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);
        TextView songName = listItemView.findViewById(R.id.song_name);
        assert currentSong != null;
        songName.setText(currentSong.getSongName());

        TextView artistName = listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());

        ImageView iconView = listItemView.findViewById(R.id.song_image);
        iconView.setImageResource(currentSong.getImageResourceId());

        TextView movieName = listItemView.findViewById(R.id.movie_name);
        movieName.setText(currentSong.getMovieName());

        return listItemView;
    }

}

