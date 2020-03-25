public class Segment{
    private Vector v1;
    private Vector v2;


    public Segment() {
    }

    Segment(Vector v, Vector w){
        v1 = v;
        v2 = w;
    }


    public Vector getStart() {
        return v1;
    }
    public Vector getEnd(){
        return v2;
    }

    public double len(){
        Vector VecSum = v1.add(v2);
        double l = VecSum.len();
        return l;
    }

    public double distanceTo(Vector pointC) {
        Vector vectorAC = pointC.sub(v1);
        Vector vectorBC = pointC.sub(v2);
        Vector vectorAB = v1.sub(v2);
        double lengthAB = vectorAB.len();
        double lengthAC = vectorAC.len();
        double scalACAB = vectorAC.scalar(vectorAB);
        double scalBCAB = vectorBC.scalar(vectorAB);
        double cs = Math.sqrt(1-(scalACAB / (lengthAB*lengthAC))*(scalACAB / (lengthAB*lengthAC)));
        Vector vectorCH = vectorAB.multiply(cs);
        double res = vectorCH.len();
        double res1 = (pointC.sub(v1)).len();
        double res2 = (pointC.sub(v2)).len();
        if (scalACAB >= 0) return res1;
        if (scalBCAB <= 0) return res2;
        if (scalACAB > 0 && scalACAB > 0)
            return res;
        return 0.0;
    }
}


