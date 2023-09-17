public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
    
    public double getSide() {
        return super.getWidth(); // or super.getHeight(), as they are the same
    }

}
