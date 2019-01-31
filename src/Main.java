import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {
    private Button button;
    private Label nameLabel;
    private TextField nameTextField;
    private Label passwordLabel;
    private PasswordField passwordField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        button = new Button("Enter");
        nameLabel = new Label("Name");
        passwordLabel = new Label("Password");
        nameTextField = new TextField();
        passwordField = new PasswordField();

        button.setOnAction(this);

        VBox layout = new VBox();
        layout.getChildren().add(nameLabel);
        layout.getChildren().add(nameTextField);
        layout.getChildren().add(passwordLabel);
        layout.getChildren().add(passwordField);
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button){
            System.out.println(nameTextField.getCharacters() + " " + passwordField.getCharacters());
        }
    }
}
