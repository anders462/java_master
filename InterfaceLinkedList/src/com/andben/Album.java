package com.andben;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String albumTitle;
    private  String artist;
    private ArrayList<Song> songs;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) != null) {
            return false;
        }
        Song newSong = new Song(songTitle, duration);
        this.songs.add(newSong);
        return true;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("No track number: " + trackNumber + " exits for this album");
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("No song with this title: " + title + " exits for this album");
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }
}
