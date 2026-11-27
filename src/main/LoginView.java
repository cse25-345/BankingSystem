import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView extends Application {

    private TextField usernameField;
    private PasswordField passwordField;
    private Label messageLabel;

    @Override
    public void start(Stage stage) {

        Label title = new Label("BANKING SYSTEM");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        usernameField = new TextField();
        usernameField.setPromptText("Username");

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Login");

        messageLabel = new Label();

        loginButton.setOnAction(e -> {
            new LoginController(this).login(
                usernameField.getText(),
                passwordField.getText()
            );
        });

        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(30));
        layout.getChildren().addAll(
            title, usernameField, passwordField,
            loginButton, messageLabel
        );

        Scene scene = new Scene(layout, 400, 350);

        stage.setTitle("Banking System");
        stage.setScene(scene);
        stage.show();
    }

    public void showMessage(String message) {
        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

