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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
public class Traffic extends Application {
    @Override
    public void start(Stage primaryStage) {
	HBox pane = new HBox();
 
	RadioButton red_op = new RadioButton("RED");
	RadioButton green_op = new RadioButton("GREEN");
	RadioButton yellow_op = new RadioButton("YELLOW");
	
	ToggleGroup group = new ToggleGroup();


	red_op.setToggleGroup(group);
	green_op.setToggleGroup(group);
	yellow_op.setToggleGroup(group);


	// circle
	Circle circle1 = new Circle(125, 40, 25);
	circle1.setFill(Color.WHITE);
	circle1.setStroke(Color.BLACK);
	Circle circle2 = new Circle(125, 90, 25);
	circle2.setFill(Color.WHITE);
	circle2.setStroke(Color.BLACK);
	Circle circle3 = new Circle(125, 140, 25);
	circle3.setFill(Color.WHITE);
	circle3.setStroke(Color.BLACK);

	
	
	red_op.setOnAction(e -> {
		if (red_op.isSelected()){
		    circle1.setFill(Color.RED);
		    circle2.setFill(Color.WHITE);
		    circle3.setFill(Color.WHITE);
		    
		}
	    });
	green_op.setOnAction(e -> {
		if (green_op.isSelected()){
		    circle2.setFill(Color.GREEN);
		    circle1.setFill(Color.WHITE);
		    circle3.setFill(Color.WHITE);
		}
	    });
	yellow_op.setOnAction(e -> {
		if (yellow_op.isSelected()){
		    circle3.setFill(Color.YELLOW);
		    circle2.setFill(Color.WHITE);
		    circle1.setFill(Color.WHITE);
		}
	    });
	
	
	pane.getChildren().addAll(red_op, green_op, yellow_op, circle1, circle2, circle3);


	
	Scene scene = new Scene(pane, 250, 200);
	primaryStage.setTitle("PathTransitionDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
}

