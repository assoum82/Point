/**
 * Created by chawki on 14/10/16.
 */
public class Main {


    public static void main(String[] args) {

        Point A = new Point();
        Point B = new Point(5);
        Point C = new Point(3, 8);


        System.out.println("L'image de A" + A.toString() + " est A-1(" + A.symetrie() + ";" + A.getOrdonnee() + ")");
        System.out.println("L'image de B" + B.toString() + " est B-1(" + B.symetrie() + ";" + B.getOrdonnee() + ")");
        System.out.println("L'image de C" + C.toString() + " est C-1(" + C.symetrie() + ";" + C.getOrdonnee() + ")");

    }
}
