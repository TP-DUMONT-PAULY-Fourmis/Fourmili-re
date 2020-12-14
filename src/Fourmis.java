/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Fourmis {
    private int ligne;
    private int colonne;
    private int etat; //0: va chercher de la nourriture - 1 : rentre à la fourmilière avec de la nourriture
    private int energie; //pourcentage d'énergie
    
    public Fourmis(int i,int j,int etat){
        this.colonne=i;
        this.ligne=j;
        this.etat = etat;
        this.energie = 100;
    }

    public int getEtat() {
        return etat;
    }

    public int getEnergie() {
        return energie;
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }
    
    public void seDeplace(int i,int j){ //si i=+1 on passe à la colonne de droite - si j=-1 on passe à la ligne du haut
        this.setColonne(this.getColonne()+i);
        this.setLigne(this.getLigne()+j);
    }
    
}
