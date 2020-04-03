package cc.phil.rockband;

import java.util.ArrayList;

public final class RehearsalRoom {
    public static void main(String[] args) {
        // Unused  Musicians in a band instance (Used with local Method .makeMusic())
        Trumpeter trumpeterRollingStones = new Trumpeter
                ("TheTrump", "Donald", "Trump", 57);
        BackgoundSinger backgoundSingerRollingStones = new BackgoundSinger
                ("HerVoice", "Frieda", "XYZ", 20);

        // Used Musicians in a Band
        // Band - Loomis
        Singer singerLoomis = new Singer("HisVoice", "Fred", "Mercury", 33);
        Guitarrist guitarristLoomis = new Guitarrist
                ("GutitarHero", "Hero", "Guittar", 27);
        Bassist bassistLoomis = new Bassist("Base", "Bass", "Olomeus", 25);
        ArrayList<Song> songsForLoomis = new ArrayList<Song>();
        songsForLoomis.add(new Song("Wicked Child"));
        songsForLoomis.add(new Song("Heart of fire"));
        songsForLoomis.add(new Song("Praying Hands"));
        Band loomisBand = new Band("Loomis", singerLoomis, guitarristLoomis, bassistLoomis, songsForLoomis);

        // Band - U2
        Singer singerU2 = new Singer("BonoVox", "Bono", "Vox", 50);
        Guitarrist guitarristU2 = new Guitarrist("TheEdge", "Paul", "Newman", 55);
        Bassist bassistU2 = new Bassist("Mack", "Mickey", "Rourke", 45);
        ArrayList<Song> songsForU2 = new ArrayList<Song>();
        songsForU2.add(new Song("Where the Streets have no name"));
        songsForU2.add(new Song("With or without you"));
        songsForU2.add(new Song("Jerusalem"));
        Band u2Band = new Band("U2", singerU2, guitarristU2, bassistU2, songsForU2);

        // Band - Rolling Stones
        Singer singerRollingStones = new Singer("Mick", "Mick", "Jagger", 50);
        Guitarrist guitarristRollingStones = new Guitarrist
                ("Keith", "Keith", "Richards", 60);
        Bassist bassistRollingStones = new Bassist("Fog", "G1fa", "Gial", 75);
        ArrayList<Song> songsForRollingStones = new ArrayList<Song>();
        songsForRollingStones.add(new Song("Angie"));
        songsForRollingStones.add(new Song("Anybody see my baby"));
        songsForRollingStones.add(new Song("Paint it black"));
        Band rollingStonesBand = new Band("Rollings Stones", singerRollingStones, guitarristRollingStones,
                bassistRollingStones, songsForRollingStones);

        makeMusicTogether(singerRollingStones, guitarristRollingStones,
                bassistRollingStones, trumpeterRollingStones, backgoundSingerRollingStones);

        // Add songs and print song repertoire
        loomisBand.setSong(new Song("Mad Forest"));
        loomisBand.playRepertoire();

        u2Band.setSong(new Song("Helter Skelter"));
        u2Band.playRepertoire();

        rollingStonesBand.setSong(new Song("I cant get no satisfaction"));
        rollingStonesBand.playRepertoire();

        // Competition winner announcment
        Competition musicCompetition = new Competition("Sing my Song");
        musicCompetition.addParticipantToCompetition(singerU2);
        musicCompetition.addParticipantToCompetition(singerLoomis);
        musicCompetition.addParticipantToCompetition(guitarristLoomis);
        musicCompetition.addParticipantToCompetition(bassistRollingStones);

        System.out.println(musicCompetition.getNameOfCompetition());
        Musician musicianWinnerOfCompetition = musicCompetition.announceWinner();
        System.out.println("Der Gewinner ist : " + musicianWinnerOfCompetition.getArtistName());
        musicianWinnerOfCompetition.makeMusic();
        musicianWinnerOfCompetition.printMusicianData();
    }

    private static void makeMusicTogether(Musician... group) {
        for (Musician musician : group) {
            musician.makeMusic();
            musician.printMusicianData();
        }
    }
}
