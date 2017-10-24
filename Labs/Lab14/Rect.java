import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

import java.util.Random;
public class Rect extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

	// Create a pane to hold the circle
	Pane pane = new Pane();

	// Textfield
	GridPane inputs = new GridPane();
	//inputs.setAlignment(Pos.CENTER);
	
	TextField xcor = new TextField();
	TextField ycor = new TextField();

	TextField width_in = new TextField();
	TextField height_in = new TextField();
	
	Button submit = new Button("Make Rectangle.");

	inputs.add(xcor, 0, 0);
	inputs.add(ycor, 0, 1);
	inputs.add(width_in, 1, 0);
	inputs.add(height_in, 1, 1);
	
	inputs.add(submit, 0, 2);
	//pane.getChildren().add(inputs);
	submit.setOnAction(e->{
		Double xval = Double.valueOf(xcor.getText());
		Double yval = Double.valueOf(ycor.getText());

		Double width = Double.valueOf(width_in.getText());
		Double height = Double.valueOf(height_in.getText());
		
		
		Rectangle rect = new Rectangle();
		rect.setX(xval - width/2);
		rect.setY(yval - height/2);
		rect.setWidth(width);
		rect.setHeight(height);
	       
		pane.getChildren().add(rect);
	    });
	
	// Create a scene and place it in the stage
	Scene scene = new Scene(pane, 400, 400);
	primaryStage.setTitle("Rectangles"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage

	Stage secondStage = new Stage();
	secondStage.setScene(new Scene(inputs, 300, 200));
	secondStage.show();
    }
}
