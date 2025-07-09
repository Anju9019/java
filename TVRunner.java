public class TVRunner {

    public static void main(String[] args) {
        System.out.println("Main is started");
        TV.onOrOff();            
        TV.increaseVolume();     
        TV.increaseVolume();     
        TV.decreaseVolume();   
        TV.onOrOff();            
        TV.increaseVolume();    
        System.out.println("Main is ended");
    }
}
