package JFXTest;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SFXTest extends Application{
	private static String[] agrs;
	private SimpleAudioPlayer audioPlayer;
	    public static void main(String[] args)  {
	    	agrs=args;
	    	launch(args);
	    }
	    public void start(Stage stagePrimal) {
	    	Button button = new Button();
	    	Button button2 = new Button();
	    	int i=0;
	    	button.setLayoutX(0);
	    	button.setLayoutY(0);	    	
	    	button2.setLayoutX(50);
	    	button2.setLayoutY(0);
	    	button.setText("Josh");
	    	button2.setText("rick");

	    	
	    	
			stagePrimal.setWidth(1368);
			stagePrimal.setHeight(1024);
			Group groupeMenu = new Group();
			Scene menu = new Scene(groupeMenu);
			groupeMenu.setAutoSizeChildren(true);
			groupeMenu.getChildren().add(button);
			groupeMenu.getChildren().add(button2);
			menu.setFill(Color. rgb(8,75,65,1));
			//SimpleAudioPlayer.filePath = "Audio/rick.wav"; 

				

	        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 	
	    			SimpleAudioPlayer.filePath = "Audio/Josh_Hutcherson_Whistle.wav"; 
	    			//SimpleAudioPlayer.filePath = "Audio/rick.wav"; 
	    			try {
	    				audioPlayer.stop();
	    				audioPlayer = new SimpleAudioPlayer();
	    				audioPlayer.play();
	    			} catch (Exception aa) {
	    				System.out.println(aa.getMessage());
	    			}

	            } 
	        };
	        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 	
	    			//SimpleAudioPlayer.filePath = "Audio/Josh_Hutcherson_Whistle.wav"; 
	    			SimpleAudioPlayer.filePath = "Audio/rick.wav"; 
	    			try {
	    				audioPlayer.stop();
	    				audioPlayer = new SimpleAudioPlayer();
	    				audioPlayer.play();
	    			} catch (Exception aa) {
	    				System.out.println(aa.getMessage());
	    			}

	            } 
	        };
	        button.setOnAction(event2);
	        button2.setOnAction(event);


			stagePrimal.setScene(menu);
			stagePrimal.show();
	    }
	}