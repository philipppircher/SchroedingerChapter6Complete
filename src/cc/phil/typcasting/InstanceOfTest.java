package cc.phil.typcasting;

import cc.phil.rockband.*;

public class InstanceOfTest {
    public static void main(String[] args) {
        Person pPerson = new Person("", "", 1);
        Person pArtist = new Artist("", "", "", 1);
        Person pMusician = new Musician("", "", "",1);
        Person pSinger = new Singer("", "", "", 1);
        Artist aArtist= new Artist("","", "", 1);
        Artist aMusician = new Musician("", "", "", 1);
        Artist aSinger = new Singer("", "", "", 1);
        Musician mMusician = new Musician("", "", "",1);
        Musician mSinger = new Singer("", "", "", 1);

        // instanceof-operator Test
        if (mMusician instanceof Musician){     // result == true
            System.out.println("true");
            mMusician.makeMusic();
        } else {
            System.out.println("false");
        }
    }
}
