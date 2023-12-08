package JFXTest;





import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

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
	    	button.setLayoutX(0);
	    	button.setLayoutY(0);	    	
	    	button2.setLayoutX(50);
	    	button2.setLayoutY(0);
	    	button.setText("Josh");
	    	button2.setText("rick");
	    	Button button3 = new Button();
	    	Button button4 = new Button();
	    	button3.setLayoutX(100);
	    	button3.setLayoutY(0);	    	
	    	button4.setLayoutX(200);
	    	button4.setLayoutY(0);
	    	button3.setText("depardieu");
	    	button4.setText("par");
	    	
	    	
			stagePrimal.setWidth(1368);
			stagePrimal.setHeight(1024);
			Group groupeMenu = new Group();
			Scene menu = new Scene(groupeMenu);
			groupeMenu.setAutoSizeChildren(true);
			groupeMenu.getChildren().add(button);
			groupeMenu.getChildren().add(button2);
			groupeMenu.getChildren().add(button3);
			groupeMenu.getChildren().add(button4);
			menu.setFill(Color. rgb(8,75,65,1));
			SimpleAudioPlayer.filePath = "Audio/meat.wav"; //défaut
			try {
			audioPlayer = new SimpleAudioPlayer();
			audioPlayer.play();
	        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 	
	    			SimpleAudioPlayer.filePath = "Audio/Josh_Hutcherson_Whistle.wav"; 
	    			//SimpleAudioPlayer.filePath = "Audio/rick.wav"; 
	    			try {
						audioPlayer.restart();
					} catch (Exception geee) {
						System.out.println(geee.getMessage());
					}

	            } 
	        };
	        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 	
	    			//SimpleAudioPlayer.filePath = "Audio/Josh_Hutcherson_Whistle.wav"; 
	    			SimpleAudioPlayer.filePath = "Audio/rick.wav"; 
	    			try {
						audioPlayer.restart();
					} catch (Exception geee) {
						System.out.println(geee.getMessage());
					}

	            } 
	        };
	        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 	
	    			SimpleAudioPlayer.filePath = "Audio/depardieu.wav"; 
	    			//SimpleAudioPlayer.filePath = "Audio/rick.wav"; 
	    			try {
						audioPlayer.restart();
					} catch (Exception geee) {
						System.out.println(geee.getMessage());
					}

	            } 
	        };
	        EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 	
	    			//SimpleAudioPlayer.filePath = "Audio/Josh_Hutcherson_Whistle.wav"; 
	    			SimpleAudioPlayer.filePath = "Audio/par.wav"; 
	    			try {
						audioPlayer.restart();
					} catch (Exception geee) {
						System.out.println(geee.getMessage());
					}

	            } 
	        };

	        button.setOnAction(event2);
	        button2.setOnAction(event);	        
	        button4.setOnAction(event4);
	        button3.setOnAction(event3);


			stagePrimal.setScene(menu);
			stagePrimal.show();
			} catch (Exception aa) {
				System.out.println(aa.getMessage());
			}
	    }
	}