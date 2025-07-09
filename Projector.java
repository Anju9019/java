public class Projector {
    static int minVolume = 0;
    static int currentVolume = 3; 
    static boolean isConnected = false;
    static int maxVolume = 7;
    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Projector is turned on");
        } else {
            isConnected = false;
            System.out.println("Projector is turned Off");
        }
    }
    public static void increaseVolume() {
        System.out.println("Trying to increase volume");

        if (isConnected) {
            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Current volume is: " + currentVolume);
            } else {
                System.out.println("Max volume reached.");
            }
        } else {
            System.out.println("Projector is OFF! Please turn it on first");
        }
    }

    
