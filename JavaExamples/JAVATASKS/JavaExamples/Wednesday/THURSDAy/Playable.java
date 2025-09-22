package JavaExamples.Wednesday.THURSDAy;

public interface  Playable {
    void play();
}
class MusicPlayer implements Playable
{
    @Override
    public void play()
    {
        System.out.println("listening music good for mind");
    }

}
class VideoPlayer implements Playable{
    @Override
    public void play()
    {
        System.out.println("playing videos is good fo exercise");
    }
    public static void main(String[] args) {
        Playable w= new MusicPlayer();
        Playable w1= new VideoPlayer();
        w.play();
        w1.play();
    }
}


    

