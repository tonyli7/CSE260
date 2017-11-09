import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import java.util.concurrent.*;
public class BounceBallControl extends Application {
    @Override
    public void start(Stage primaryStage) {

	ExecutorService executor = Executors.newFixedThreadPool(2);


	BallPane ballPane = new BallPane(); // Create a ball pane
	// Pause and resume animation
	ballPane1.setOnMousePressed(e -> ballPane.pause());
	ballPane1.setOnMouseReleased(e -> ballPane.play());
	// Increase and decrease animation
	ballPane1.setOnKeyPressed(e -> {
		if (e.getCode() == KeyCode.UP) {
		    ballPane.increaseSpeed();
		} else if (e.getCode() == KeyCode.DOWN) {
		    ballPane.decreaseSpeed();
		}
	    });


	
	executor.execute(ballPane1);
	executor.execute(ballPane2);
	executor.shutdown();
	Scene scene = new Scene(ballPane1, 250, 150);
	primaryStage.setTitle("BounceBallControl");
	primaryStage.setScene(scene);
	primaryStage.show();
	// Must request focus after the primary stage is displayed
	ballPane.requestFocus();
    }
  
}
