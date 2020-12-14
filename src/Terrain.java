
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
public class Terrain {

    private Cellule[][] grille;
    private int tailleX;
    private int tailleY;

    public Terrain(int i, int j) {
        this.grille = new Cellule[i][j];
        this.tailleX = i;
        this.tailleY = j;
        for (int k = 0; k <= i - 1; k++) {
            for (int l = 0; l <= j - 1; l++) {
                if (k == 0 || k == i - 1 || l == 0 || l == j - 1) {
                    this.grille[k][l] = new Cellule(1);
                } else {
                    this.grille[k][l] = new Cellule(0);
                }
            }
        }

    }

    public void setCellule(int i, int j, int etat) {
        if (this.tailleX - 1 >= i && this.tailleY - 1 >= j) {
            this.grille[i][j] = new Cellule(etat);
        }
    }

    public String toString() {
        String chaine = "";
        int i = this.tailleX;
        int j = this.tailleY;
        for (int l = 0; l <= j - 1; l++) {
            chaine += "\n";
            for (int k = 0; k <= i - 1; k++) {
                chaine += this.grille[k][l].toString();
            }
        }
        return chaine;
    }

    public Cellule[][] getGrille() {
        return grille;
    }

    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }
}
