public class Main {

    public static void main(String[] args) {
        Vectors3D V1 = new Vectors3D(2, 3, 5);
        Vectors3D V2 = new Vectors3D(2, 3, 5);
        double scal = V1.scalarV(V2);
        double lenn = V1.len();
        Vectors3D ad = V1.add(V2);
        Vectors3D subb = V1.sub(V2);


    }

}
