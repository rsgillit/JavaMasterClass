package com.gill;

import java.util.LinkedList;

public class Album {
    private LinkedList<Song> song = new LinkedList<>();
    private String name;

    public Album(String name) {
        this.name = name;
    }

    public LinkedList<Song> getSong() {
        return song;
    }

    public String getName() {
        return name;
    }

    public boolean findSong(String title) {
        for(int i = 0; i < song.size();i++) {
            if(song.get(i).equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean addSong(String name, int duration) {
        if(!findSong(name)) {
            song.add(new Song(name, duration));
            return true;
        }
        System.out.println("Song: " + name + " already exists in album " + name);
        return false;
    }

    public void printList() {
        for(int i = 0; i < song.size();i++) {
            System.out.println("title: " + song.get(i).getTitle() + " Duration: " + song.get(i).getDuration() + " secs");
        }
    }
}
