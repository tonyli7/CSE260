import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import java.util.ArrayList;
public class BoundRect extends Application {
    @Override
    public void start(Stage primaryStage) {
	Pane pane = new Pane();

	ArrayList<Double[]> cors = new ArrayList<Double[]>();

	Double[] vals = getVals(cors);
	Rectangle rect = new Rectangle(vals[0], vals[1], vals[2], vals[3]);
	

	rect.setFill(Color.TRANSPARENT);
	rect.setStroke(Color.BLACK);


	
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
				//pane.getChildren().remove(rect);
				Double[] new_vals = getVals(cors);
				rect.setX(new_vals[0]);
				rect.setY(new_vals[1]);
				rect.setWidth(new_vals[2]);
				rect.setHeight(new_vals[3]);
				
			    }
			    
			});
		    Double[] new_vals = getVals(cors);
		    rect.setX(new_vals[0]);
		    rect.setY(new_vals[1]);
		    rect.setWidth(new_vals[2]);
		    rect.setHeight(new_vals[3]);
		    pane.getChildren().add(circle);  
		}	
	    });

	pane.getChildren().add(rect);
	Scene scene = new Scene(pane, 400, 400);
	primaryStage.setTitle("MouseEventDemo");
	primaryStage.setScene(scene);
	primaryStage.show();
    }

    public Double[] getVals(ArrayList<Double[]> cors){

	if (cors.size() == 0){
	    Double[] blah = {0.0,0.0, 400.0, 400.0};
	    return blah;
	}
	
	
	double minX = cors.get(0)[0];
	double minY = cors.get(0)[1];
	double maxX = cors.get(0)[0];
	double maxY = cors.get(0)[1];
	
	for (int i = 0; i < cors.size(); i++){
	    // [x,y]
	    Double[] temp = cors.get(i);
	    if (temp[0] > maxX){
		maxX = temp[0];
	    }

	    if (temp[0] < minX){
		minX = temp[0];
	    }
	    if (temp[1] > maxY){
		maxY = temp[1];
	    }

	    if (temp[1] < minY){
		minY = temp[1];
	    }
	}

	Double[] ans = {minX - 10, minY - 10, maxX - minX + 20, maxY - minY + 20};
	return ans;
    }
    
}
