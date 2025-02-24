package GUI.Yes;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Platform;

public class yesPageController {

    @FXML private Text congratsText;

    @FXML
    public void initialize() {
        // Close the game after 4 seconds
        new Thread(() -> {
            try {
                Thread.sleep(4000); // 4 seconds delay
                Platform.runLater(() -> {
                    Stage stage = (Stage) congratsText.getScene().getWindow();
                    stage.close(); // Close the window
                }
                );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
