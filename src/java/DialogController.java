import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class DialogController {
    @FXML
    private GridPane dialog;

    @FXML
    private TextField fldName;
    @FXML
    private TextField fldSurname;
    @FXML
    private TextField fldPhone;
    @FXML
    private TextField fldEmail;

    @FXML
    private void saveOnClick(){
        MatchModel.save(new Match(
                fldName.getText(),
                fldSurname.getText(),
                fldPhone.getText(),
                fldEmail.getText()
        ));
        fldName.clear();
        fldSurname.clear();
        fldEmail.clear();
        fldPhone.clear();
    }

    @FXML
    private void cancelOnClick(){
        Stage dlg = (Stage) dialog.getScene().getWindow();
        dlg.getOnCloseRequest().handle(new WindowEvent(dlg, WindowEvent.WINDOW_CLOSE_REQUEST));
        dlg.close();
    }
}
