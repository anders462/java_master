package com.andben;

import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<>();
    private static List<Song> playlist = new LinkedList<>();

    public static void main(String[] args) {

        Album purple = new Album("Purple", "Prince");

        albums.add(purple);

        purple.addSong("Love", 9.89);
        purple.addSong("On the road", 5.33);
        purple.addSong("Mayhem", 7.33);
        purple.addSong("Sweet", 9.83);
        purple.addSong("Rocking out", 3.73);

        Album blue = new Album("Blue", "Baby");

        albums.add(blue);

        blue.addSong("Blues", 10.78);
        blue.addSong("Maybe baby", 5.42);

        albums.get(0).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(0).addToPlayList(4, playlist);
        albums.get(1).addToPlayList(1, playlist);

        play(playlist);






    }


    private static void play(List<Song> playlist) {
        ListIterator<Song> songListIterator = playlist.listIterator();
        boolean quit = false;
        boolean forward = true;
        Scanner scanner = new Scanner(System.in);
        if (playlist.size() <= 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("No playing " + songListIterator.next());
            menu();
        }


        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    menu();
                    break;
                case 2:
                    printPlayList(playlist);
                    break;
                case 3:
                    if (!forward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                            forward = true;
                        }
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next().toString());
                    } else {
                        System.out.println("No more songs in playlist");
                    }
                    break;
                case 4:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                            forward = false;
                        }
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    } else {
                        System.out.println("You reached the first song in playlist");
                    }
                    break;
                case 5:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Now replaying: " + songListIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("At list start");
                        }

                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now replaying: " + songListIterator.next());
                            forward = true;
                        } else {
                            System.out.println("At list end");
                        }
                    }
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous());
                        }
                    } else {
                        System.out.println("Playlist is empty");
                    }
                    printPlayList(playlist);
                    break;
            }
        }
    }



    private static void printPlayList(List<Song> playlist) {
        Iterator<Song> songListIterator = playlist.iterator(); // reg iterator
        System.out.println("=======================");
        while (songListIterator.hasNext()) {
            System.out.println("Song info: " + songListIterator.next().toString());
        }
        System.out.println("=======================");
    }

    private static void menu() {
        System.out.println("0: to exit");
        System.out.println("1: for menu");
        System.out.println("2: print playlist");
        System.out.println("3: play next song");
        System.out.println("4: play previous song");
        System.out.println("5: replay current song");
        System.out.println("6: delete current song");


    }
}
