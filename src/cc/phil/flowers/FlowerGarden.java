package cc.phil.flowers;

public class FlowerGarden {
    public static void main(String[] args) {
        Flower flower = new Flower();
        RedRose rose = new RedRose();
        Tulip tulip = new Tulip();

        flower.smellOnIt();
        rose.smellOnIt();
        tulip.smellOnIt();
    }
}
