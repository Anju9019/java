public class ProjectorRunner {

    public static void main(String[] Projector) {
        System.out.println("Main is started");
        Projector.onOrOff();          
        Projector.increaseVolume();  
        Projector.increaseVolume();   
        Projector.increaseVolume(); 
        Projector.increaseVolume();   
        Projector.onOrOff();          
        Projector.increaseVolume();  
        Projector.onOrOff();          
        Projector.decreaseVolume();   
        Projector.decreaseVolume();   

        System.out.println("Main is ended");
    }
}
