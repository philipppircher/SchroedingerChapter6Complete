package cc.phil.typcasting;

import cc.phil.artopening.Painter;
import cc.phil.rockband.*;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class TypCasting {
    public static void main(String[] args) {
        // Full access to all public members of class singer
        Singer singer = new Singer("Mick", "Mike", "Jagger", 72);
        singer.makeMusic();

        // Full acces to all public members of class person (IMPLIED UPCAST)
        Person person = singer;
        System.out.println(person.getFIRSTNAME());

        // Singer Ref-Variable still reference to instance Singer and has full public member access
        singer.makeMusic();

        // (EXPLIZIT DOWNCAST) from person to artist to get all public members of Class artist
        Artist artist = (Artist) person;
        System.out.println(artist.getArtistName());

        // (EXPLIZIT DOWNCAST)
        Singer sameSinger = (Singer) person;
        sameSinger.makeMusic();

        // Not compatibel
        // Guitarrist guitarrist = singer;

        // Set referenc var to singer object null
        singer = null;

        // Artist ref-var still has access to singer-instance even after singer ref-var set to null
        artist.getFIRSTNAME();

        // UPCASTING
        Musician mickTheMusician = new Singer("Mick", "Mike", "Jagger", 72);

        // Method-call class Person shop.As(Person person) (EXPLICIT UPCAST)
        mickTheMusician.shopAs((Person)mickTheMusician);
        // Method-call class Musician shop.As(Musician musician)
        mickTheMusician.shopAs(mickTheMusician);

        // Method-call class Person shop.As(Person person) even if mickTheMusician is Musician-instance
        //person.shopAs(mickTheMusician);
        mickTheMusician.shopAs(mickTheMusician);
        artist.shopAs(artist);

    }
}
