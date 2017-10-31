import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Circle;
import javafx.collections.ObservableList;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
public class SinBall extends Application {
    @Override
    public void start(Stage primaryStage) {
	Pane pane = new Pane();
	//Rectangle rectangle = new Rectangle(0, 0, 25, 50);
	//rectangle.setFill(Color.ORANGE);
	int xval = -200;
	double yval = 100 - 50 * Math.sin((-170 / 100.0) * 2 * Math.PI);
	Circle circle = new Circle(xval+200, yval, 10);
	circle.setFill(Color.RED);
	circle.setStroke(Color.BLACK);
	pane.getChildren().addAll(circle);

	Polyline polyline = new Polyline();
	ObservableList list = polyline.getPoints();
	double scaleFactor = 50;
	for (int x = xval; x <= 60; x++) {
	    list.add(x + 200.0);
	    list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
	}

	pane.getChildren().add(polyline);
	// Create a path transition
	
	PathTransition pt = new PathTransition();
	pt.setDuration(Duration.millis(3000));
	pt.setPath(polyline);
	pt.setNode(circle);
	//pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pt.setCycleCount(Timeline.INDEFINITE);
	//pt.setAutoReverse(true);
	pt.play(); // Start animation
	pane.setOnMousePressed(e -> pt.pause());
	pane.setOnMouseReleased(e -> pt.play());
	Scene scene = new Scene(pane, 250, 200);
	primaryStage.setTitle("PathTransitionDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
}
