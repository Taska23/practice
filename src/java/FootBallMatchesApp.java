import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FootBallMatchesApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Лист Матчей");
        primaryStage.setResizable(false);

        Parent main = FXMLLoader.load(
                getClass().getResource("main.fxml")
        );

        primaryStage.setScene(new Scene(main));
        primaryStage.show();
    }
}
