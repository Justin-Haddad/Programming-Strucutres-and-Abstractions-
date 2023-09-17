import java.util.Random;

public class RandomPlayer extends Player {

    private Random generator;

    public RandomPlayer(String name) {
        super(name);
        generator = new Random();
    }

    @Override
    public int[] getMove(int[] pileSizes) {
        int index, number = 0;
        do {
            index = generator.nextInt(pileSizes.length);
        } while (pileSizes[index] == 0);
        number = generator.nextInt(pileSizes[index]) + 1;
        return new int[] {index, number};
    }

}
