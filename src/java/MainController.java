import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController {

    @FXML
    private VBox mainWindow;

    @FXML
    private ListView<Match> lstMatches;
    private ObservableList<Match> matches;

    @FXML
    private void initialize(){
        matches = FXCollections.observableArrayList(MatchModel.getMatches());
        lstMatches.setItems(matches);
    }

    @FXML
    private void addContactDialog() throws IOException {
        Stage dlgNewContact = new Stage();
        dlgNewContact.setTitle("Добавление Матча");
        dlgNewContact.setResizable(false);
        GridPane dlgView = FXMLLoader.load(
                getClass().getResource("/modal/dialog.fxml")
        );
        dlgNewContact.setScene(new Scene(dlgView));
        dlgNewContact.initOwner(mainWindow.getScene().getWindow());
        dlgNewContact.initModality(Modality.WINDOW_MODAL);
        dlgNewContact.setOnCloseRequest(event -> {
            matches.setAll(MatchModel.getMatches());
            lstMatches.refresh();
        });
        dlgNewContact.showAndWait();
    }

    @FXML
    private void closeOnClick(){
        System.exit(0);
    }

}
