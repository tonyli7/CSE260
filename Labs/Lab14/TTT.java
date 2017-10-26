import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import java.util.Random;


public class TTT extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

	// Create a pane to hold the circle
	GridPane boardUI = new GridPane();
	// Construct buttons
	Button[][] board = new Button[3][3];
	for (int x = 0; x < 3; x++){
	    for (int y = 0; y < 3; y++){
		Button cell = new Button("  ");
		board[x][y] = cell;
		cell.setStyle("-fx-font-size: 40;");
		cell.setMinWidth(50);
		boardUI.add(cell, x, y);
		cell.setOnAction(e->{
			if (cell.getText().equals("  ")){
			    cell.setText("X");
			    if (!victory(board).equals("None")){
				System.out.println(victory(board) + " wins!");
				
			    }
			}
		    });
		
	    }
	}

	
	
	// Create a scene and place it in the stage
	Scene scene = new Scene(boardUI, 300, 300);
	primaryStage.setTitle("Tic Tac Toe"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage

    }

    public String victory(Button[][] board){
	for (int x = 0; x < 3; x++){
	    if (board[x][0].getText().equals(board[x][1].getText()) &&
		board[x][1].getText().equals(board[x][2].getText()) &&
		!board[x][0].getText().equals("  ")){
		return board[x][0].getText();
	    }

	    if (board[0][x].getText().equals(board[1][x].getText()) &&
		board[1][x].getText().equals(board[2][x].getText()) &&
		!board[x][0].getText().equals("  ")){
		return board[0][x].getText();
	    }
	}

	if (board[0][0].getText().equals(board[1][1].getText()) &&
		board[1][1].getText().equals(board[2][2].getText()) &&
		!board[0][0].getText().equals("  ")){
		return board[0][0].getText();
	}

	if (board[0][2].getText().equals(board[1][1].getText()) &&
		board[1][1].getText().equals(board[2][0].getText()) &&
		!board[0][2].getText().equals("  ")){
		return board[0][2].getText();
	}
	
	return "None";
	    
	    
    }
    
}


