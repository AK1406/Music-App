package com.example.android.musicplayer;

public class Song {

    private String song_name;
    private String artist_name;
    private String movie_name;
    private int image_resource_id = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Song(String songName, String movieName, String artistName, int imageResourceId) {
        song_name = songName;
        movie_name = movieName;
        artist_name = artistName;
        image_resource_id = imageResourceId;

    }


    public String getSongName() {
        return song_name;
    }

    public String getArtistName() {
        return artist_name;
    }

    public int getImageResourceId() {
        return image_resource_id;
    }

    public String getMovieName() {
        return movie_name;
    }
}
