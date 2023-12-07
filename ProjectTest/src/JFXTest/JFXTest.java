package JFXTest;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javafx.scene.media.*;
import java.io.*;

public class JFXTest {
	public static void main(String[] args) throws LineUnavailableException {
	    System.out.println("debut");
	    byte[] buf = new byte[2];
	    int frequency = 1975; //44100 sample points per 1 second
	    AudioFormat af = new AudioFormat((float) frequency, 16, 1, true, false);
	    SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
	    sdl.open();
	    sdl.start();
	    int durationMs = 200;
	    int numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 1975 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    
	    frequency=2217;
	    sdl.open();
	    sdl.start();
	    durationMs = 200;
	    numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 2217 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    
	    frequency=2349;
	    sdl.open();
	    sdl.start();
	    durationMs = 200;
	    numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 2349 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    
	    
	    frequency=2349;
	    sdl.open();
	    sdl.start();
	    durationMs = 200;
	    numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 2349 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    
	    frequency=5274;
	    sdl.open();
	    sdl.start();
	    durationMs = 200;
	    numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 5274 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    
	    frequency=2217;
	    sdl.open();
	    sdl.start();
	    durationMs = 200;
	    numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 2217 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    
	    frequency=5274;
	    sdl.open();
	    sdl.start();
	    durationMs = 200;
	    numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 5274 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    
	    frequency=3520;
	    sdl.open();
	    sdl.start();
	    durationMs = 200;
	    numberOfTimesFullSinFuncPerSec = 441; //number of times in 1sec sin function repeats
	    for (int i = 0; i < durationMs * (float) 3520 / 1000; i++) { //1000 ms in 1 second
	      float numberOfSamplesToRepresentFullSin= (float) frequency / numberOfTimesFullSinFuncPerSec;
	      double angle = i / (numberOfSamplesToRepresentFullSin/ 2.0) * Math.PI;  // /divide with 2 since sin goes 0PI to 2PI
	      short a = (short) (Math.sin(angle) * 32767);  //32767 - max value for sample to take (-32767 to 32767)
	      buf[0] = (byte) (a & 0xFF); //write 8bits ________WWWWWWWW out of 16
	      buf[1] = (byte) (a >> 8); //write 8bits WWWWWWWW________ out of 16
	      sdl.write(buf, 0, 2);
	    }
	    sdl.drain();
	    sdl.stop();
	    /*String audioFilePath = "rick.mp3";
	    
	    try {
	        com.sun.javafx.application.PlatformImpl.startup(() -> {});
	        Media media = new Media(new File(audioFilePath).toURI().toString());
	        MediaPlayer mp3Player = new MediaPlayer(media);
	        mp3Player.play();
	    } catch (Exception ex) {
	        System.out.println("Error occured during playback process:" + ex.getMessage());
	    }*/
	  }
}

