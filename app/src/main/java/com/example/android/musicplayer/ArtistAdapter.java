package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ArtistAdapter extends ArrayAdapter<Artist> {


    public ArtistAdapter(Activity context, ArrayList<Artist> singer) {
        super(context, 0, singer);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_artist, parent, false);
        }

        Artist currentSinger = getItem(position);
        TextView songName = (TextView) listItemView.findViewById(R.id.singer_name);
        songName.setText(currentSinger.getArtistName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.singer_image);
        iconView.setImageResource(currentSinger.getArtistImage());

        return listItemView;
    }

}

