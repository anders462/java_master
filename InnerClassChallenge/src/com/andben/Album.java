package com.andben;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumTitle;
    private  String artist;
    private SongList songList;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songList = new SongList();
    }

    // Inner class SongList
    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public boolean addToSongList(Song song) {
            if (this.songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public Song findSongInList(int trackNo) {
            int index = trackNo - 1;
            if (index >= 0 && index < this.songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }
    }


    public boolean addSong(String songTitle, double duration) {
        return this.songList.addToSongList(new Song(songTitle, duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songList.findSongInList(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("No track number: " + trackNumber + " exits for this album");
        return false;
    }

}
