package Sv.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String songTitle, double durationOfSong) {
        if (songs.findSong(songTitle) == null) {
            return songs.add(new Song(songTitle, durationOfSong));
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        try {
            if (songs.findSong(trackNumber - 1) != null) {
                playlist.add(songs.findSong(trackNumber - 1));
            }
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This album does not have a track " + trackNumber);
        }
        return false;
    }

    public boolean addToPlayList(String trackTitle, LinkedList<Song> playlist) {
        if (songs.findSong(trackTitle) != null) {

            playlist.add(songs.findSong(trackTitle));
            return true;
        } else {
            System.out.println("The song " + trackTitle + " is not in this album");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                '}';
    }

    private class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (!songs.contains(song)) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String songTitle) {
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(songTitle)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (songs.get(trackNumber) != null) {
                return songs.get(trackNumber);
            }
            return null;
        }

        @Override
        public String toString() {
            return "SongList{" +
                    "songs=" + songs +
                    '}';
        }
    }
}
