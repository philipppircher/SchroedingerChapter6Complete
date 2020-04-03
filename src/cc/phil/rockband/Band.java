package cc.phil.rockband;

import java.util.ArrayList;
import java.util.List;

public class Band {
    // Membervariables
    //
    private String bandName;
    private Singer singer;
    private Guitarrist guitarrist;
    private Bassist bassist;
    private ArrayList<Song> songList;

    //Constructor
    //
    public Band(String bandName, Singer singer, Guitarrist guitarrist, Bassist bassist, ArrayList<Song> songList) {
        this.bandName = bandName;
        this.singer = singer;
        this.guitarrist = guitarrist;
        this.bassist = bassist;
        this.songList = songList;
    }

    // Methodes
    //
    public void playRepertoire() {
        System.out.println("Songliste der Band " + this.getBandName());
        for (Song song : songList){
            System.out.println(song.getNAMEOFSONG());
        }
        System.out.println();
    }

    // Getter/Setter
    //
    public String getBandName() {
        return bandName;
    }

    public void setSong(Song song){
        this.songList.add(song);
    }
}
