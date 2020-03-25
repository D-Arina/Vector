import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SegmentTest {
    //Segment v = new Segment(1,2);
    Vector v1 = new Vectors2D(1,0);
    Vector v2 = new Vectors2D(2,0);
    Vector point = new Vectors2D(4,4);


    @Test
    void getStart(){
        assertEquals(1, v1.getComponent(1));
    }

    @Test
    void getEnd(){
        assertEquals(0, v1.getComponent(2));
    }

    @Test
    void len(){
        assertEquals(Math.sqrt(1), v1.len(), 0.00001);
    }

    @Test
    void distanceTo(){
        Segment n = new Segment(v1, v2);
        Vector point1 = new Vectors2D(0,0);
        Vector point2 = new Vectors2D(1,1);
        Vector point3 = new Vectors2D(4,0);

//        double z = n.distanceTo(point3);

        assertEquals(1, n.distanceTo(point1));
        assertEquals(2, n.distanceTo(point3));
        assertEquals(1, n.distanceTo(point2));


//        Vector vectorAC = point.sub(v1);
//        Vector vectorBC = point.sub(v2);
//        Vector vectorAB = v1.sub(v2);
//        double lengthAB = vectorAB.len();
//        double lengthAC = vectorAC.len();
//        double scalACAB = vectorAC.scalar(vectorAB);
//        double scalBCAB = vectorBC.scalar(vectorAB);
//        double cs = Math.sqrt(1-(scalACAB / (lengthAB*lengthAC))*(scalACAB / (lengthAB*lengthAC)));
//        Vector vectorCH = vectorAB.multiply(cs);
//        double res = vectorCH.len();
//        double res1 = (point.sub(v1)).len();
//        double res2 = (point.sub(v2)).len();
//        if (scalACAB <= 0) assertEquals(Math.sqrt(18), res1, 0.001);
//        if (scalBCAB <= 0) assertEquals(res2, res2);
//        if (scalACAB > 0 && scalACAB > 0)
//          assertEquals(res,res );
//
//        assertEquals(3, n.distanceTo(point), 0.00001);


    }

}
