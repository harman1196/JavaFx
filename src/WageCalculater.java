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
public class WageCalculater extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Label name = new Label("Emter name");
		TextField nameText = new TextField();
		Label hour = new Label("Emter hour worked");
		TextField hourText = new TextField();
		Label rate = new Label("Enter hour rate");
		TextField rateText = new TextField();
		Label result = new Label();
		Button button = new Button("calculate");
		
		 button.setOnAction(new EventHandler<ActionEvent>() {
		        @Override
		        public void handle(ActionEvent e) {
		            // Logic for what should happen when you push button
		        	double ghanta =Double.parseDouble(hourText.getText()) *Double.parseDouble(rateText.getText()) ;
		  result.setText(nameText.getText()+" earned "+ghanta);
		        }
		    });
		   VBox root = new VBox(); 
		    root.setSpacing(10);
		    root.getChildren().add(name);
		    root.getChildren().add(nameText);
		    root.getChildren().add(hour);
		    root.getChildren().add(hourText); 
		    root.getChildren().add(rate);
		    root.getChildren().add(rateText); 
		     root.getChildren().add(button);
		    root.getChildren().add(result);
		    Scene scene = new Scene(root, 300, 250);
		    
		    primaryStage.setScene(scene);
		    primaryStage.setTitle("example");
		    primaryStage.show();
		    
		    
		
		
	}

	
	
		
	
	
	
}
