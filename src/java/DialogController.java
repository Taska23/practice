import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class DialogController {
    @FXML
    private GridPane dialog;

    @FXML
    private TextField fldft;
    @FXML
    private TextField fldst;
    @FXML
    private TextField fldsc;
    @FXML
    private TextField flddt;

    @FXML
    private void saveOnClick(){
        MatchModel.save(new Match(
                fldft.getText(),
                fldst.getText(),
                fldsc.getText(),
                flddt.getText()
        ));
        fldft.clear();
        fldst.clear();
        flddt.clear();
        fldsc.clear();
    }

    @FXML
    private void cancelOnClick(){
        Stage dlg = (Stage) dialog.getScene().getWindow();
        dlg.getOnCloseRequest().handle(new WindowEvent(dlg, WindowEvent.WINDOW_CLOSE_REQUEST));
        dlg.close();
    }
}
