package com.example.android.musicplayer;

public class Artist {

    private String singer_name;
    private int image_resource_id = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Artist(String name, int singerImage) {
        singer_name = name;
        image_resource_id = singerImage;
    }

    public String getArtistName() {
        return singer_name;
    }

    public int getArtistImage() {
        return image_resource_id;
    }
}
