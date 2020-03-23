import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Vectors3DTest {
    Vectors3D V1 = new Vectors3D(2, 4, 5);
    Vectors3D V2 = new Vectors3D(2, 4, 5);
    Vectors3D VM = new Vectors3D(4, 16, 25);
    Vectors3D VA = new Vectors3D(4, 8, 10);
    Vectors3D VS = new Vectors3D(0, 0, 0);


    @Test
    void testGetX() {
        assertEquals( 2, V1.getX(),0.00001);
    }

    @Test
    void testGetY() {
        assertEquals( 4, V1.getY(), 0.00001);
    }

    @Test
    void testGetZ() {
        assertEquals( 5, V1.getZ(),0.00001);
    }

    @Test
    void testScalarV() {
        //double S = V1.scalarV(V2);
        assertEquals( 45, V1.scalarV(V2) ,0.001);
    }

    @Test
    void testLen() {
        //double L = V2.len();
        //double Sq = Math.sqrt(45);
        assertEquals( Math.sqrt(45) , V2.len(), 0.00001);
    }

    @Test
    void testMultiply() {
        Vectors3D Vec = V2.multiply(V1);
//        double x = Vec.getX();
//        assertEquals(x , 4, 0.00001);
//        double y = Vec.getY();
//        assertEquals(y , 16, 0.00001);
//        double z = Vec.getZ();
//        assertEquals(z , 25, 0.00001);
        assertEquals(VM , Vec);
    }

    @Test
    void testAdd() {
        Vectors3D Vec = V2.add(V1);
//        double x = Vec.getX();
//        assertEquals(x , 4, 0.00001);
//        double y = Vec.getY();
//        assertEquals(y , 8, 0.00001);
//        double z = Vec.getZ();
//        assertEquals(z , 10, 0.00001);
        assertEquals(VA , V2.add(V1));
    }

    @Test
    void testSub() {
        Vectors3D Vec = V2.sub(V1);
//        double x = Vec.getX();
//        assertEquals(x , 0, 0.00001);
//        double y = Vec.getY();
//        assertEquals(y , 0, 0.00001);
//        double z = Vec.getZ();
//        assertEquals(z , 0, 0.00001);
        assertEquals(VS , V2.sub(V1));
    }

}
