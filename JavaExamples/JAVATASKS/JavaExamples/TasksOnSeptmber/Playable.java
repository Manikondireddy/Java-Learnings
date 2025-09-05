package JavaExamples.TasksOnSeptmber;

public interface Playable {
    void play();
}
    class MusicPlayer implements Playable{
        @Override
        public void play() {
            System.out.println( "music is started");
        }
        
    }

class VideoPlayer implements Playable{
    @Override
    public void play()
    {
        System.out.println("Video is playing");
    }
}
class Onam
{
    public static void main(String[] args) {
        Playable p1= new MusicPlayer();
        Playable p2= new VideoPlayer();
        p1.play();
        p2.play();
    }
}

    


    

    

