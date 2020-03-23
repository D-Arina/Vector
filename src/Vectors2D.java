public class Vectors2D implements Vector{
    private double x1;
    private double y1;

    Vectors2D(double x, double y){
        x1 = x;
        y1 = y;
    }

    @Override
    public int dimension() {
        return 2;
    }

    @Override
    public double getComponent(int i) {
        switch (i) {
            case 1:
                return x1;
            case 2:
                return y1;
            default:
                return 0;
        }
    }

    @Override
    public double scalar(Vector v) {
        double scalar = (x1 * v.getComponent(1)) + (y1 * v.getComponent(2));
        return scalar;
    }

    @Override
    public double len() {
        return Math.sqrt(scalar(this));
    }

    @Override
    public Vector multiply(double factor) {
        return new Vectors2D(x1 * factor, y1 * factor);
    }

    @Override
    public Vector add(Vector v) {
        return new Vectors2D(x1 + v.getComponent(1), y1 + v.getComponent(2));
    }

    @Override
    public Vector sub(Vector v) {
        return new Vectors2D(x1 - v.getComponent(1), y1 - v.getComponent(2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vectors2D vectors2D = (Vectors2D) o;

        if (Double.compare(vectors2D.x1, x1) != 0) return false;
        return Double.compare(vectors2D.y1, y1) == 0;
    }

}
