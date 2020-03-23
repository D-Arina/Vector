public class Vectors3D implements Vector {
    private double x1;
    private double y1;
    private double z1;

    //private Vector vector;

    Vectors3D(double x, double y, double z){
        x1 = x;
        y1 = y;
        z1 = z;
    }

    @Override
    public int dimension() {

        return 3;
    }

    @Override
    public double getComponent(int i) {
        switch (i) {
            case 1:
                return getX();
            case 2:
                return getY();
            case 3:
                return getZ();
            default:
                return 0;
        }

    }

    @Override
    public Vector multiply(double factor) {
        return new Vectors3D(x1 * factor, y1 * factor, z1 *factor);
    }

    @Override
    public Vector add(Vector v) {
        return new Vectors3D(x1 + v.getComponent(1), y1 + v.getComponent(2), z1 + v.getComponent(3));
    }

    @Override
    public Vector sub(Vector v) {
        return new Vectors3D(x1 - v.getComponent(1), y1 - v.getComponent(2), z1 - v.getComponent(3));
    }

    @Override
    public double scalar(Vector v) {
        return (x1 * v.getComponent(1)) + (y1 * v.getComponent(2)) + (z1 * v.getComponent(3));
    }

    public double getX() {
        return x1;
    }
    public double getY() {
        return y1;
    }
    public double getZ() {
        return z1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vectors3D vectors3D = (Vectors3D) o;

        if (Double.compare(vectors3D.x1, x1) != 0) return false;
        if (Double.compare(vectors3D.y1, y1) != 0) return false;
        return Double.compare(vectors3D.z1, z1) == 0;
    }




    public double scalarV(Vectors3D V) {
        double scalar = (x1 * V.getX()) + (y1 * V.getY()) + (z1 * V.getZ());
        return scalar;
    }

    public double len() {
        return Math.sqrt(scalarV(this));
    }

    public Vectors3D multiply(Vectors3D V){
        double newX = x1 * V.getX();
        double newY = y1 * V.getY();
        double newZ = z1 * V.getZ();
        Vectors3D newV = new Vectors3D(newX, newY, newZ);
        return newV;
    }
    public Vectors3D add(Vectors3D v) {
        double newVX = x1 + v.getX();
        double newVY = y1 + v.getY();
        double newVZ = z1 + v.getZ();
        Vectors3D newV = new Vectors3D(newVX, newVY, newVZ);
        return newV;
    }
    public Vectors3D sub(Vectors3D v) {
        double newVX = x1- v.getX();
        double newVY = y1- v.getY();
        double newVZ = z1- v.getZ();
        Vectors3D newV = new Vectors3D(newVX, newVY, newVZ);
        return newV;
    }
    // public Vectors3D eq(Vectors3D v) {


}
