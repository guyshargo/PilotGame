package GUI.AreYou;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class gameController {
    @FXML private Button yesButton;
    @FXML private Button noButton;

    private final Random randomLocation = new Random();

    @FXML
    private void handleYes() {
        Stage stage = (Stage) yesButton.getScene().getWindow();
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 400, 300);
        Text congratsText = new Text(140, 150, "Congrats faggot");
        root.getChildren().add(congratsText);
        stage.setScene(scene);
    }

    @FXML
    private void handleNoButtonHover() {
        double newX = randomLocation.nextDouble() * (noButton.getScene().getWidth() - noButton.getWidth());
        double newY = randomLocation.nextDouble() * (noButton.getScene().getHeight() - noButton.getHeight());
        noButton.setLayoutX(newX);
        noButton.setLayoutY(newY);
    }
}
