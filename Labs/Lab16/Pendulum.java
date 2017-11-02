import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.collections.ObservableList;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
public class Pendulum extends Application {
    @Override
    public void start(Stage primaryStage) {
	Pane pane = new Pane();
	// circle
	Circle circle = new Circle(0, 20, 10);
	circle.setFill(Color.RED);
	circle.setStroke(Color.BLACK);
	pane.getChildren().addAll(circle);

	// string

	Line line = new Line(100, 100, 25, -.0070 * 10000 + 150);
	DoubleProperty startx = new SimpleDoubleProperty(100);
	DoubleProperty starty = new SimpleDoubleProperty(100);

	line.startXProperty().bind(startx);
	line.startYProperty().bind(starty);
	pane.getChildren().add(line);

	// path
	Polyline polyline = new Polyline();
	ObservableList list = polyline.getPoints();
	double scaleFactor = 0.0065;
	for (double x = .15*Math.PI; x <= .85*Math.PI; x += 0.01) {
	    list.add(60*(Math.cos(x)) + 100);
	    list.add(60*(Math.sin(x)) + 100);
	}
	pane.getChildren().add(polyline);
	// Create a path transition
	
	PathTransition pt = new PathTransition();
	pt.setDuration(Duration.millis(3000));
	pt.setPath(polyline);
	pt.setNode(circle);
	//pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pt.setCycleCount(Timeline.INDEFINITE);
	pt.setAutoReverse(true);
	pt.play(); // Start animation

	PathTransition pt2 = new PathTransition();
	pt2.setDuration(Duration.millis(3000));
	pt2.setPath(polyline);
	pt2.setNode(line);
	pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pt2.setCycleCount(Timeline.INDEFINITE);
	pt2.setAutoReverse(true);
	pt2.play(); // Start animation
	
	pane.setOnMousePressed(e -> {
		pt.pause();
		pt2.pause();
		    });
	pane.setOnMouseReleased(e -> {
		pt.play();
		pt2.play();
		    });
	Scene scene = new Scene(pane, 250, 200);
	primaryStage.setTitle("PathTransitionDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
}
