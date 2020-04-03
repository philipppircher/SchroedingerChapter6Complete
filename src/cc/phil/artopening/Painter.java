package cc.phil.artopening;

import cc.phil.rockband.Artist;     // Needs to import => painter class inherit from super Class Artist

public class Painter extends Artist {
    // Membervariables
    //
    private String pictureArtWork;

    // Constructor
    //
    public Painter(String artistName, String firstName, String surname, int age, String pictureArtWork) {
        super(artistName, firstName, surname, age);
        this.pictureArtWork = pictureArtWork;
    }

    // Getter/Setter
    //
    public String getPictureArtWork() {
        return pictureArtWork;
    }
}
