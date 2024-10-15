package Sv.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private final String name;
    private final String artist;
    private SongList songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String songTitle, double durationOfSong) {
        if (songs.findSong(songTitle) == null) {
            songs.add(new Song(songTitle, durationOfSong));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        try {

            playlist.add(songs.get(trackNumber - 1));
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No track with " + trackNumber + " found.");
        }
        return false;
    }

    public boolean addToPlayList(String trackTitle, LinkedList<Song> playlist) {
        if (findSong(trackTitle) != null) {
            playlist.add(findSong(trackTitle));
            return true;
        } else {
            return false;
        }
    }


    private class SongList {

        private List<Song> songs;

        public SongList() {
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


    }
}
