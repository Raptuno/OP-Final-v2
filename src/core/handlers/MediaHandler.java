package core.handlers;
import javafx.scene.media.*;
import java.io.*;

public class MediaHandler {
	//Declaración del AudioClip
	AudioClip sfx;
	
	//Declaración de los MediaPlayers
	public MediaPlayer menuC = new MediaPlayer (new Media(getClass().getClassLoader().getResource("menuLoop.mp3").toString()));
	MediaPlayer creditsM = new MediaPlayer (new Media(getClass().getClassLoader().getResource("credits.mp3").toString()));
	
	//Declaración del MediaView universal
	MediaView mv = new MediaView();
	
	
}
