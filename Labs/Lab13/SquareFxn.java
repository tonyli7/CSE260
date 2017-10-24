import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;

public class SquareFxn extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

	// Create a pane to hold the circle
	Pane pane = new Pane();

	Polyline polyline = new Polyline();
	ObservableList list = polyline.getPoints();
	double scaleFactor = 0.0125;
	for (int x = -100; x <= 100; x++) {
	    list.add(x + 200.0);
	    list.add(-scaleFactor * x * x + 200);
	}
	pane.getChildren().add(polyline);
	// Create a scene and place it in the stage
	Scene scene = new Scene(pane, 400, 400);
	primaryStage.setTitle("ShowCircle"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
    }
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    /*
    public static void main(String[] args) {
	launch(args);
    }
    */

}
