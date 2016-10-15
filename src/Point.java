
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
/* Created by Asmaa Bengueddach */
    //calcule de limage justement c'est la création d'un nouveau point 
    public Point symetrie() {
        return new (-this.abscisse,ordonnee);
    }

    //affichage du point (x,y)
    @Override
    public String toString() {
        return "(" + getAbscisse() + ";" + getOrdonnee() + ")";
    }
}
