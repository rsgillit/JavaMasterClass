package com.gill;

import com.gill.model.Artist;
import com.gill.model.DataSource;
import com.gill.model.SongArtist;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if(!dataSource.open()) {
            System.out.println("Can't open data source");
            return;
        }

        List<Artist> artists = dataSource.queryArtist(DataSource.ORDER_BY_ASC);
        if(artists == null) {
            System.out.println("No artists!");
            return;
        }

        //System.out.println(artists.toString());
        artists.forEach((artist) -> System.out.println(artist.getId() + "," + artist.getName()));

        List<String> albumNames = dataSource.queryAlbumsForArtist("Pink Floyd", DataSource.ORDER_BY_DESC);
        albumNames.forEach(albumName -> System.out.println(albumName));

        List<SongArtist> songArtists = dataSource.queryArtistsForSong("Go Your Own Way", DataSource.ORDER_BY_NONE);
        if(songArtists == null ) {
            System.out.println("could n't find the artist for the song");
        }
        songArtists.forEach(songArtist ->
                System.out.println("Artist Name: " + songArtist.getArtistName() + " , " +
                        "Album Name: " + songArtist.getAlbumName() + " , " +
                        "Track# :" + songArtist.getTrack()));


        dataSource.querySongsMetadata();

        int count = dataSource.getCount(dataSource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        dataSource.createViewForSongArtists();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = scanner.nextLine();

        songArtists = dataSource.querySongInfoView(title);
        if(songArtists.isEmpty()) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for(SongArtist artist : songArtists) {
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }


        dataSource.close();
    }
}
