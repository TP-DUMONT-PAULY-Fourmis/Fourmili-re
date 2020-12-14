
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

    public Terrain(int i, int j) {
        this.grille = new Cellule[i][j];
        for (int k = 0; k <= i; k++) {
            for (int l = 0; l <= j; l++) {
                if (k == 0 || k == i || l == 0 || l == j) {
                    this.grille[k][l] = new Cellule(1);
                } else {
                    this.grille[k][l] = new Cellule(0);
                }
            }
        }

    }
}