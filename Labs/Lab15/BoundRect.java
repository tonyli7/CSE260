import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseButton;
import java.util.ArrayList;
public class BoundRect extends Application {
    @Override
    public void start(Stage primaryStage) {
	Pane pane = new Pane();

	ArrayList<Double[]> cors = new ArrayList<Double[]>();

	pane.setOnMouseClicked(e -> {
		if (e.getButton() == MouseButton.PRIMARY){
		    Circle circle = new Circle(e.getX(), e.getY(), 10);
		    Double[] xy = {e.getX(), e.getY()};
		    //System.out.println(e.getX());
		    cors.add(xy);
		    circle.setOnMouseClicked(f ->{
			    if (f.getButton() == MouseButton.SECONDARY){
				Double[] temp = {circle.getCenterX(), circle.getCenterY()};
				//System.out.println(circle.getCenterX());
				cors.remove(temp);
				pane.getChildren().remove(circle);
				
			    }
			    
			});
		    pane.getChildren().addAll(circle);
		}
		
	    });
	Scene scene = new Scene(pane, 400, 400);
	primaryStage.setTitle("MouseEventDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
}
