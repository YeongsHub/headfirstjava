package songs;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class JukeBoxStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();
        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);

        List<String> genres = songs.stream()
                .map( song -> song.getGenre())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(genres);

        String songTitle = "With a little Help from my Friends";
        List<String> result = songs.stream()
                .filter(song -> song.getTitle().equals(songTitle))
                .map(song -> song.getArtist())
                .filter( artist -> !artist.equals("The Beatles"))
                .collect(Collectors.toList());
        System.out.println(result);

        Function<Song, String> getGenre1 = song -> song.getGenre();
        System.out.println(getGenre1);
        Function<Song, String> getGenre2 = Song::getGenre;
        System.out.println(getGenre2);

        List<Song> ergebnis = songs.stream()
                .sorted((o1, o2) -> o1.getYear() - o2.getYear())
                .collect(Collectors.toList());
        System.out.println(ergebnis);

        List<Song> ergebniss = songs.stream()
                .sorted(Comparator.comparingInt(Song::getYear))
                .collect(Collectors.toList());
        System.out.println(ergebniss);

        Set<String> genre = songs.stream()
                .map(song -> song.getGenre())
                .collect(Collectors.toSet());
        System.out.println(genre);


    }
}