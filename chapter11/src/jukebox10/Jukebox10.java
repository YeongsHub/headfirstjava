package jukebox10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox10 {
    public static void main(String[] args){
        new Jukebox10().go();

    }

    public void go() {
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);


        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        //Set<SongV4> songSet = new TreeSet<>(songList);
        //System.out.println(songSet);

        Set<SongV4> songSet = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        songSet.addAll(songList);
    }
}
