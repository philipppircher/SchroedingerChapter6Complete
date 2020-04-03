package cc.phil.rockband;

public final class Bassist extends Musician {
    // Constructor
    //
    public Bassist(String artistName, String firstName, String surName, int age) {
        super(artistName, firstName, surName, age);
    }

    // Methodes
    //
    @Override
    public void makeMusic() {
        System.out.println("Diummmm diumm diummm");
    }
}
