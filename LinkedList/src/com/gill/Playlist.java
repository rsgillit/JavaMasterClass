package com.gill;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    public static void main(String[] args) {


        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Punjabi hits");
        album.printList();
        album.addSong("firstOne", 90);
        album.addSong("second", 100);
        album.addSong("third", 80);
        album.addSong("fourth", 200);
        album.printList();

        albums.add(album);
        Album albume = new Album("English hits");
        albume.addSong("efirstOne", 90);
        albume.addSong("esecond", 100);
        albume.addSong("ethird", 80);
        albume.addSong("efourth", 200);
        albums.add(albume);

        LinkedList<Song> playList = new LinkedList<>();
        playList.add()



    }
}
