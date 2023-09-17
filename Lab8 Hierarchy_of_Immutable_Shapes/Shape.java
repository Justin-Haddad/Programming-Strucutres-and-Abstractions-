public abstract class Shape implements Comparable<Shape> {
    private static int nextID = 0;
    private final int id;

    public Shape() {
        id = nextID++;
    }

    public int getID() {
        return id;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public int compareTo(Shape other) {
        int nameCompare = this.getClass().getSimpleName().compareTo(other.getClass().getSimpleName());
        if (nameCompare != 0) {
            return nameCompare;
        }

        int perimeterCompare = Double.compare(this.getPerimeter(), other.getPerimeter());
        if (perimeterCompare != 0) {
            return perimeterCompare;
        }

        return Double.compare(this.getArea(), other.getArea());
    }
}
