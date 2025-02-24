package GUI.AreYou;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;

public class gameController {
    @FXML private Button yesButton;
    @FXML private Button noButton;

    //
    private final Random randomLocation = new Random();

    @FXML
    private void handleYes() {
        try {
            Stage stage = (Stage) yesButton.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/GUI/Yes/yesPage.fxml"));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleNoButtonHover() {
        double minX = 100; // Left boundary
        double maxX = 300; // Right boundary
        double minY = 130; // Top boundary (below the title)
        double maxY = 230; // Bottom boundary

        // Generate random coordinates for 'No' button
        double newX = minX + randomLocation.nextDouble() * (maxX - minX);
        double newY = minY + randomLocation.nextDouble() * (maxY - minY);

        noButton.setLayoutX(newX);
        noButton.setLayoutY(newY);
    }

}
