import org.omg.CORBA.Object;

import java.util.Objects;

/**
 * Created by chawki on 14/10/16.
 */
public class Point {
    private int abscisse;
    private int ordonnee;

    //constructeur par defaut
    Point() {
        this.abscisse = 0;
        this.ordonnee = 0;
    }

    //constructeur de point symetrique
    Point(int x) {
        this.abscisse = x;
        this.ordonnee = x;
    }

    //constructeur
    Point(int x, int y) {
        this.abscisse = x;
        this.ordonnee = y;
    }

    //retoune la valeur de l'axe des x
    public int getAbscisse() {
        return abscisse;
    }


    //retoune la valeur de l'axe des y
    public int getOrdonnee() {
        return ordonnee;
    }

    //calcule de limage
    public int symetrie() {
        return -this.abscisse;
    }

    //affichage du point (x,y)
    @Override
    public String toString() {
        return "(" + getAbscisse() + ";" + getOrdonnee() + ")";
    }
}
