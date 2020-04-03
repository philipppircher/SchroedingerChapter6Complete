package cc.phil.rockband;

public class Artist extends Person {
    // Membervariables
    //
    private String artistName;

    // Constructor
    //
    public Artist(String artistName, String firstName, String surname, int age) {
        super(firstName, surname, age);
        this.artistName = artistName;
    }

    // Getter/Setter
    //
    public String getArtistName() {
        return artistName;
    }
}
