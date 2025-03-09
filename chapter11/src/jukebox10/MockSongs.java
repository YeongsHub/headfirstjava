package jukebox10;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<SongV4> getSongsV4(){
        List<SongV4> songs = new ArrayList<>();
        songs.add( new SongV4("someresult", "zero 7", 147));
        songs.add( new SongV4("cassidy", "grateful dead", 158));
        songs.add( new SongV4("$10", "hitchhiker", 140));
        songs.add( new SongV4("$10", "hitchhiker", 140));


        songs.add( new SongV4("havana", "cabello", 105));
        songs.add( new SongV4("Cassidy", "grateful dead", 158));
        songs.add( new SongV4("Cassidy", "grateful dead", 158));

        songs.add( new SongV4("50 ways", "simon", 102));
        return songs;
    }
}
