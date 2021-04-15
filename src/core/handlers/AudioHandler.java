package core.handlers;
import javafx.scene.media.*;

public class AudioHandler {
	AudioClip sfx;
	MediaPlayer mp;
	MediaView mv;
	
	public void mph(String path, double vol) {
		mp = new MediaPlayer(new Media(getClass().getClassLoader().getResource(path).toString()));
		mv = new MediaView(mp);
		
		mp.setCycleCount(MediaPlayer.INDEFINITE);
		mp.play();
	}
}
