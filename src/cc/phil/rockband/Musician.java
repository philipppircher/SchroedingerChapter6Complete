package cc.phil.rockband;

public class Musician extends Artist {
    // Constructor
    //
    public Musician(String artistName, String firstName, String surName, int age) {
        super(artistName, firstName, surName, age);
    }

    // Methodes
    //
    public void makeMusic(){
        System.out.println("OO Mmmmmmmh, OO Mmmmmmmh");
    }

    public void printMusicianData(){
        System.out.println("Künstlername: " + getArtistName());
        System.out.println("Vorname: " + getFIRSTNAME());
        System.out.println("Nachname: " + getSURNAME());
        System.out.println("Alter: " + getAge());
        System.out.println();
    }

    // used in TypCasting.java
    //
    public void shopAs(Musician musician){
        System.out.println("Einkaufen als Musiker");
    }
}