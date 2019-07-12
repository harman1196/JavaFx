import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Intro extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// create and configure user interface controls
		
    Label namehead = new Label("Enter your name");
    Label result = new Label();
    TextField nameText= new TextField();
    Button button = new Button();
    button.setText("click me");
    button.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            // Logic for what should happen when you push button
  result.setText(nameText.getText());
        }
    });
    
    
    //Make a layout manager
    VBox root = new VBox(); 
    root.setSpacing(10);
  		//Add controls to the layout manager
    root.getChildren().add(namehead);
    root.getChildren().add(nameText);
    root.getChildren().add(button);
    root.getChildren().add(result);
       //add layout manager to scene
    Scene scene = new Scene(root, 300, 250);
  		//add scene to a stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("example");
   
    
    
  		//show the app
  		primaryStage.show();
	}
	
}
