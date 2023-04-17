package m2l.desktop.gestion.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Climatiseur {

    private int id;
    private String batiment;
    private String nomSalle;

    private int conso;
    private int niveau_sonore;
    private String classe;

    private Fournisseur fournisseur;

    private StringProperty marque;
    private StringProperty modele;
    private IntegerProperty puissance;
    //exercice
    private IntegerProperty surfaceMin;
    private IntegerProperty surfaceMax;

    public Climatiseur(String marque, String modele, int puissance) {
        this.puissanceProperty().set(puissance);
        this.marqueProperty().set(marque);
        this.modeleProperty().set(modele);

        //exercice
        this.surfaceMinProperty().set(getSurfaceMinCouverte());
        this.surfaceMaxProperty().set(getSurfaceMaxCouverte());

    }

    public Climatiseur(int i,String mar, String mod, int pui, int smi, int sma) {
        this.setMarque( mar);
        this.setModele( mod);
        this.setPuissance(pui);
        this.setSurfaceMax(sma);
        this.setSurfaceMin(smi);
        this.id = i;

        this.fournisseur= new Fournisseur("Carrefour de l'énergie","lot Bardinet Dillon, 97200 Fort de France" ,"+596 5 96 65 10 10");

    }

    public int getSurfaceMaxCouverte() {
        switch (puissanceProperty().get()) {
            case 7000:
                return 15;
            case 9000:
                return 25;
            case 12000:
                return 35;
            case 18000:
                return 50;
            case 24000:
                return 70;
            case 30000:
                return 80;
        }
        return 0;
    }

    public int getSurfaceMinCouverte() {
        switch (puissanceProperty().get()) {
            case 7000:
                return 7;
            case 9000:
                return 15;
            case 12000:
                return 25;
            case 18000:
                return 35;
            case 24000:
                return 50;
            case 30000:
                return 70;
        }
        return 0;
    }

    public List<Integer> getSurfaceCouverte() {


        List<Integer> surfaces = new ArrayList<>(2);

        switch (puissanceProperty().get()) {
            case 7000:
                surfaces.add(7);
                surfaces.add(15);
                break;
            case 9000:
                surfaces.add(15);
                surfaces.add(25);
                break;
            case 12000:
                surfaces.add(25);
                surfaces.add(35);
                break;
            case 18000:
                surfaces.add(35);
                surfaces.add(50);
                break;
            case 24000:
                surfaces.add(50);
                surfaces.add(70);
                break;
            case 30000:
                surfaces.add(70);
                surfaces.add(80);
                break;
            default:
                surfaces.add(7);
                surfaces.add(15);
                break;
        }
        return surfaces;
    }


    public StringProperty marqueProperty() {
        if (marque == null) marque = new SimpleStringProperty(this, "marque");
        return marque;
    }

    public StringProperty modeleProperty() {
        if (modele == null) modele = new SimpleStringProperty(this, "modele");
        return modele;
    }

    public IntegerProperty puissanceProperty() {
        if (puissance == null) puissance = new SimpleIntegerProperty(this, "puissance");
        return puissance;
    }


    public int getPuissance() {
        return puissanceProperty().get();
    }

    public String getMarque() {
        return marqueProperty().get();
    }

    public String getModele() {
        return modeleProperty().get();
    }

    public void setPuissance(int puissance) {
        puissanceProperty().setValue(puissance);
    }

    public void setMarque(String marque) {
        marqueProperty().setValue(marque);
    }

    public void setModele(String modele) {
        modeleProperty().setValue(modele);
    }

    //exercice



    public IntegerProperty surfaceMinProperty() {
        if (surfaceMin == null) surfaceMin = new SimpleIntegerProperty(this, "surfaceMin");
        return surfaceMin;
    }

    public IntegerProperty surfaceMaxProperty() {
        if (surfaceMax == null) surfaceMax = new SimpleIntegerProperty(this, "surfaceMax");
        return surfaceMax;
    }

    public int getSurfaceMin() {
        return surfaceMinProperty().get();
    }

    public int getSurfaceMax() {
        return surfaceMaxProperty().get();
    }

    public void setSurfaceMin(int surfaceMin) {
        this.surfaceMinProperty().setValue(surfaceMin);
    }

    public void setSurfaceMax(int surfaceMax) {
        this.surfaceMaxProperty().setValue(surfaceMax);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public int getConso() {
        return conso;
    }

    public void setConso(int conso) {
        this.conso = conso;
    }

    public int getNiveau_sonore() {
        return niveau_sonore;
    }

    public void setNiveau_sonore(int niveau_sonore) {
        this.niveau_sonore = niveau_sonore;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}