package JavaExamples.TasksOnWed;
 interface Playable{
    void play();

 }
 class MusicPlayer implements Playable
 {
    @Override
    public  void play()
    {
        System.out.println("Music started");
    }
    
 }
 class Videoplayer implements Playable
 {
    @Override
    public void play()
    {
        System.out.println("videoplayer started");
    }
    
 } 

    


public class Run {
    public static void main(String[] args) {
     Playable p = new MusicPlayer();
     Playable p1= new Videoplayer();
     p.play();
     p1.play();
     
     

     
        
      }
        
      
        
      }
    
    

