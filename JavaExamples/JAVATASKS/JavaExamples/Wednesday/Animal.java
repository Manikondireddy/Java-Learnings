package JavaExamples.Wednesday;
interface Playable
{
    void play();

}
class VideoPlayer implements Playable{
    @Override
    public void play()
    {
        System.out.println("started vedio player ");
    }

}
class Audioplayer implements Playable{
    @Override
    public void play()
    {
        System.out.println("audio started ");
    }
}

public class Animal {
    public static void main(String[] args) {
        Playable k= new Audioplayer();
        Playable k1= new VideoPlayer();
        k.play();
        k1.play();
    }

    
}
