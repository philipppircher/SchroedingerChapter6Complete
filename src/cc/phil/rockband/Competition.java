package cc.phil.rockband;

import java.util.ArrayList;
import java.util.Random;

public class Competition {
    // Membervariables
    //
    private String nameOfCompetition;
    private ArrayList<Musician> participantList = new ArrayList<>();

    // Constructor
    //
    public Competition(String nameOfCompetition) {
        this.nameOfCompetition = nameOfCompetition;
    }

    // Methodes
    //
    public void addParticipantToCompetition(Musician musician) {
        participantList.add(musician);
    }

    public Musician announceWinner() {
        Musician winnerMusician;
        Random rand = new Random();
        int randomIndex = rand.nextInt(participantList.size());
        winnerMusician = participantList.get(randomIndex);
        return winnerMusician;
    }

    // Getter
    //
    public String getNameOfCompetition() {
        return nameOfCompetition;
    }
}
