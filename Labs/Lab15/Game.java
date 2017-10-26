import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;

import java.util.Random;
public class Game extends Application {
    @Override
    public void start(Stage primaryStage) {
	Pane pane = new Pane();

	Random rand = new Random();
	double randX = rand.nextInt(400);
	double randY = rand.nextInt(400);
	
	Circle circle = new Circle(randX, randY, 10);
	int num = 0;
	circle.setFill(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
	circle.setOnMouseClicked(e -> {
		if (num < 20){
		    circle.setCenterX(rand.nextInt(400));
		    circle.setCenterY(rand.nextInt(400));
		    circle.setFill((double)rand.nextInt(255),(double)rand.nextInt(255),(double)rand.nextInt(255));
		    num++;
		}
	    });
	pane.getChildren().add(circle);
	Scene scene = new Scene(pane, 400, 400);
	primaryStage.setTitle("MouseEventDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
    }

   
    
}
