package jukebox5;
import java.util.*;
public class Jukebox5 {
    public static void main(String[] args){
        new Jukebox5().go();

    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);


        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
    }
}
