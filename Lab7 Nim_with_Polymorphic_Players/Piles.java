import java.util.Arrays;

public class Piles {
    private int[] sizes;

    public Piles(int... sizes) {
        if (sizes == null || sizes.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int size : sizes) {
            if (size <= 0) {
                throw new IllegalArgumentException();
            }
        }
        this.sizes = sizes.clone();
    }

    public int[] getSizes() {
        return sizes.clone();
    }

    public void removeObjects(int[] move) throws IllegalMoveException {
    	if (move == null) {
            throw new IllegalMoveException("null move");
        }
        if (move.length != 2) {
            throw new IllegalMoveException("Invalid length: " + move.length);
        }
        int index = move[0];
        int number = move[1];
        if (index < 0 || index >= sizes.length) {
            throw new IllegalMoveException("Index out of bounds: " + index);
        }
        if (sizes[index] == 0) {
            throw new IllegalMoveException("Pile " + index + " is empty.");
        }
        if (number <= 0) {
            throw new IllegalMoveException("Nonpositive object number: " + number);
        }
        if (number > sizes[index]) {
            throw new IllegalMoveException("Object number greater than pile size: " + number + " > " + sizes[index]);
        }
        sizes[index] -= number;
    
    }
    
    public boolean isEmpty() {
        int totalObjects = 0;
        for (int size : sizes) {
            totalObjects += size;
        }
        return totalObjects == 0;
    }
}
