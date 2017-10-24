import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.*;
import javafx.scene.paint.Color;

import java.util.Random;
public class CircleDist extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

	// Create a pane to hold the circle
	Pane pane = new Pane();

	// RNG

	Random rand = new Random();
	int randx = rand.nextInt(370) + 15;
	int randy = rand.nextInt(370) + 15;
	
	// Create Circle1 and set its properties
	Circle circle1 = new Circle();
	circle1.setCenterX(randx);
	circle1.setCenterY(randy);

	circle1.setRadius(15);
	circle1.setStroke(Color.BLACK);
	circle1.setFill(null);
	pane.getChildren().add(circle1);

	// Circle2
	int randx_0 = rand.nextInt(370) + 15;
	int randy_0 = rand.nextInt(370) + 15;
	Circle circle2 = new Circle();
	circle2.setCenterX(randx_0);
	circle2.setCenterY(randy_0);

	circle2.setRadius(15);
	circle2.setStroke(Color.BLACK);
	circle2.setFill(null);
	pane.getChildren().add(circle2);

	// Create Line
	Line line = new Line();
	line.setStartX(randx);
	line.setStartY(randy);
	line.setEndX(randx_0);
	line.setEndY(randy_0);
	pane.getChildren().add(line);

	// Display distance
	Text t = new Text((randx + randx_0) / 2.0, (randy + randy_0) / 2.0, ""+ Math.sqrt((randx - randx_0) * (randx - randx_0) + (randy - randy_0)*(randy - randy_0)));
	t.setFont(new Font(15));
	pane.getChildren().add(t);
    
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
    public static void main(String[] args) {
	launch(args);
    }
}
