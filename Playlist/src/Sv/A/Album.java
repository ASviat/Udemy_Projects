package Sv.A;

import java.util.ArrayList;
import java.util.LinkedList;

record Song(String title, double duration) {

    @Override
    public String toString() {
        return String.format("\"%s: %.2f\"", title, duration);
    }
}

public class Album {

    private final String name;
    private final String artist;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String songTitle, double durationOfSong) {
        if (findSong(songTitle) == null) {
            songs.add(new Song(songTitle, durationOfSong));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String songTitle) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).title().equalsIgnoreCase(songTitle)) {
                return songs.get(i);
            }
        }
        return null;
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

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                '}';
    }
}
