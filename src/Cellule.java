/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Cellule {

    private int etat; // 0 : vide -- 1 : occupée -- 2 : obstacle -- 3 : nourriture -- 4 : fourmiliere
    private int pheromones; // nombre entre 0 et 100 pourcentage de phéromones

    public Cellule(int etat) {
        this.etat = etat;
        this.pheromones = 0;
    }

    public int getEtat() {
        return etat;
    }

    public int getPheromones() {
        return pheromones;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setPheromones(int pheromones) {
        this.pheromones = pheromones;
    }

   
    public String toString() {
        String representation="";
        if (this.etat == 0) {
            representation = "_";
        }
        if (this.etat == 1) {
            representation = "O";
        }
        if (this.etat == 2) {
            representation = "X";
        }
        if (this.etat == 3) {
            representation = "N";
        }
        if (this.etat == 4) {
                representation = "F";   
        } 

        return representation;
    }

}
