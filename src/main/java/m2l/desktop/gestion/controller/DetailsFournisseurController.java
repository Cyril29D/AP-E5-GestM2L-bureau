package m2l.desktop.gestion.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import m2l.desktop.gestion.model.Climatiseur;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailsFournisseurController implements Initializable {
    @FXML
    private Label nom_fournisseur;
    @FXML
    private Label telephone_fournisseur;
    @FXML
    private Label adresse_fournisseur;


    public void mettre_a_jour_affichage(Climatiseur climatiseur)
    {
        System.out.println("Controlleur "+climatiseur);

        String nom=climatiseur.getFournisseur().getNom();
        String tel=climatiseur.getFournisseur().getTelephone();
        String adr=climatiseur.getFournisseur().getAdresse();

        nom_fournisseur.setText(nom);
        telephone_fournisseur.setText(tel);
        adresse_fournisseur.setText(adr);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}