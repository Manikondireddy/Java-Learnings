package JavaExamples.Monday;
interface Playable
{
    void play();
}
class MusicPlayer implements Playable{
    @Override
    public void play()
    {
        System.out.println("Music player plays music verywell");
    }
}
class VideoPLayer implements Playable{
    @Override
    public void play()
    {
        System.out.println("videoplay create videos very well :");
    }
}

public class Dance {
    public static void main(String[] args) {
        Playable v= new MusicPlayer();
        Playable v1= new VideoPLayer();
        v.play();
        v1.play();
    }
    
}
