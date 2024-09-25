package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        // Play mp3 file
        audioPlayer.play("mp3", "song.mp3");

        // Play mp4 file
        audioPlayer.play("mp4", "video.mp4");

        // Try to play an unsupported format
        audioPlayer.play("vlc", "movie.vlc");
    }
}
