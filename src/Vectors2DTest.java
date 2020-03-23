import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Vectors2DTest {
    Vectors2D v = new Vectors2D(1, 2);
    Vectors2D s = new Vectors2D(1, 2);
    Vectors2D vm = new Vectors2D(2, 4);
    Vectors2D vsa = new Vectors2D(2,4);
    Vectors2D vss = new Vectors2D(0,0);

    @Test
    void dimension(){
        assertEquals(2, v.dimension(), 0.00001);
    }

    @Test
    void getComponent(){
        assertEquals(1, v.getComponent(1), 0.00001);
        assertEquals(2, v.getComponent(2), 0.00001);
    }

    @Test
    void scalar(){
        assertEquals(5, v.scalar(s), 0.00001);
    }

    @Test
    void len(){
        assertEquals( Math.sqrt(5) , v.len(), 0.00001);
    }

    @Test
    void multiply(){
        Vectors2D Vec = (Vectors2D) v.multiply(2);
        assertEquals(vm, Vec);
    }

    @Test
    void add(){
        Vectors2D vec = (Vectors2D) v.add(s);
        assertEquals(vsa, vec);
    }

    @Test
    void sub(){
        Vectors2D vec = (Vectors2D) v.sub(s);
        assertEquals(vss, vec);
    }
}
