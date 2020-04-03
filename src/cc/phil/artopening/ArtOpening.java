package cc.phil.artopening;

public class ArtOpening {
    public static void main(String[] args) {
        Painter painterLeonardo = new Painter
                ("Leo", "Leonardo", "Davinci", 245, "Mona Lisa");
        Painter painterMichelangelo = new Painter
                ("Michel", "Michelangelo", "Buonarroti", 177, "The Creation of Adam");
        Painter painterRubens = new Painter
                ("Ruby", "Peter Paul", "Rubens", 100, "Love Garden");

        System.out.println("Vernisage 2020");
        printPaintersWithPicture(painterLeonardo, painterMichelangelo, painterRubens);
    }

    private static void printPaintersWithPicture(Painter... groupOfPainters) {
        for (Painter painter : groupOfPainters) {
            System.out.println(painter.getArtistName() + " mit dem Gemälde: " + painter.getPictureArtWork());
        }
    }
}
