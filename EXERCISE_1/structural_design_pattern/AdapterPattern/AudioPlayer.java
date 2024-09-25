package AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (audioType.equals("mp4")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }
    }
}