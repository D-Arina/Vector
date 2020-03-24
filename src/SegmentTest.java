import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SegmentTest {
    //Segment v = new Segment(1,2);
    Vector r = new Vectors2D(1,2);
    Vector s = new Vectors2D(1,2);
    Vector point = new Vectors2D(1,1);


    @Test
    void getStart(){
        assertEquals(1, r.getComponent(1));
    }

    @Test
    void getEnd(){
        assertEquals(2, r.getComponent(2));
    }

    @Test
    void len(){
        assertEquals(Math.sqrt(5), r.len(), 0.00001);
    }

    @Test
    void distanceTo(){
        Segment n = new Segment(r, s);
        assertEquals(1, n.distanceTo(point));
    }

}
