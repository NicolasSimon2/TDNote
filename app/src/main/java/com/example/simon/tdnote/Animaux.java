package com.example.simon.tdnote;

/**
 * Created by simon on 23/11/2016.
 */

public class Animaux {

    private String imageName;
    private String nom;
    private String espece;
    private String note;

    public String getImageName() {
        return imageName;
    }

    public String getNom() {
        return nom;
    }

    public String getEspece() {
        return espece;
    }

    public String getNote() {
        return note;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public void  setNote(String note) { this.note = note; }
}
