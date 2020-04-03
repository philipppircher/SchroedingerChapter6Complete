package cc.phil.rockband;

public final class BackgoundSinger extends Singer {
    // Constructor
    //
    public BackgoundSinger(String artistName, String firstName, String surName, int age) {
        super(artistName, firstName, surName, age);
    }

    // Methodes
    //
    @Override
    public void makeMusic() {
        System.out.println("I looooove youuuuuu");
    }
}
