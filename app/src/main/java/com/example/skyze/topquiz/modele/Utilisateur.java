package com.example.skyze.topquiz.modele;

public class Utilisateur {

    private String mNom;


    public Utilisateur() {

    }

    public void setNom(String mNom) {
        this.mNom = mNom;
    }

    public String getNom() {

        return mNom;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "mNom='" + mNom + '\'' +
                '}';
    }
}
