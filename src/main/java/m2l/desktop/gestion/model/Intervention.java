/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2l.desktop.gestion.model;

import java.sql.Date;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author nathalie
 */
public class Intervention
{
    public Date date;

    private String motif;
    private String statut;

    public Intervention() {

    }

    public Intervention(String motif, String statut) {
        this.motif = motif;
        this.statut = statut;
    }


    public Intervention( String motif, String statut,Date date) {
        this.date = date;
        this.motif = motif;
        this.statut = statut;
    }

    public Intervention(String m)
    {
        this.motif= m;
    }

    public Intervention(String motif, Date date) {
        this.date = date;
        this.motif = motif;
    }

    public String getMotif() {
        return motif;
    }



    public void setMotif(String motif) {
        this.motif=motif;
    }

    public SimpleStringProperty getMotifProperty() {
        return new SimpleStringProperty(this.motif);
    }

    public SimpleStringProperty getDateProperty() {return new SimpleStringProperty(this.date.toString());}




    /**SITUATION A : Finalisation de l’affichage l’onglet « Interventions du jour ».**/
    public SimpleStringProperty getStatutProperty() {
        return new SimpleStringProperty(this.statut);
    }



}
