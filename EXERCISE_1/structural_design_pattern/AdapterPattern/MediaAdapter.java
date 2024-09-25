package AdapterPattern;

public class MediaAdapter implements MediaPlayer {
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp4")) {
            System.out.println("Playing mp4 file: " + fileName);
        }
    }
}
