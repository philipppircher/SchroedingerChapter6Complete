package cc.phil.rockband;

public final class Trumpeter extends Musician {
    // Constructor
    //
    public Trumpeter(String artistName, String firstName, String surName, int age) {
        super(artistName, firstName, surName, age);
    }

    // Methodes
    //
    @Override
    public void makeMusic() {
        System.out.println("Töööötaaaaaa");
    }
}
