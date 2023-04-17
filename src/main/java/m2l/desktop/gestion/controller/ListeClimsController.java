package m2l.desktop.gestion.controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import m2l.desktop.gestion.SalleDescription;
import m2l.desktop.gestion.model.Climatiseur;
import m2l.desktop.gestion.model.Model_Clim;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListeClimsController implements Initializable {


    @FXML
    private TableView<Climatiseur> listeGClims;

    @FXML
    private TableColumn marque;

    @FXML
    public void ajoutClimatiseur(MouseEvent mouseEvent) throws IOException {

        Scene scene = (Scene) ((ImageView)mouseEvent.getSource()).getScene();
        Stage fenprinc = (Stage) scene.getWindow();

        Parent root;
        try
        {
            root = FXMLLoader.load(getClass().getResource("/m2l/desktop/gestion/formulaire_nouveau_climatiseur.fxml"));

            Scene scene_ajout = new Scene(root, 700, 700);


            Stage stage_ajout = new Stage();
            stage_ajout.setTitle("Ajouter une intervention dans une salle");
            stage_ajout.setScene(scene_ajout);
            stage_ajout.initOwner(fenprinc);
            stage_ajout.initModality(Modality.WINDOW_MODAL);
            stage_ajout.show();
        }
        catch (IOException ex)
        {
            Logger.getLogger(SalleDescription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //la marque pourra être modifiée
        marque.setCellFactory(TextFieldTableCell.forTableColumn());

        System.out.println("Initialiaze from ListClimController.");
        Model_Clim.connect_to_databse();
        Model_Clim.selectClimatiseurs();
        //association du tableView avec la liste observable
        //tout élément ajouter dans la liste observable sera automatiquement ajouté au tableView
        //tout élément supprimser de la liste observable sera automatiquement supprimé du tableView
        listeGClims.setItems(Model_Clim.getClimatiseurs());

        listeGClims.setEditable(true);
        ///lors d'un double clic sur un item (ligne) du tableView, on récupère le climatiseur sélectionné
        // et on le supprime du modèle
       listeGClims.setOnMouseClicked(new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent event) {
               //si on a pas effectué qu'un seul clic
               if (event.getClickCount() > 1) {
                   //récupération du climatiseur sélectionné
                   Climatiseur selectedItem = (Climatiseur) listeGClims.getSelectionModel().getSelectedItem();
                   Model_Clim.deleteClimatiseur(selectedItem.getId());
                   System.out.println("Suppression de l'item double-cliqué : "+selectedItem.marqueProperty().get());
                   //mise à jour du modèle
                   Model_Clim.getClimatiseurs().remove(selectedItem);
               }
           }
       });




    }


    public void suppressionClimatiseur(MouseEvent mouseEvent) {
        //récupération du climatiseur sélectionné
        Climatiseur selectedItem = (Climatiseur) listeGClims.getSelectionModel().getSelectedItem();

        Model_Clim.deleteClimatiseur(selectedItem.getId());

        System.out.println("Suppression de l'item double-cliqué : " + selectedItem.marqueProperty().get());

        //mise à jour du modèle
        Model_Clim.getClimatiseurs().remove(selectedItem);
    }

    public void modificationClimatiseur(TableColumn.CellEditEvent cellEditEvent) {
        System.out.println("La valeur est modifiée pour : "
                + cellEditEvent.getTableColumn().getText()
                + " = " + cellEditEvent.getNewValue().toString());

    }

    public void voirFournisseur(MouseEvent mouseEvent) {

        Climatiseur selectedItem = (Climatiseur) listeGClims.getSelectionModel().getSelectedItem();
        System.out.println("on a cliqué sur " + selectedItem);

        popupFournisseur(selectedItem);
    }

    private void popupFournisseur(Climatiseur c) {
        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/m2l/desktop/gestion/detailsFournisseur.fxml"));
        try {
            //chargement de la vue
            root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Fournisseur");
            stage.setScene(scene);
            stage.initOwner(listeGClims.getScene().getWindow());
            stage.initModality(Modality.WINDOW_MODAL);

            DetailsFournisseurController dfc = null;
            try {
                dfc = loader.getController();
                //appel de la méthode "ettre_a_jour_affichage" du contrôleur
                //cette méthode affiche les informations ddu climatiseur dans la vue
                dfc.mettre_a_jour_affichage(c);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            //affichage de la fenêtre
            stage.show();

        } catch (IOException ex) {
            System.err.println("Impossible de lancer la fenêtre popup.");
        }
    }

}


