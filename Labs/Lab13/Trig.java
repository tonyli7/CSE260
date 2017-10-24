import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Line;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;

public class Trig extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

	// Create a pane to hold the circle
	Pane pane = new Pane();

	Line y_axis = new Line();

	y_axis.setStartX(30);
	y_axis.setStartY(400);
	y_axis.setEndX(30);
	y_axis.setEndY(0);
	
	Polyline polyline = new Polyline();
	ObservableList list = polyline.getPoints();
	double scaleFactor = 50;
	for (int x = -170; x <= 170; x++) {
	    list.add(x + 200.0);
	    list.add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
	}

	polyline.setStroke(Color.BLUE);


	Polyline polyline0 = new Polyline();
	ObservableList list0 = polyline0.getPoints();
	
	for (int x = -100; x <= 240; x++) {
	    list0.add(x + 200.0 - 70);
	    list0.add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI) + 200);
	}

	polyline0.setStroke(Color.RED);
	
	pane.getChildren().add(polyline);
	pane.getChildren().add(polyline0);
	pane.getChildren().add(y_axis);
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
