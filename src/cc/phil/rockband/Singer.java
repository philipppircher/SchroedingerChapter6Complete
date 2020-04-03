package cc.phil.rockband;

public class Singer extends Musician {
    // Constructor
    //
    public Singer(String artistName, String firstName, String surName, int age) {
        super(artistName, firstName, surName, age);
    }

    // Methodes
    //
    @Override
    public void makeMusic() {
        System.out.println("Yooouu aaaree sooo beauuuutifuuuuul");
    }
}